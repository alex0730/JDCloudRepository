package com.lee.controller.admin;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lee.common.DateTimeUtil;
import com.lee.common.ExcludeEmptyQueryWrapper;
import com.lee.entity.*;
import com.lee.entity.common.GenericResponse;
import com.lee.entity.common.ResponseFormat;
import com.lee.service.*;
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

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author lee
 * @since 2020-02-21
 */
@Api(value = "规则管理", description = "规则管理")
@RestController
@RequestMapping("/base/rule")
public class RuleController extends BasicController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    RulePutrecommService rulePutrecommService;

    @Autowired
    RulePutverifiService rulePutverifiService;

    @Autowired
    RuleStockturnService ruleStockturnService;

    @Autowired
    RuleLocationService ruleLocationService;

    @Autowired
    RuleConfService ruleConfService;

    @Autowired
    RulePickingService rulePickingService;

    @RequestMapping(value = "picking/findList", method = RequestMethod.GET)
    @ApiOperation(value = "查询拣货任务规则列表")
    public GenericResponse pickingFindList(
            @ApiParam(value = "规则编码") @RequestParam(required = false) String pickingNum,
            @ApiParam(value = "状态") @RequestParam(required = false) String pickingStatus,
            @ApiParam(value = "当前页面", required = true) @RequestParam Integer pageNo,
            @ApiParam(value = "每页记录数", required = true) @RequestParam Integer pageSize
    ) {
        Map<String, Object> searchParams = new HashMap<>();
        try {
            searchParams.put("pickingNum", pickingNum);
            searchParams.put("pickingStatus", pickingStatus);
            searchParams.put("offsetIndex", pageNo);
            searchParams.put("limit", pageSize);
            return rulePickingService.getPageInfo(searchParams);
        } catch (Exception e) {
            logger.error("查询拣货任务规则列表异常", e);
            return ResponseFormat.retParam(500, "查询拣货任务规则列表异常");
        }
    }

    @RequestMapping(value = "picking/view", method = RequestMethod.GET)
    @ApiOperation(value = "查询拣货任务规则详情")
    public GenericResponse pickingDoView(@ApiParam(value = "拣货任务规则Id", required = true) @RequestParam Integer id) {
        try {
            RulePickingInfoModel model = rulePickingService.getById(id);
            if (model == null) {
                return ResponseFormat.retParam(50001, "数据未找到");
            }
            return ResponseFormat.retParam(200, model);
        } catch (Exception e) {
            logger.error("查询拣货任务规则详情异常", e);
            return ResponseFormat.retParam(500, "查询拣货任务规则详情异常");
        }
    }

    @RequestMapping(value = "picking/add", method = RequestMethod.POST)
    @ApiOperation(value = "创建拣货任务规则信息")
    public GenericResponse pickingDoAdd(
            @ApiParam(value = "规则编码", required = true) @RequestParam String pickingNum,
            @ApiParam(value = "规则描述", required = true) @RequestParam String pickingDesc,
            @ApiParam(value = "执行顺序", required = true) @RequestParam Integer pickingExecuteOrder,
            @ApiParam(value = "是否启用", required = true) @RequestParam String pickingStatus,
            @ApiParam(value = "订单类型", required = true) @RequestParam String pickingOrderType,
            @ApiParam(value = "供应商编码", required = true) @RequestParam String supplierNum,
            @ApiParam(value = "体积限额", required = true) @RequestParam String limitVolume,
            @ApiParam(value = "重量限额", required = true) @RequestParam String limitWeight,
            @ApiParam(value = "数量限额", required = true) @RequestParam String limitCount,
            @ApiParam(value = "品种数限额", required = true) @RequestParam String limitVarieties,
            @ApiParam(value = "任务条数限额", required = true) @RequestParam String limitTask
    ) {
        try {
            if (rulePickingService.getOne(new ExcludeEmptyQueryWrapper<RulePickingInfoModel>()
                    .eq("picking_num", pickingNum)) != null) {
                return ResponseFormat.retParam(50003, "数据已存在");
            }
            RulePickingInfoModel entity = new RulePickingInfoModel();
            entity.setPickingNum(pickingNum);
            entity.setPickingDesc(pickingDesc);
            entity.setPickingExecuteOrder(pickingExecuteOrder);
            entity.setPickingStatus(pickingStatus);
            entity.setPickingOrderType(pickingOrderType);
            entity.setSupplierNum(supplierNum);
            entity.setLimitVolume(limitVolume);
            entity.setLimitWeight(limitWeight);
            entity.setLimitCount(limitCount);
            entity.setLimitVarieties(limitVarieties);
            entity.setLimitTask(limitTask);
            entity.setCreateTime(DateTimeUtil.nowTimeStr());
            rulePickingService.save(entity);
            return ResponseFormat.retParam(200, "创建拣货任务规则信息成功");
        } catch (Exception e) {
            logger.error("创建拣货任务规则信息异常", e);
            return ResponseFormat.retParam(500, "创建拣货任务规则信息异常");
        }
    }

    @RequestMapping(value = "picking/delete", method = RequestMethod.POST)
    @ApiOperation(value = "删除拣货任务规则信息")
    public GenericResponse pickingDoDelete(@ApiParam(value = "拣货任务规则Id", required = true) @RequestParam(value = "id") Integer id) {
        try {
            rulePickingService.removeById(id);
            return ResponseFormat.retParam(200, "删除拣货任务规则信息成功");
        } catch (Exception e) {
            logger.error("删除拣货任务规则信息异常", e);
            return ResponseFormat.retParam(500, "删除拣货任务规则信息异常");
        }
    }

    @RequestMapping(value = "picking/update", method = RequestMethod.POST)
    @ApiOperation(value = "修改拣货任务规则信息")
    public GenericResponse pickingDoUpdate(
            @ApiParam(value = "拣货任务规则Id") @RequestParam(required = false) Integer id,
            @ApiParam(value = "规则描述") @RequestParam(required = false) String pickingDesc,
            @ApiParam(value = "执行顺序") @RequestParam(required = false) Integer pickingExecuteOrder,
            @ApiParam(value = "是否启用") @RequestParam(required = false) String pickingStatus,
            @ApiParam(value = "订单类型") @RequestParam(required = false) String pickingOrderType,
            @ApiParam(value = "供应商编码") @RequestParam(required = false) String supplierNum,
            @ApiParam(value = "体积限额") @RequestParam(required = false) String limitVolume,
            @ApiParam(value = "重量限额") @RequestParam(required = false) String limitWeight,
            @ApiParam(value = "数量限额") @RequestParam(required = false) String limitCount,
            @ApiParam(value = "品种数限额") @RequestParam(required = false) String limitVarieties,
            @ApiParam(value = "任务条数限额") @RequestParam(required = false) String limitTask
    ) {
        try {
            if (rulePickingService.getById(id) == null) {
                return ResponseFormat.retParam(50001, "数据未找到");
            }
            RulePickingInfoModel entity = new RulePickingInfoModel();
            entity.setId(id);
            entity.setPickingDesc(pickingDesc);
            entity.setPickingExecuteOrder(pickingExecuteOrder);
            entity.setPickingStatus(pickingStatus);
            entity.setPickingOrderType(pickingOrderType);
            entity.setSupplierNum(supplierNum);
            entity.setLimitVolume(limitVolume);
            entity.setLimitWeight(limitWeight);
            entity.setLimitCount(limitCount);
            entity.setLimitVarieties(limitVarieties);
            entity.setLimitTask(limitTask);
            entity.setUpdateTime(DateTimeUtil.nowTimeStr());
            rulePickingService.updateById(entity);
            return ResponseFormat.retParam(200, "修改拣货任务规则信息成功");
        } catch (Exception e) {
            logger.error("修改拣货任务规则信息异常", e);
            return ResponseFormat.retParam(500, "修改拣货任务规则信息异常");

        }
    }

    // =========================================================================================
    @RequestMapping(value = "conf/findList", method = RequestMethod.GET)
    @ApiOperation(value = "规则配置列表")
    public GenericResponse confFindList(
            @ApiParam(value = "业务类型Id") @RequestParam(required = false) String businessType,
            @ApiParam(value = "操作类型Id") @RequestParam(required = false) String operationType,
            @ApiParam(value = "供应商Id") @RequestParam(required = false) String supplierNum,
            @ApiParam(value = "物资类型Id") @RequestParam(required = false) String materialNum,
            @ApiParam(value = "当前页面", required = true) @RequestParam Integer pageNo,
            @ApiParam(value = "每页记录数", required = true) @RequestParam Integer pageSize
    ) {
        Map<String, Object> searchParams = new HashMap<>();
        try {
            searchParams.put("supplierNum", supplierNum);
            searchParams.put("materialNum", materialNum);
            searchParams.put("businessType", businessType);
            searchParams.put("operationType", operationType);
            searchParams.put("offsetIndex", pageNo);
            searchParams.put("limit", pageSize);
            return ruleConfService.getPageInfo(searchParams);
        } catch (Exception e) {
            logger.error("查询规则配置列表异常", e);
            return ResponseFormat.retParam(500, "查询规则配置列表异常");
        }
    }

    @RequestMapping(value = "conf/view", method = RequestMethod.GET)
    @ApiOperation(value = "规则配置详情")
    public GenericResponse confDoView(@ApiParam(value = "规则配置Id", required = true) @RequestParam Integer id) {
        try {
            RuleConfInfoModel model = ruleConfService.getById(id);
            if (model == null) {
                return ResponseFormat.retParam(50001, "数据未找到");
            }
            return ResponseFormat.retParam(200, model);
        } catch (Exception e) {
            logger.error("查询规则配置信息详情异常", e);
            return ResponseFormat.retParam(500, "查询规则配置信息详情异常");
        }
    }

    @RequestMapping(value = "conf/add", method = RequestMethod.POST)
    @ApiOperation(value = "添加规则配置信息")
    public GenericResponse confDoAdd(
            @ApiParam(value = "规则配置编码", required = true) @RequestParam String confNum,
            @ApiParam(value = "规则配置描述", required = true) @RequestParam String confDesc,
            @ApiParam(value = "规则类型", required = true) @RequestParam String ruleType,
            @ApiParam(value = "业务类型", required = true) @RequestParam String businessType,
            @ApiParam(value = "操作类型", required = true) @RequestParam String operationType,
            @ApiParam(value = "规则名称", required = true) @RequestParam String ruleName,
            @ApiParam(value = "优先级", required = true) @RequestParam Integer confPriority,
            @ApiParam(value = "货主", required = true) @RequestParam String ownerName,
            @ApiParam(value = "物资编码Id", required = true) @RequestParam String materialNum
    ) {
        try {
            if (ruleConfService.getOne(new ExcludeEmptyQueryWrapper<RuleConfInfoModel>()
                    .eq("conf_num", confNum)) != null) {
                return ResponseFormat.retParam(50003, "数据已存在");
            }
            RuleConfInfoModel entity = new RuleConfInfoModel();
            entity.setMaterialNum(materialNum);
            entity.setConfNum(confNum);
            entity.setConfDesc(confDesc);
            entity.setRuleType(ruleType);
            entity.setBusinessType(businessType);
            entity.setOperationType(operationType);
            entity.setRuleName(ruleName);
            entity.setOwnerName(ownerName);
            entity.setConfPriority(confPriority);
            entity.setCreateTime(DateTimeUtil.nowTimeStr());
            ruleConfService.save(entity);
            return ResponseFormat.retParam(200, "创建规则配置成功");
        } catch (Exception e) {
            logger.error("创建规则配置异常", e);
            return ResponseFormat.retParam(500, "创建规则配置异常");
        }
    }

    @RequestMapping(value = "conf/delete", method = RequestMethod.POST)
    @ApiOperation(value = "删除规则配置信息")
    public GenericResponse confDoDelete(@ApiParam(value = "规则配置Id", required = true) @RequestParam(value = "id") Integer id) {
        try {
            ruleConfService.removeById(id);
            return ResponseFormat.retParam(200, "删除规则配置成功");
        } catch (Exception e) {
            logger.error("删除规则配置异常", e);
            return ResponseFormat.retParam(500, "删除规则配置异常");
        }
    }

    @RequestMapping(value = "conf/update", method = RequestMethod.POST)
    @ApiOperation(value = "修改规则配置信息")
    public GenericResponse confDoUpdate(
            @ApiParam(value = "规则配置Id", required = true) @RequestParam Integer id,
            @ApiParam(value = "规则配置描述") @RequestParam(required = false) String confDesc,
            @ApiParam(value = "规则类型") @RequestParam String ruleType,
            @ApiParam(value = "业务类型") @RequestParam String businessType,
            @ApiParam(value = "操作类型") @RequestParam String operationType,
            @ApiParam(value = "规则名称") @RequestParam String ruleName,
            @ApiParam(value = "优先级") @RequestParam Integer confPriority,
            @ApiParam(value = "货主") @RequestParam String ownerName,
            @ApiParam(value = "物资编码Id") @RequestParam String materialNum
    ) {
        try {
            if (ruleConfService.getById(id) == null) {
                return ResponseFormat.retParam(50001, "数据未找到");
            }
            RuleConfInfoModel entity = new RuleConfInfoModel();
            entity.setId(id);
            entity.setMaterialNum(materialNum);
            entity.setConfDesc(confDesc);
            entity.setRuleType(ruleType);
            entity.setBusinessType(businessType);
            entity.setOperationType(operationType);
            entity.setRuleName(ruleName);
            entity.setOwnerName(ownerName);
            entity.setConfPriority(confPriority);
            entity.setUpdateTime(DateTimeUtil.nowTimeStr());
            ruleConfService.updateById(entity);
            return ResponseFormat.retParam(200, "修改规则配置信息成功");
        } catch (Exception e) {
            logger.error("修改规则配置信息修改异常", e);
            return ResponseFormat.retParam(500, "修改规则配置信息异常");

        }
    }

    // =========================================================================================

    @RequestMapping(value = "location/findList", method = RequestMethod.GET)
    @ApiOperation(value = "定位转规则列表")
    public GenericResponse locationFindList(
            @ApiParam(value = "定位转规则编号") @RequestParam(required = false) String locationNum,
            @ApiParam(value = "定位转规则名称") @RequestParam(required = false) String locationName,
            @ApiParam(value = "当前页面", required = true) @RequestParam Integer pageNo,
            @ApiParam(value = "每页记录数", required = true) @RequestParam Integer pageSize
    ) {
        try {
            IPage<RuleLocationInfoModel> page = new Page<>();
            page.setCurrent(Long.valueOf(pageNo));
            page.setSize(Long.valueOf(pageSize));
            IPage<RuleLocationInfoModel> iPage = ruleLocationService.page(page, new ExcludeEmptyQueryWrapper<RuleLocationInfoModel>()
                    .eq("location_num", locationNum)
                    .like("location_name", locationName)
            );
            return ResponseFormat.retParam(200, iPage);
        } catch (Exception e) {
            logger.error("查询定位转规则列表异常", e);
            return ResponseFormat.retParam(500, "查询定位转规则列表异常");
        }
    }

    @RequestMapping(value = "location/view", method = RequestMethod.GET)
    @ApiOperation(value = "定位转规则详情")
    public GenericResponse locationDoView(@ApiParam(value = "定位转规则Id", required = true) @RequestParam Integer id) {
        try {
            RuleLocationInfoModel model = ruleLocationService.getById(id);
            if (model == null) {
                return ResponseFormat.retParam(50001, "数据未找到");
            }
            return ResponseFormat.retParam(200, model);
        } catch (Exception e) {
            logger.error("查询定位转规则信息详情异常", e);
            return ResponseFormat.retParam(500, "查询定位转规则信息详情异常");
        }
    }

    @RequestMapping(value = "location/add", method = RequestMethod.POST)
    @ApiOperation(value = "添加定位转规则信息")
    public GenericResponse locationDoAdd(
            @ApiParam(value = "定位规则编码", required = true) @RequestParam String locationNum,
            @ApiParam(value = "定位规则名称", required = true) @RequestParam String locationName,
            @ApiParam(value = "定位规则描述", required = true) @RequestParam String locationDesc,
            @ApiParam(value = "规则代码", required = true) @RequestParam String ruleCode,
            @ApiParam(value = "过滤临期物资", required = true) @RequestParam String filterTempMat,
            @ApiParam(value = "储位数量策略", required = true) @RequestParam String spositionNumPolicy,
            @ApiParam(value = "定位库区限制", required = true) @RequestParam String locationDepositoryLimit
    ) {
        try {
            if (ruleLocationService.getOne(new ExcludeEmptyQueryWrapper<RuleLocationInfoModel>()
                    .eq("location_num", locationNum)) != null ||
                    ruleLocationService.getOne(new ExcludeEmptyQueryWrapper<RuleLocationInfoModel>()
                            .eq("location_name", locationName)) != null) {
                return ResponseFormat.retParam(50003, "数据已存在");
            }
            RuleLocationInfoModel entity = new RuleLocationInfoModel();
            entity.setLocationNum(locationNum);
            entity.setLocationName(locationName);
            entity.setLocationDesc(locationDesc);
            entity.setRuleCode(ruleCode);
            entity.setFilterTempMat(filterTempMat);
            entity.setSpositionNumPolicy(spositionNumPolicy);
            entity.setLocationDepositoryLimit(locationDepositoryLimit);
            entity.setCreateTime(DateTimeUtil.nowTimeStr());
            ruleLocationService.save(entity);
            return ResponseFormat.retParam(200, "库存定位转规则创建成功");
        } catch (Exception e) {
            logger.error("创建定位转规则异常", e);
            return ResponseFormat.retParam(500, "创建定位转规则异常");
        }
    }

    @RequestMapping(value = "location/delete", method = RequestMethod.POST)
    @ApiOperation(value = "删除定位转规则信息")
    public GenericResponse locationDoDelete(@ApiParam(value = "定位转规则Id", required = true) @RequestParam(value = "id") Integer id) {
        try {
            ruleLocationService.removeById(id);
            return ResponseFormat.retParam(200, "删除定位转规则成功");
        } catch (Exception e) {
            logger.error("删除定位转规则异常", e);
            return ResponseFormat.retParam(500, "删除定位转规则异常");
        }
    }

    @RequestMapping(value = "location/update", method = RequestMethod.POST)
    @ApiOperation(value = "修改定位转规则信息")
    public GenericResponse locationDoUpdate(
            @ApiParam(value = "定位规则Id", required = true) @RequestParam Integer id,
            @ApiParam(value = "定位规则名称", required = true) @RequestParam String locationName,
            @ApiParam(value = "定位规则描述") @RequestParam(required = false) String locationDesc,
            @ApiParam(value = "规则代码", required = true) @RequestParam String ruleCode,
            @ApiParam(value = "过滤临期物资", required = true) @RequestParam String filterTempMat,
            @ApiParam(value = "储位数量策略", required = true) @RequestParam String spositionNumPolicy,
            @ApiParam(value = "定位库区限制", required = true) @RequestParam String locationDepositoryLimit
    ) {
        try {
            if (ruleLocationService.getById(id) == null) {
                return ResponseFormat.retParam(50001, "数据未找到");
            }
            RuleLocationInfoModel entity = new RuleLocationInfoModel();
            entity.setId(id);
            entity.setLocationName(locationName);
            entity.setLocationDesc(locationDesc);
            entity.setRuleCode(ruleCode);
            entity.setFilterTempMat(filterTempMat);
            entity.setSpositionNumPolicy(spositionNumPolicy);
            entity.setLocationDepositoryLimit(locationDepositoryLimit);
            entity.setUpdateTime(DateTimeUtil.nowTimeStr());
            ruleLocationService.updateById(entity);
            return ResponseFormat.retParam(200, "修改定位转规则信息成功");
        } catch (Exception e) {
            logger.error("修改定位转规则信息修改异常", e);
            return ResponseFormat.retParam(500, "修改定位转规则信息异常");

        }
    }

    // =========================================================================================

    @RequestMapping(value = "stockturn/findList", method = RequestMethod.GET)
    @ApiOperation(value = "库存周转规则列表")
    public GenericResponse stockturnFindList(
            @ApiParam(value = "库存周转规则编号") @RequestParam(required = false) String stockturnNum,
            @ApiParam(value = "库存周转规则名称") @RequestParam(required = false) String stockturnName,
            @ApiParam(value = "当前页面", required = true) @RequestParam Integer pageNo,
            @ApiParam(value = "每页记录数", required = true) @RequestParam Integer pageSize
    ) {
        try {
            IPage<RuleStockturnInfoModel> page = new Page<>();
            page.setCurrent(Long.valueOf(pageNo));
            page.setSize(Long.valueOf(pageSize));
            IPage<RuleStockturnInfoModel> iPage = ruleStockturnService.page(page, new ExcludeEmptyQueryWrapper<RuleStockturnInfoModel>()
                    .eq("stockturn_num", stockturnNum)
                    .like("stockturn_name", stockturnName)
            );
            return ResponseFormat.retParam(200, iPage);
        } catch (Exception e) {
            logger.error("查询库存周转规则列表异常", e);
            return ResponseFormat.retParam(500, "查询库存周转规则列表异常");
        }
    }

    @RequestMapping(value = "stockturn/view", method = RequestMethod.GET)
    @ApiOperation(value = "库存周转规则详情")
    public GenericResponse stockturnDoView(@ApiParam(value = "库存周转规则Id", required = true) @RequestParam Integer id) {
        try {
            RuleStockturnInfoModel model = ruleStockturnService.getById(id);
            if (model == null) {
                return ResponseFormat.retParam(50001, "数据未找到");
            }
            return ResponseFormat.retParam(200, model);
        } catch (Exception e) {
            logger.error("查询库存周转规则信息详情异常", e);
            return ResponseFormat.retParam(500, "查询库存周转规则信息详情异常");
        }
    }

    @RequestMapping(value = "stockturn/add", method = RequestMethod.POST)
    @ApiOperation(value = "添加库存周转规则信息")
    public GenericResponse stockturnDoAdd(@ApiParam(value = "库存周转规则编号", required = true) @RequestParam String stockturnNum,
                                          @ApiParam(value = "库存周转规则名称", required = true) @RequestParam String stockturnName,
                                          @ApiParam(value = "库存周转规则描述", required = true) @RequestParam String stockturnDesc,
                                          @ApiParam(value = "备注") @RequestParam(required = false) String stockturnRemark
    ) {
        try {
            if (ruleStockturnService.getOne(new ExcludeEmptyQueryWrapper<RuleStockturnInfoModel>()
                    .eq("stockturn_num", stockturnNum)) != null ||
                    ruleStockturnService.getOne(new ExcludeEmptyQueryWrapper<RuleStockturnInfoModel>()
                            .eq("stockturn_name", stockturnName)) != null) {
                return ResponseFormat.retParam(50003, "数据已存在");
            }
            RuleStockturnInfoModel entity = new RuleStockturnInfoModel();
            entity.setStockturnNum(stockturnNum);
            entity.setStockturnDesc(stockturnDesc);
            entity.setStockturnRemark(stockturnRemark);
            entity.setStockturnName(stockturnName);
            entity.setCreateTime(DateTimeUtil.nowTimeStr());
            ruleStockturnService.save(entity);
            return ResponseFormat.retParam(200, "库存周转规则创建成功");
        } catch (Exception e) {
            logger.error("创建库存周转规则异常", e);
            return ResponseFormat.retParam(500, "创建库存周转规则异常");
        }
    }

    @RequestMapping(value = "stockturn/delete", method = RequestMethod.POST)
    @ApiOperation(value = "删除库存周转规则信息")
    public GenericResponse stockturnDoDelete(@ApiParam(value = "库存周转规则Id", required = true) @RequestParam(value = "id") Integer id) {
        try {
            ruleStockturnService.removeById(id);
            return ResponseFormat.retParam(200, "删除库存周转规则成功");
        } catch (Exception e) {
            logger.error("删除库存周转规则异常", e);
            return ResponseFormat.retParam(500, "删除库存周转规则异常");
        }
    }

    @RequestMapping(value = "stockturn/update", method = RequestMethod.POST)
    @ApiOperation(value = "修改库存周转规则信息")
    public GenericResponse stockturnDoUpdate(
            @ApiParam(value = "库存周转规则Id", required = true) @RequestParam Integer id,
            @ApiParam(value = "库存周转规则名称", required = true) @RequestParam String stockturnName,
            @ApiParam(value = "库存周转规则描述") @RequestParam(required = false) String stockturnDesc,
            @ApiParam(value = "备注") @RequestParam(required = false) String stockturnRemark
    ) {
        try {
            if (ruleStockturnService.getById(id) == null) {
                return ResponseFormat.retParam(50001, "数据未找到");
            }
            RuleStockturnInfoModel entity = new RuleStockturnInfoModel();
            entity.setId(id);
            entity.setStockturnDesc(stockturnDesc);
            entity.setStockturnRemark(stockturnRemark);
            entity.setStockturnName(stockturnName);
            entity.setUpdateTime(DateTimeUtil.nowTimeStr());
            ruleStockturnService.updateById(entity);
            return ResponseFormat.retParam(200, "库存周转规则信息修改成功");
        } catch (Exception e) {
            logger.error("库存周转规则信息修改异常", e);
            return ResponseFormat.retParam(500, "库存周转规则信息修改异常");

        }
    }

    // =========================================================================================
    @RequestMapping(value = "putrecomm/findList", method = RequestMethod.GET)
    @ApiOperation(value = "上架推荐规则列表")
    public GenericResponse putrecommFindList(
            @ApiParam(value = "上架规则编号") @RequestParam(required = false) String putonNum,
            @ApiParam(value = "上架规则名称") @RequestParam(required = false) String putonName,
            @ApiParam(value = "当前页面", required = true) @RequestParam Integer pageNo,
            @ApiParam(value = "每页记录数", required = true) @RequestParam Integer pageSize
    ) {
        try {
            IPage<RulePutrecommInfoModel> page = new Page<>();
            page.setCurrent(Long.valueOf(pageNo));
            page.setSize(Long.valueOf(pageSize));
            IPage<RulePutrecommInfoModel> iPage = rulePutrecommService.page(page, new ExcludeEmptyQueryWrapper<RulePutrecommInfoModel>()
                    .eq("puton_num", putonNum)
                    .like("puton_name", putonName)
            );
            return ResponseFormat.retParam(200, iPage);
        } catch (Exception e) {
            logger.error("查询上架推荐规则列表异常", e);
            return ResponseFormat.retParam(500, "查询上架推荐规则列表异常");
        }
    }

    @RequestMapping(value = "putrecomm/view", method = RequestMethod.GET)
    @ApiOperation(value = "上架推荐规则信息详情")
    public GenericResponse putrecommDoView(@ApiParam(value = "供应商Id", required = true) @RequestParam Integer id) {
        try {
            RulePutrecommInfoModel model = rulePutrecommService.getById(id);
            if (model == null) {
                return ResponseFormat.retParam(50001, "数据未找到");
            }
            return ResponseFormat.retParam(200, model);
        } catch (Exception e) {
            logger.error("查询上架推荐规则信息详情异常", e);
            return ResponseFormat.retParam(500, "查询上架推荐规则信息详情异常");
        }
    }

    @RequestMapping(value = "putrecomm/add", method = RequestMethod.POST)
    @ApiOperation(value = "添加上架推荐规则信息")
    public GenericResponse putrecomDoAdd(@ApiParam(value = "上架规则编号", required = true) @RequestParam String putonNum,
                                         @ApiParam(value = "上架规则名称", required = true) @RequestParam String putonName,
                                         @ApiParam(value = "上架规则描述", required = true) @RequestParam String putonDesc,
                                         @ApiParam(value = "备注") @RequestParam(required = false) String putonRemark
    ) {
        try {
            if (rulePutrecommService.getOne(new ExcludeEmptyQueryWrapper<RulePutrecommInfoModel>()
                    .eq("puton_num", putonNum)) != null ||
                    rulePutrecommService.getOne(new ExcludeEmptyQueryWrapper<RulePutrecommInfoModel>()
                            .eq("puton_name", putonName)) != null) {
                return ResponseFormat.retParam(50003, "数据已存在");
            }
            RulePutrecommInfoModel entity = new RulePutrecommInfoModel();
            entity.setPutonNum(putonNum);
            entity.setPutonName(putonName);
            entity.setPutonDesc(putonDesc);
            entity.setPutonRemark(putonRemark);
            entity.setCreateTime(DateTimeUtil.nowTimeStr());
            rulePutrecommService.save(entity);
            return ResponseFormat.retParam(200, "上架推荐规则创建成功");
        } catch (Exception e) {
            logger.error("创建上架推荐规则异常", e);
            return ResponseFormat.retParam(500, "创建上架推荐规则异常");
        }
    }

    @RequestMapping(value = "putrecomm/delete", method = RequestMethod.POST)
    @ApiOperation(value = "删除上架推荐规则信息")
    public GenericResponse putrecomDoDelete(@ApiParam(value = "上架推荐规则Id", required = true) @RequestParam(value = "id") Integer id) {
        try {
            rulePutrecommService.removeById(id);
            return ResponseFormat.retParam(200, "删除上架推荐规则成功");
        } catch (Exception e) {
            logger.error("删除上架推荐规则异常", e);
            return ResponseFormat.retParam(500, "删除上架推荐规则异常");
        }
    }

    @RequestMapping(value = "putrecomm/update", method = RequestMethod.POST)
    @ApiOperation(value = "修改上架推荐规则信息")
    public GenericResponse putrecommDoUpdate(
            @ApiParam(value = "上架规则Id", required = true) @RequestParam Integer id,
            @ApiParam(value = "上架规则名称") @RequestParam(required = false) String putonName,
            @ApiParam(value = "上架规则描述") @RequestParam(required = false) String putonDesc,
            @ApiParam(value = "备注") @RequestParam(required = false) String putonRemark
    ) {
        try {
            if (rulePutrecommService.getById(id) == null) {
                return ResponseFormat.retParam(50001, "数据未找到");
            }
            RulePutrecommInfoModel entity = new RulePutrecommInfoModel();
            entity.setId(id);
            entity.setPutonName(putonName);
            entity.setPutonDesc(putonDesc);
            entity.setPutonRemark(putonRemark);
            entity.setUpdateTime(DateTimeUtil.nowTimeStr());
            rulePutrecommService.updateById(entity);
            return ResponseFormat.retParam(200, "上架推荐规则信息修改成功");
        } catch (Exception e) {
            logger.error("上架推荐规则信息修改异常", e);
            return ResponseFormat.retParam(500, "上架推荐规则信息修改异常");

        }
    }

    @RequestMapping(value = "putverifi/findList", method = RequestMethod.GET)
    @ApiOperation(value = "上架验证规则列表")
    public GenericResponse putverifiFindList(
            @ApiParam(value = "配置代码") @RequestParam(required = false) String verificonfNum,
            @ApiParam(value = "当前页面", required = true) @RequestParam Integer pageNo,
            @ApiParam(value = "每页记录数", required = true) @RequestParam Integer pageSize
    ) {
        try {
            IPage<RulePutverifiInfoModel> page = new Page<>();
            page.setCurrent(Long.valueOf(pageNo));
            page.setSize(Long.valueOf(pageSize));
            IPage<RulePutverifiInfoModel> iPage = rulePutverifiService.page(page, new ExcludeEmptyQueryWrapper<RulePutverifiInfoModel>()
                    .eq("verifi_conf_num", verificonfNum)
            );
            return ResponseFormat.retParam(200, iPage);
        } catch (Exception e) {
            logger.error("查询上架验证规则列表异常", e);
            return ResponseFormat.retParam(500, "查询上架验证规则列表异常");
        }
    }

    @RequestMapping(value = "putverifi/view", method = RequestMethod.GET)
    @ApiOperation(value = "上架验证规则信息详情")
    public GenericResponse putverifiDoView(@ApiParam(value = "供应商Id", required = true) @RequestParam Integer id) {
        try {
            RulePutverifiInfoModel model = rulePutverifiService.getById(id);
            if (model == null) {
                return ResponseFormat.retParam(50001, "数据未找到");
            }
            return ResponseFormat.retParam(200, model);
        } catch (Exception e) {
            logger.error("查询上架验证规则信息详情异常", e);
            return ResponseFormat.retParam(500, "查询上架验证规则详情异常");
        }
    }

    @RequestMapping(value = "putverifi/add", method = RequestMethod.POST)
    @ApiOperation(value = "添加上架验证规则信息")
    public GenericResponse putverifiDoAdd(@ApiParam(value = "配置代码", required = true) @RequestParam String verifiConfNum,
                                          @ApiParam(value = "描述", required = true) @RequestParam String verifiDesc,
                                          @ApiParam(value = "库位混放限制", required = true) @RequestParam String verifiMixLimit,
                                          @ApiParam(value = "库位空间限制", required = true) @RequestParam String verifiSpaceLimit
    ) {
        try {
            if (rulePutverifiService.getOne(new ExcludeEmptyQueryWrapper<RulePutverifiInfoModel>()
                    .eq("verifi_conf_num", verifiConfNum)) != null) {
                return ResponseFormat.retParam(50003, "数据已存在");
            }
            RulePutverifiInfoModel entity = new RulePutverifiInfoModel();
            entity.setVerifiDesc(verifiDesc);
            entity.setVerifiSpaceLimit(verifiSpaceLimit);
            entity.setVerifiMixLimit(verifiMixLimit);
            entity.setVerifiConfNum(verifiConfNum);
            entity.setCreateTime(DateTimeUtil.nowTimeStr());
            rulePutverifiService.save(entity);
            return ResponseFormat.retParam(200, "上架验证规则创建成功");
        } catch (Exception e) {
            logger.error("创建上架验证规则异常", e);
            return ResponseFormat.retParam(500, "创建上架验证规则异常");
        }
    }

    @RequestMapping(value = "putverifi/delete", method = RequestMethod.POST)
    @ApiOperation(value = "删除上架验证规则信息")
    public GenericResponse putverifiDoDelete(@ApiParam(value = "上架验证规则Id", required = true) @RequestParam(value = "id") Integer id) {
        try {
            rulePutverifiService.removeById(id);
            return ResponseFormat.retParam(200, "删除上架验证规则成功");
        } catch (Exception e) {
            logger.error("删除上架验证规则异常", e);
            return ResponseFormat.retParam(500, "删除上架验证规则异常");
        }
    }

    @RequestMapping(value = "putverifi/update", method = RequestMethod.POST)
    @ApiOperation(value = "修改上架验证规则信息")
    public GenericResponse putverifiDoUpdate(
            @ApiParam(value = "配置代码", required = true) @RequestParam Integer id,
            @ApiParam(value = "描述") @RequestParam(required = false) String verifiDesc,
            @ApiParam(value = "库位混放限制") @RequestParam(required = false) String verifiMixLimit,
            @ApiParam(value = "库位空间限制") @RequestParam(required = false) String verifiSpaceLimit
    ) {
        try {
            if (rulePutverifiService.getById(id) == null) {
                return ResponseFormat.retParam(50001, "数据未找到");
            }
            RulePutverifiInfoModel entity = new RulePutverifiInfoModel();
            entity.setId(id);
            entity.setVerifiDesc(verifiDesc);
            entity.setVerifiSpaceLimit(verifiSpaceLimit);
            entity.setVerifiMixLimit(verifiMixLimit);
            entity.setUpdateTime(DateTimeUtil.nowTimeStr());
            rulePutverifiService.updateById(entity);
            return ResponseFormat.retParam(200, "上架验证规则信息修改成功");
        } catch (Exception e) {
            logger.error("上架验证规则信息修改异常", e);
            return ResponseFormat.retParam(500, "上架验证规则信息修改异常");

        }
    }

}
