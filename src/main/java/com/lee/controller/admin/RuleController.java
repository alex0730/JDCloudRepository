package com.lee.controller.admin;


import com.alibaba.fastjson.JSONObject;
import com.lee.common.DataGrid;
import com.lee.entity.*;
import com.lee.service.CateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author lee
 * @since 2020-02-21
 */
@Controller
@RequestMapping("/base/rule")
public class RuleController extends BasicController {
    @Autowired
    CateService cateService;

    /**
     * 栏目列表
     *
     * @return
     */
    @GetMapping("putrecomm")
    public String putrecommList() {
        return "admin/putrecomm/list";
    }

    /**
     * 加载列表数据
     */
    @PostMapping("putrecomm/findList")
    @ResponseBody
    public DataGrid putrecommFindList(@RequestBody JSONObject jsonObject) {
//        Map<String, Object> searchParams = (HashMap<String, Object>) jsonObject.get("search");
//        int offset = "".equals(jsonObject.getString("offset")) ? 0 : jsonObject.getIntValue("offset");
//        int size = "".equals(jsonObject.getString("limit")) ? 10 : jsonObject.getIntValue("limit");
//
//        IPage<Map<String, Object>> page = cateService.getPageInfo(searchParams, offset, size);
//
//        DataGrid result = new DataGrid();
//        result.setTotal(page.getTotal());
//        result.setRows(page.getRecords());
        List<RulePutrecommInfoModel> pageInfo = new ArrayList<RulePutrecommInfoModel>();
        RulePutrecommInfoModel model = new RulePutrecommInfoModel();
        model.setId(1);
        model.setPutonNum("UP001");
        model.setPutonName("上架规则名称");
        model.setPutonDesc("上架规则描述");
        pageInfo.add(model);
        DataGrid result = new DataGrid();
        result.setRows(pageInfo);
        result.setTotal(10L);
        return result;
    }

    /**
     * 栏目列表
     *
     * @return
     */
    @GetMapping("putverifi")
    public String putverifiList() {
        return "admin/putverifi/list";
    }

    /**
     * 加载列表数据
     */
    @PostMapping("putverifi/findList")
    @ResponseBody
    public DataGrid putverifiFindList(@RequestBody JSONObject jsonObject) {
//        Map<String, Object> searchParams = (HashMap<String, Object>) jsonObject.get("search");
//        int offset = "".equals(jsonObject.getString("offset")) ? 0 : jsonObject.getIntValue("offset");
//        int size = "".equals(jsonObject.getString("limit")) ? 10 : jsonObject.getIntValue("limit");
//
//        IPage<Map<String, Object>> page = cateService.getPageInfo(searchParams, offset, size);
//
//        DataGrid result = new DataGrid();
//        result.setTotal(page.getTotal());
//        result.setRows(page.getRecords());
        List<RulePutverifiInfoModel> pageInfo = new ArrayList<RulePutverifiInfoModel>();
        RulePutverifiInfoModel model = new RulePutverifiInfoModel();
        model.setId(1);
        model.setVerifiConfNum("UpConfirm01");
        model.setVerifiMixLimit("没有限制");
        model.setVerifiSpaceLimit("没有限制");
        model.setVerifiDesc("描述");
        model.setCreator("王五");
        model.setCreateTime("2020-03-12 11:45:30");
        model.setUpdater("王五");
        model.setUpdateTime("2020-03-12 11:45:30");
        pageInfo.add(model);
        DataGrid result = new DataGrid();
        result.setRows(pageInfo);
        result.setTotal(10L);
        return result;
    }

    /**
     * 栏目列表
     *
     * @return
     */
    @GetMapping("stockturn")
    public String stockturnList() {
        return "admin/stockturn/list";
    }

    /**
     * 加载列表数据
     */
    @PostMapping("stockturn/findList")
    @ResponseBody
    public DataGrid stockturnFindList(@RequestBody JSONObject jsonObject) {
//        Map<String, Object> searchParams = (HashMap<String, Object>) jsonObject.get("search");
//        int offset = "".equals(jsonObject.getString("offset")) ? 0 : jsonObject.getIntValue("offset");
//        int size = "".equals(jsonObject.getString("limit")) ? 10 : jsonObject.getIntValue("limit");
//
//        IPage<Map<String, Object>> page = cateService.getPageInfo(searchParams, offset, size);
//
//        DataGrid result = new DataGrid();
//        result.setTotal(page.getTotal());
//        result.setRows(page.getRecords());
        List<RuleStockturnInfoModel> pageInfo = new ArrayList<RuleStockturnInfoModel>();
        RuleStockturnInfoModel model = new RuleStockturnInfoModel();
        model.setId(1);
        model.setStockturnNum("ZZ001");
        model.setStockturnName("到期日期-生产日期");
        model.setStockturnDesc("优先到期日期,若无则按生产日期");
        model.setStockturnRemark("按照从小到大排序");
        pageInfo.add(model);
        DataGrid result = new DataGrid();
        result.setRows(pageInfo);
        result.setTotal(10L);
        return result;
    }
    /**
     * 栏目列表
     *
     * @return
     */
    @GetMapping("location")
    public String locationList() {
        return "admin/location/list";
    }

    /**
     * 加载列表数据
     */
    @PostMapping("location/findList")
    @ResponseBody
    public DataGrid locationFindList(@RequestBody JSONObject jsonObject) {
//        Map<String, Object> searchParams = (HashMap<String, Object>) jsonObject.get("search");
//        int offset = "".equals(jsonObject.getString("offset")) ? 0 : jsonObject.getIntValue("offset");
//        int size = "".equals(jsonObject.getString("limit")) ? 10 : jsonObject.getIntValue("limit");
//
//        IPage<Map<String, Object>> page = cateService.getPageInfo(searchParams, offset, size);
//
//        DataGrid result = new DataGrid();
//        result.setTotal(page.getTotal());
//        result.setRows(page.getRecords());
        List<RuleLocationInfoModel> pageInfo = new ArrayList<RuleLocationInfoModel>();
        RuleLocationInfoModel model = new RuleLocationInfoModel();
        model.setId(1);
        model.setLocationNum("DW0001");
        model.setLocationName("非保质日期定位规则");
        model.setLocationDesc("在指定区域清空库");
        model.setRuleCode("清除库位优先");
        model.setFilterTempMat("是");
        model.setSpositionNumPolicy("清除库位");
        model.setLocationDepositoryLimit("存储位拣选");
        model.setCreator("王五");
        model.setCreateTime("2020-03-12 11:45:30");
        model.setUpdater("王五");
        model.setUpdateTime("2020-03-12 11:45:30");
        pageInfo.add(model);
        DataGrid result = new DataGrid();
        result.setRows(pageInfo);
        result.setTotal(10L);
        return result;
    }
    /**
     * 栏目列表
     *
     * @return
     */
    @GetMapping("picking")
    public String pickingList() {
        return "admin/picking/list";
    }

    /**
     * 加载列表数据
     */
    @PostMapping("picking/findList")
    @ResponseBody
    public DataGrid pickingFindList(@RequestBody JSONObject jsonObject) {
//        Map<String, Object> searchParams = (HashMap<String, Object>) jsonObject.get("search");
//        int offset = "".equals(jsonObject.getString("offset")) ? 0 : jsonObject.getIntValue("offset");
//        int size = "".equals(jsonObject.getString("limit")) ? 10 : jsonObject.getIntValue("limit");
//
//        IPage<Map<String, Object>> page = cateService.getPageInfo(searchParams, offset, size);
//
//        DataGrid result = new DataGrid();
//        result.setTotal(page.getTotal());
//        result.setRows(page.getRecords());
        List<RulePickingInfoModel> pageInfo = new ArrayList<RulePickingInfoModel>();
        RulePickingInfoModel model = new RulePickingInfoModel();
        model.setId(1);
        model.setPickingNum("0001");
        model.setPickingDesc("默认规则");
        model.setPickingExecuteOrder(1);
        model.setPickingStatus("启动");
        model.setPickingOrderType("不限");
        model.setSupplierName("xxx");
        model.setUpdater("王五");
        model.setUpdateTime("2020-03-12 11:45:30");
        pageInfo.add(model);
        DataGrid result = new DataGrid();
        result.setRows(pageInfo);
        result.setTotal(10L);
        return result;
    }

    /**
     * 栏目列表
     *
     * @return
     */
    @GetMapping("conf")
    public String confList() {
        return "admin/conf/list";
    }

    /**
     * 加载列表数据
     */
    @PostMapping("conf/findList")
    @ResponseBody
    public DataGrid confFindList(@RequestBody JSONObject jsonObject) {
//        Map<String, Object> searchParams = (HashMap<String, Object>) jsonObject.get("search");
//        int offset = "".equals(jsonObject.getString("offset")) ? 0 : jsonObject.getIntValue("offset");
//        int size = "".equals(jsonObject.getString("limit")) ? 10 : jsonObject.getIntValue("limit");
//
//        IPage<Map<String, Object>> page = cateService.getPageInfo(searchParams, offset, size);
//
//        DataGrid result = new DataGrid();
//        result.setTotal(page.getTotal());
//        result.setRows(page.getRecords());
        List<RuleConfInfoModel> pageInfo = new ArrayList<RuleConfInfoModel>();
        RuleConfInfoModel model = new RuleConfInfoModel();
        model.setId(1);
        model.setConfDesc("补货上架推荐规则");
        model.setRuleName("默认规则");
        model.setRuleTypeName("上架推荐规则");
        model.setBusinessTypeName("入库");
        model.setOperationTypeName("补货");
        model.setMaterialTypeName("照明设备");
        model.setSupplierName("事业单位");
        model.setMaterialName("电池式防爆电筒");
        model.setConfPriority(1);
        pageInfo.add(model);
        DataGrid result = new DataGrid();
        result.setRows(pageInfo);
        result.setTotal(10L);
        return result;
    }


}
