package com.lee.controller.admin;

import com.lee.common.DateTimeUtil;
import com.lee.entity.SysSupplierInfoModel;
import com.lee.entity.common.GenericResponse;
import com.lee.entity.common.ResponseFormat;
import com.lee.service.SupplierService;
import com.lee.service.WarehousingService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Api(value = "入库管理", description = "入库管理")
@RestController
@RequestMapping("/warehousing")
public class WarehousingController extends BasicController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());


    @Autowired
    SupplierService supplierService;

    @Autowired
    WarehousingService warehousingService;

    @RequestMapping(value = "findList", method = RequestMethod.GET)
    @ApiOperation(value = "入库单列表")
    public GenericResponse findList(
            @ApiParam(value = "入库单号") @RequestParam(required = false) String warehousingNum,
            @ApiParam(value = "采购单编号") @RequestParam(required = false) String purchaseNum,
            @ApiParam(value = "入库单编号") @RequestParam(required = false) String supplierNum,
            @ApiParam(value = "当前页面", required = true) @RequestParam Integer pageNo,
            @ApiParam(value = "每页记录数", required = true) @RequestParam Integer pageSize
    ) {
        Map<String, Object> searchParams = new HashMap<>();
        try {
            searchParams.put("warehousingNum", warehousingNum);
            searchParams.put("purchaseNum", purchaseNum);
            searchParams.put("supplierNum", supplierNum);
            searchParams.put("offsetIndex", pageNo);
            searchParams.put("limit", pageSize);
            return warehousingService.getPageInfo(searchParams);
        } catch (Exception e) {
            logger.error("查询入库单异常", e);
            return ResponseFormat.retParam(500, "查询入库单异常");
        }
    }

    @RequestMapping(value = "view", method = RequestMethod.GET)
    @ApiOperation(value = "入库单信息详情")
    public GenericResponse doView(@ApiParam(value = "入库单Id", required = true) @RequestParam Integer id) {
        try {
            SysSupplierInfoModel model = supplierService.getById(id);
            if (model == null) {
                return ResponseFormat.retParam(50001, "数据未找到");
            }
            return ResponseFormat.retParam(200, model);
        } catch (Exception e) {
            logger.error("查询入库单信息详情异常", e);
            return ResponseFormat.retParam(500, "查询入库单信息详情异常");
        }
    }


    @RequestMapping(value = "update", method = RequestMethod.POST)
    @ApiOperation(value = "修改入库单信息")
    public GenericResponse doUpdate(
            @ApiParam(value = "入库单Id", required = true) @RequestParam Integer id,
            @ApiParam(value = "入库单编号") @RequestParam(required = false) String supNum,
            @ApiParam(value = "入库单名称") @RequestParam(required = false) String supName,
            @ApiParam(value = "联系人") @RequestParam(required = false) String supContacts,
            @ApiParam(value = "联系电话") @RequestParam(required = false) String supTeleno,
            @ApiParam(value = "联系地址") @RequestParam(required = false) String supAddress,
            @ApiParam(value = "联系邮箱") @RequestParam(required = false) String supMail,
            @ApiParam(value = "银行账户") @RequestParam(required = false) String supAccountNumber,
            @ApiParam(value = "开户行") @RequestParam(required = false) String supBankName,
            @ApiParam(value = "备注") @RequestParam(required = false) String supRemark
    ) {
        try {
            if (supplierService.getById(id) == null) {
                return ResponseFormat.retParam(50001, "数据未找到");
            }
            SysSupplierInfoModel entity = new SysSupplierInfoModel();
            entity.setId(id);
            entity.setSupRemark(supRemark);
            entity.setSupTeleno(supTeleno);
            entity.setSupAddress(supAddress);
            entity.setSupName(supName);
            entity.setSupBankName(supBankName);
            entity.setSupMail(supMail);
            entity.setSupAccountNumber(supAccountNumber);
            entity.setSupContacts(supContacts);
            entity.setSupNum(supNum);
            entity.setUpdateTime(DateTimeUtil.nowTimeStr());
            supplierService.updateById(entity);
            return ResponseFormat.retParam(200, "入库单修改成功");
        } catch (Exception e) {
            logger.error("入库单修改异常", e);
            return ResponseFormat.retParam(500, "入库单修改异常");

        }
    }

}
