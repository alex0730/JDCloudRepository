package com.lee.controller.admin;


import com.lee.entity.common.GenericResponse;
import com.lee.entity.common.ResponseFormat;
import com.lee.service.PurchaseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
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
@Controller
@RequestMapping("/purchase")
public class PurchaseController extends BasicController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    PurchaseService purchaseService;

    @PostMapping("findList")
    @ApiOperation(value = "采购订单列表")
    @ResponseBody
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
    public GenericResponse doDelete(@ApiParam(value = "采购订单信息Id", required = true) @RequestParam(value = "id") Integer id) {
        try {
            purchaseService.removeById(id);
            return ResponseFormat.retParam(200, "删除采购订单信息成功");
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
            logger.error("删除采购订单信息异常", e);
            return ResponseFormat.retParam(500, "查询采购订单信息详情异常");
        }
    }

}
