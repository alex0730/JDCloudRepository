package com.lee.controller.admin;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.lee.common.DateTimeUtil;
import com.lee.entity.SysMaterialInfoModel;
import com.lee.entity.common.GenericResponse;
import com.lee.entity.common.ResponseFormat;
import com.lee.service.MaterialService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Api(value = "物资管理", description = "物资管理")
@RestController
@RequestMapping("/sys/material")
public class MaterialController extends BasicController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    MaterialService materialService;

    @RequestMapping(value = "findList", method = RequestMethod.GET)
    @ApiOperation(value = "物资信息列表")
    public GenericResponse findList(
            @ApiParam(value = "采购单号") @RequestParam(required = false) String matPurchaseNum,
            @ApiParam(value = "入库单号") @RequestParam(required = false) String matOrderNum,
            @ApiParam(value = "物资类别Id") @RequestParam(required = false) String matTypeCode,
            @ApiParam(value = "供应商Id") @RequestParam(required = false) String supplierNum,
            @ApiParam(value = "物资名称") @RequestParam(required = false) String matName,
            @ApiParam(value = "当前页面", required = true) @RequestParam Integer pageNo,
            @ApiParam(value = "每页记录数", required = true) @RequestParam Integer pageSize
    ) {
        Map<String, Object> searchParams = new HashMap<>();
        try {
            searchParams.put("matPurchaseNum", matPurchaseNum);
            searchParams.put("matOrderNum", matOrderNum);
            searchParams.put("matTypeCode", matTypeCode);
            searchParams.put("supplierNum", supplierNum);
            searchParams.put("matName", matName);
            searchParams.put("offsetIndex", pageNo);
            searchParams.put("limit", pageSize);
            return materialService.getPageInfo(searchParams);
        } catch (Exception e) {
            logger.error("查询物资列表异常", e);
            return ResponseFormat.retParam(500, "查询物资列表异常");
        }
    }

    @RequestMapping(value = "view", method = RequestMethod.GET)
    @ApiOperation(value = "物资信息详情")
    public GenericResponse doView(@ApiParam(value = "物资编码", required = true) @RequestParam Integer id) {
        try {
            SysMaterialInfoModel sysMaterialInfoModel = materialService.getById(id);
            if (sysMaterialInfoModel == null) {
                return ResponseFormat.retParam(50001, "数据未找到");
            }
            return ResponseFormat.retParam(200, sysMaterialInfoModel);
        } catch (Exception e) {
            logger.error("物资修改异常", e);
            return ResponseFormat.retParam(500, "查询物资信息详情异常");

        }
    }

    @RequestMapping(value = "add", method = RequestMethod.GET)
    @ApiOperation(value = "添加物资信息")
    public GenericResponse doAdd(@ApiParam(value = "物资编号", required = true) @RequestParam String matPurchaseNum,
                                 @ApiParam(value = "物资规格", required = true) @RequestParam String matSpecs,
                                 @ApiParam(value = "物资类别", required = true) @RequestParam String matTypeCode,
                                 @ApiParam(value = "物资单位", required = true) @RequestParam String matUnit,
                                 @ApiParam(value = "供应商编号", required = true) @RequestParam String supplierNum,
                                 @ApiParam(value = "物资名称", required = true) @RequestParam String matName) {
        try {
            if (materialService.getOne(new LambdaQueryWrapper<SysMaterialInfoModel>()
                    .eq(SysMaterialInfoModel::getMatName, matName)) != null) {
                return ResponseFormat.retParam(50003, "数据已存在");
            }
            SysMaterialInfoModel model = new SysMaterialInfoModel();
            // TODO 物资编码生成规则
            model.setMatPurchaseNum(matPurchaseNum);
            model.setMatSpecs(matSpecs);
            model.setMatTypeCode(matTypeCode);
            model.setMatUnit(matUnit);
            model.setSupplierNum(supplierNum);
            model.setMatName(matName);
            model.setCreateTime(DateTimeUtil.nowTimeStr());
            materialService.save(model);
            return ResponseFormat.retParam(200, "物资创建成功");
        } catch (Exception e) {
            logger.error("创建物资异常", e);
            return ResponseFormat.retParam(500, "创建物资异常");
        }
    }

//    @RequestMapping(value = "material/delete", method = RequestMethod.POST)
//    @ApiOperation(value = "批量删除物资信息")
//    public GenericResponse doDelete(@ApiParam(value = "物资Id",required = true) @RequestParam(value = "ids") List<Integer> ids) {
//        try {
//            for (int id : ids) {
//                adminService.removeById(id);
//            }
//            return ResponseFormat.retParam(200, "删除成功");
//        } catch (Exception e) {
//            logger.error("删除物资异常", e);
//            return ResponseFormat.retParam(500, "删除物资异常");
//        }
//    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    @ApiOperation(value = "修改物资信息")
    public GenericResponse doUpdate(
            @ApiParam(value = "物资Id", required = true) @RequestParam Integer id,
            @ApiParam(value = "物资编号") @RequestParam(required = false)String matPurchaseNum,
            @ApiParam(value = "物资规格") @RequestParam(required = false)String matSpecs,
            @ApiParam(value = "物资类别") @RequestParam(required = false)String matTypeCode,
            @ApiParam(value = "物资单位") @RequestParam(required = false)String matUnit,
            @ApiParam(value = "供应商编号") @RequestParam(required = false)String supplierNum,
            @ApiParam(value = "物资名称") @RequestParam(required = false)String matName
    ) {
        try {
            if (materialService.getOne(new LambdaQueryWrapper<SysMaterialInfoModel>()
                    .eq(SysMaterialInfoModel::getId, id)) == null) {
                return ResponseFormat.retParam(50001, "数据未找到");
            }
            SysMaterialInfoModel model = new SysMaterialInfoModel();
            model.setId(id);
            model.setMatPurchaseNum(matPurchaseNum);
            model.setMatSpecs(matSpecs);
            model.setMatTypeCode(matTypeCode);
            model.setMatUnit(matUnit);
            model.setSupplierNum(supplierNum);
            model.setMatName(matName);
            model.setUpdateTime(DateTimeUtil.nowTimeStr());
            materialService.updateById(model);
            return ResponseFormat.retParam(200, "物资修改成功");
        } catch (Exception e) {
            logger.error("物资修改异常", e);
            return ResponseFormat.retParam(500, "物资修改异常");

        }
    }


}
