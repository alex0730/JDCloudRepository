package com.lee.controller.admin;


import com.alibaba.fastjson.JSONArray;
import com.lee.common.DateTimeUtil;
import com.lee.entity.*;
import com.lee.entity.common.GenericResponse;
import com.lee.entity.common.ResponseFormat;
import com.lee.service.PurchaseService;
import com.lee.service.WarehousingService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author lee
 * @since 2020-02-21
 */
@Api(value = "采购订单管理", description = "采购订单管理")
@RestController
@RequestMapping("/purchase")
public class PurchaseController extends BasicController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    PurchaseService purchaseService;

    @Autowired
    WarehousingService warehousingService;

    @PostMapping("findList")
    @ApiOperation(value = "采购订单列表")
    public GenericResponse findList(
            @ApiParam(value = "申购日期开始时间") @RequestParam(required = false) String purchaseStartDate,
            @ApiParam(value = "申购日期结束时间") @RequestParam(required = false) String purchaseEndDate,
            @ApiParam(value = "供应商Id") @RequestParam(required = false) String supplierNum,
            @ApiParam(value = "采购订单状态Id") @RequestParam(required = false) String purchaseType,
            @ApiParam(value = "采购订单最小金额") @RequestParam(required = false) String orderMinAmount,
            @ApiParam(value = "采购订单最大金额") @RequestParam(required = false) String orderMaxAmount,
            @ApiParam(value = "采购负责人") @RequestParam(required = false) String purchasePerson,
            @ApiParam(value = "资金类型Id") @RequestParam(required = false) String capitalType,
            @ApiParam(value = "采购物资编码Id") @RequestParam(required = false) String purchaseMatCode,
            @ApiParam(value = "采购依据Id") @RequestParam(required = false) String purchaseBasis,
            @ApiParam(value = "当前页面", required = true) @RequestParam Integer pageNo,
            @ApiParam(value = "每页记录数", required = true) @RequestParam Integer pageSize) {
        Map<String, Object> searchParams = new HashMap<>();
        try {
            searchParams.put("purchaseStartDate", purchaseStartDate);
            searchParams.put("purchaseEndDate", purchaseEndDate);
            searchParams.put("supplierNum", supplierNum);
            searchParams.put("purchaseType", purchaseType);
            searchParams.put("orderMinAmount", orderMinAmount);
            searchParams.put("orderMaxAmount", orderMaxAmount);
            searchParams.put("purchasePerson", purchasePerson);
            searchParams.put("capitalType", capitalType);
            searchParams.put("purchaseMatCode", purchaseMatCode);
            searchParams.put("purchaseBasis", purchaseBasis);
            searchParams.put("offsetIndex", pageNo);
            searchParams.put("limit", pageSize);
            return ResponseFormat.retParam(200, purchaseService.getPageInfo(searchParams));
        } catch (Exception e) {
            logger.error("查询采购订单列表异常", e);
            return ResponseFormat.retParam(500, "查询采购订单列表异常");
        }
    }

    @RequestMapping(value = "delete", method = RequestMethod.GET)
    @ApiOperation(value = "删除采购订单信息")
    public GenericResponse doDelete(@ApiParam(value = "采购订单信息Id", required = true) @RequestParam(value = "id") Integer id,
                                    @ApiParam(value = "采购订单编码", required = true) @RequestParam(value = "purchaseNum") String purchaseNum) {
        try {
            return purchaseService.delete(id, purchaseNum);
        } catch (Exception e) {
            logger.error("删除采购订单信息异常", e);
            return ResponseFormat.retParam(500, "删除采购订单信息异常");
        }
    }

    @RequestMapping(value = "view", method = RequestMethod.GET)
    @ApiOperation(value = "采购订单信息详情")
    @ResponseBody
    public GenericResponse doView(@ApiParam(value = "采购订单信息Id", required = true) @RequestParam(value = "id") Integer id) {
        try {
            return ResponseFormat.retParam(200, purchaseService.getPurchaseOrderInfo(id));
        } catch (Exception e) {
            logger.error("查询采购订单信息详情异常", e);
            return ResponseFormat.retParam(500, "查询采购订单信息详情异常");
        }
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    @ApiOperation(value = "修改采购订单信息")
    public GenericResponse doUpdate(
            @ApiParam(value = "采购订单Id", required = true) @RequestParam Integer id,
            @ApiParam(value = "采购订单编号", required = true) @RequestParam String purchaseNum,
            @ApiParam(value = "申购日期") @RequestParam(required = false) String purchaseDate,
            @ApiParam(value = "供应商编号") @RequestParam(required = false) String supplierNum,
            @ApiParam(value = "订单总金额") @RequestParam(required = false) String orderAmount,
            @ApiParam(value = "采购订单状态Id") @RequestParam(required = false) String purchaseType,
            @ApiParam(value = "采购负责人") @RequestParam(required = false) String purchasePerson,
            @ApiParam(value = "采购目的") @RequestParam(required = false) String purchasePurpose,
            @ApiParam(value = "合同签订时间") @RequestParam(required = false) String contractSigningDate,
            @ApiParam(value = "资金类型") @RequestParam(required = false) String capitalType,
            @ApiParam(value = "采购依据") @RequestParam(required = false) String purchaseBasis,
            @ApiParam(value = "采购订单物资信息列表") @RequestParam(required = false) String materials,
            @ApiParam(value = "采购订单物付款信息列表") @RequestParam(required = false) String payments,
            @ApiParam(value = "采购订单物资合同附件列表") @RequestParam(required = false) String hannexs,
            @ApiParam(value = "采购订单物资其他流程附件列表") @RequestParam(required = false) String oannexs) {
        try {
            PurchaseOrderInfoModel entity = new PurchaseOrderInfoModel();
            entity.setId(id);
            entity.setPurchaseNum(purchaseNum);
            entity.setPurchaseDate(purchaseDate);
            entity.setSupplierNum(supplierNum);
            entity.setOrderAmount(orderAmount);
            entity.setPurchaseType(purchaseType);
            entity.setPurchasePerson(purchasePerson);
            entity.setPurchasePurpose(purchasePurpose);
            entity.setContractSigningDate(contractSigningDate);
            entity.setCapitalType(capitalType);
            entity.setPurchaseBasis(purchaseBasis);
            purchaseService.update(entity, JSONArray.parseArray(materials, PurchaseMaterialInfoModel.class),
                    JSONArray.parseArray(payments, PurchasePaymentInfoModel.class),
                    JSONArray.parseArray(hannexs, PurchaseAnnexInfoModel.class),
                    JSONArray.parseArray(oannexs, PurchaseAnnexInfoModel.class));
            return ResponseFormat.retParam(200, "修改采购订单信息成功");
        } catch (Exception e) {
            logger.error("查询采购订单信息详情异常", e);
            return ResponseFormat.retParam(500, "修改采购订单信息异常");
        }
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    @ApiOperation(value = "新增采购订单信息")
    public GenericResponse doAdd(
            @ApiParam(value = "采购编号") @RequestParam String purchaseNum,
            @ApiParam(value = "申购日期") @RequestParam String purchaseDate,
            @ApiParam(value = "供应商编号") @RequestParam String supplierNum,
            @ApiParam(value = "订单总金额") @RequestParam String orderAmount,
            @ApiParam(value = "采购订单状态Id") @RequestParam String purchaseType,
            @ApiParam(value = "采购负责人") @RequestParam String purchasePerson,
            @ApiParam(value = "采购目的") @RequestParam String purchasePurpose,
            @ApiParam(value = "合同签订时间") @RequestParam String contractSigningDate,
            @ApiParam(value = "资金类型") @RequestParam String capitalType,
            @ApiParam(value = "采购依据") @RequestParam String purchaseBasis,
            @ApiParam(value = "采购订单物资信息列表") @RequestParam(required = false) String materials,
            @ApiParam(value = "采购订单物付款信息列表") @RequestParam(required = false) String payments,
            @ApiParam(value = "采购订单物资合同附件列表") @RequestParam(required = false) String hannexs,
            @ApiParam(value = "采购订单物资其他流程附件列表") @RequestParam(required = false) String oannexs) {
        try {
            PurchaseOrderInfoModel entity = new PurchaseOrderInfoModel();
            entity.setPurchaseNum(purchaseNum);
            entity.setPurchaseDate(purchaseDate);
            entity.setSupplierNum(supplierNum);
            entity.setOrderAmount(orderAmount);
            entity.setPurchaseType(purchaseType);
            entity.setPurchasePerson(purchasePerson);
            entity.setPurchasePurpose(purchasePurpose);
            entity.setContractSigningDate(contractSigningDate);
            entity.setCapitalType(capitalType);
            entity.setPurchaseBasis(purchaseBasis);
            entity.setCreateTime(DateTimeUtil.nowTimeStr());
            List<PurchaseMaterialInfoModel> purchaseMaterialInfoModels = JSONArray.parseArray(materials, PurchaseMaterialInfoModel.class);
            purchaseService.save(entity, purchaseMaterialInfoModels,
                    JSONArray.parseArray(payments, PurchasePaymentInfoModel.class),
                    JSONArray.parseArray(hannexs, PurchaseAnnexInfoModel.class),
                    JSONArray.parseArray(oannexs, PurchaseAnnexInfoModel.class));
            // 生成入库单
            if (!CollectionUtils.isEmpty(purchaseMaterialInfoModels)) {
                List<WarehousingInfoModel> warehousingInfoModels = new ArrayList<>();
                for (PurchaseMaterialInfoModel materialInfoModel : purchaseMaterialInfoModels) {
                    WarehousingInfoModel model = new WarehousingInfoModel();
                    // TODO 入库单号生成规则
                    model.setWarehousingNum("YJ20210915");
                    model.setPurchaseNum(purchaseNum);
                    model.setMatPurchaseNum(materialInfoModel.getPurchaseMatCode());
                    // TODO 入库单初始状态
                    model.setWarehousingStatus(0);
                    // TODO 入库目的和采购目的是否相同？如果不相同，那么来源是哪里？
                    model.setWarehousingPurpose(0);
                    model.setReceivableCount(materialInfoModel.getPurchaseMatNum());
                    model.setReceivedCount(0);
                    model.setAmountType(capitalType);
                    warehousingInfoModels.add(model);
                }
                warehousingService.saveBatch(warehousingInfoModels);
            }
            return ResponseFormat.retParam(200, "创建采购订单成功");
        } catch (Exception e) {
            logger.error("创建采购订单异常", e);
            return ResponseFormat.retParam(500, "创建采购订单异常");
        }
    }

}
