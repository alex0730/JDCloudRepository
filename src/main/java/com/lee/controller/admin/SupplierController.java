package com.lee.controller.admin;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lee.common.DateTimeUtil;
import com.lee.common.ExcludeEmptyQueryWrapper;
import com.lee.entity.SysSupplierInfoModel;
import com.lee.entity.common.GenericResponse;
import com.lee.entity.common.ResponseFormat;
import com.lee.service.SupplierService;
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

@Api(value = "供应商管理", description = "供应商管理")
@RestController
@RequestMapping("/sys/supplier")
public class SupplierController extends BasicController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    SupplierService supplierService;

    @RequestMapping(value = "findList", method = RequestMethod.GET)
    @ApiOperation(value = "供应商列表")
    public GenericResponse findList(
            @ApiParam(value = "供应商编号") @RequestParam(required = false) String supNum,
            @ApiParam(value = "供应商名称") @RequestParam(required = false) String supName,
            @ApiParam(value = "联系人") @RequestParam(required = false) String supContacts,
            @ApiParam(value = "更新开始时间") @RequestParam(required = false) String updateTimeStart,
            @ApiParam(value = "更新结束时间") @RequestParam(required = false) String updateTimeEnd,
            @ApiParam(value = "当前页面", required = true) @RequestParam Integer pageNo,
            @ApiParam(value = "每页记录数", required = true) @RequestParam Integer pageSize
    ) {
        try {
            IPage<SysSupplierInfoModel> page = new Page<>();
            page.setCurrent(Long.valueOf(pageNo));
            page.setSize(Long.valueOf(pageSize));
            IPage<SysSupplierInfoModel> iPage = supplierService.page(page, new ExcludeEmptyQueryWrapper<SysSupplierInfoModel>()
                    .eq("sup_num", supNum)
                    .eq("sup_name", supName)
                    .eq("sup_contacts", supContacts)
                    .between("update_time", updateTimeStart, updateTimeEnd)
            );
            return ResponseFormat.retParam(200, iPage);
        } catch (Exception e) {
            logger.error("查询供应商异常", e);
            return ResponseFormat.retParam(500, "查询供应商异常");
        }
    }

    @RequestMapping(value = "view", method = RequestMethod.GET)
    @ApiOperation(value = "供应商信息详情")
    public GenericResponse doView(@ApiParam(value = "供应商Id", required = true) @RequestParam Integer id) {
        try {
            SysSupplierInfoModel model = supplierService.getById(id);
            if (model == null) {
                return ResponseFormat.retParam(50001, "数据未找到");
            }
            return ResponseFormat.retParam(200, model);
        } catch (Exception e) {
            logger.error("查询供应商信息详情异常", e);
            return ResponseFormat.retParam(500, "查询供应商信息详情异常");
        }
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    @ApiOperation(value = "添加供应商信息")
    public GenericResponse doAdd(@ApiParam(value = "供应商编号", required = true) @RequestParam String supNum,
                                 @ApiParam(value = "供应商名称", required = true) @RequestParam String supName,
                                 @ApiParam(value = "联系人", required = true) @RequestParam String supContacts,
                                 @ApiParam(value = "联系电话", required = true) @RequestParam String supTeleno,
                                 @ApiParam(value = "联系地址", required = true) @RequestParam String supAddress,
                                 @ApiParam(value = "联系邮箱", required = true) @RequestParam String supMail,
                                 @ApiParam(value = "银行账户", required = true) @RequestParam String supAccountNumber,
                                 @ApiParam(value = "开户行", required = true) @RequestParam String supBankName,
                                 @ApiParam(value = "备注", required = false) @RequestParam(required = false) String supRemark
    ) {
        try {
            if (supplierService.getOne(new ExcludeEmptyQueryWrapper<SysSupplierInfoModel>()
                    .eq("sup_num", supNum)) != null || supplierService.getOne(new ExcludeEmptyQueryWrapper<SysSupplierInfoModel>()
                    .eq("sup_name", supName)) != null) {
                return ResponseFormat.retParam(50003, "数据已存在");
            }
            SysSupplierInfoModel entity = new SysSupplierInfoModel();
            entity.setSupRemark(supRemark);
            entity.setSupTeleno(supTeleno);
            entity.setSupAddress(supAddress);
            entity.setSupName(supName);
            entity.setSupBankName(supBankName);
            entity.setSupMail(supMail);
            entity.setSupAccountNumber(supAccountNumber);
            entity.setSupContacts(supContacts);
            entity.setSupNum(supNum);
            entity.setCreateTime(DateTimeUtil.nowTimeStr());
            supplierService.save(entity);
            return ResponseFormat.retParam(200, "供应商创建成功");
        } catch (Exception e) {
            logger.error("创建供应商异常", e);
            return ResponseFormat.retParam(500, "创建供应商异常");
        }
    }

//    @RequestMapping(value = "delete", method = RequestMethod.POST)
//    @ApiOperation(value = "批量删除供应商信息")
//    public GenericResponse doDelete(@ApiParam(value = "供应商Id", required = true) @RequestParam(value = "ids") List<Integer> ids) {
//        try {
//            for (int id : ids) {
//                adminService.removeById(id);
//            }
//            return ResponseFormat.retParam(200, "删除成功");
//        } catch (Exception e) {
//            logger.error("删除供应商异常", e);
//            return ResponseFormat.retParam(500, "删除供应商异常");
//        }
//    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    @ApiOperation(value = "修改供应商信息")
    public GenericResponse doUpdate(
            @ApiParam(value = "供应商Id", required = true) @RequestParam Integer id,
            @ApiParam(value = "供应商编号") @RequestParam(required = false) String supNum,
            @ApiParam(value = "供应商名称") @RequestParam(required = false) String supName,
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
            return ResponseFormat.retParam(200, "供应商修改成功");
        } catch (Exception e) {
            logger.error("供应商修改异常", e);
            return ResponseFormat.retParam(500, "供应商修改异常");

        }
    }

}
