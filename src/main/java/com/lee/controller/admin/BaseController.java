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
@RequestMapping("/base")
public class BaseController extends BasicController {
    @Autowired
    CateService cateService;

    /**
     * 栏目列表
     *
     * @return
     */
    @GetMapping("storage/category")
    public String categoryList() {
        return "admin/category/list";
    }

    /**
     * 加载列表数据
     */
    @PostMapping("storage/category/findList")
    @ResponseBody
    public DataGrid categoryFindList(@RequestBody JSONObject jsonObject) {
//        Map<String, Object> searchParams = (HashMap<String, Object>) jsonObject.get("search");
//        int offset = "".equals(jsonObject.getString("offset")) ? 0 : jsonObject.getIntValue("offset");
//        int size = "".equals(jsonObject.getString("limit")) ? 10 : jsonObject.getIntValue("limit");
//
//        IPage<Map<String, Object>> page = cateService.getPageInfo(searchParams, offset, size);
//
//        DataGrid result = new DataGrid();
//        result.setTotal(page.getTotal());
//        result.setRows(page.getRecords());
        List<BaseCategoryInfoModel> pageInfo = new ArrayList<BaseCategoryInfoModel>();
        BaseCategoryInfoModel model = new BaseCategoryInfoModel();
        model.setId(1);
        model.setCategoryNum("CMH0001");
        model.setCategoryName("耐用雨靴");
        model.setCategoryParentName("雨靴");
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
    @GetMapping("storage/barea")
    public String bareaList() {
        return "admin/barea/list";
    }

    /**
     * 加载列表数据
     */
    @PostMapping("storage/barea/findList")
    @ResponseBody
    public DataGrid bareaFindList(@RequestBody JSONObject jsonObject) {
//        Map<String, Object> searchParams = (HashMap<String, Object>) jsonObject.get("search");
//        int offset = "".equals(jsonObject.getString("offset")) ? 0 : jsonObject.getIntValue("offset");
//        int size = "".equals(jsonObject.getString("limit")) ? 10 : jsonObject.getIntValue("limit");
//
//        IPage<Map<String, Object>> page = cateService.getPageInfo(searchParams, offset, size);
//
//        DataGrid result = new DataGrid();
//        result.setTotal(page.getTotal());
//        result.setRows(page.getRecords());
        List<BaseBareaInfoModel> pageInfo = new ArrayList<BaseBareaInfoModel>();
        BaseBareaInfoModel model = new BaseBareaInfoModel();
        model.setId(1);
        model.setBareaNum("A");
        model.setBareaName("一大区");
        model.setDepositoryName("泰达电力仓库");
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
    @GetMapping("storage/depository")
    public String depositoryList() {
        return "admin/depository/list";
    }

    /**
     * 加载列表数据
     */
    @PostMapping("storage/depository/findList")
    @ResponseBody
    public DataGrid depositoryFindList(@RequestBody JSONObject jsonObject) {
//        Map<String, Object> searchParams = (HashMap<String, Object>) jsonObject.get("search");
//        int offset = "".equals(jsonObject.getString("offset")) ? 0 : jsonObject.getIntValue("offset");
//        int size = "".equals(jsonObject.getString("limit")) ? 10 : jsonObject.getIntValue("limit");
//
//        IPage<Map<String, Object>> page = cateService.getPageInfo(searchParams, offset, size);
//
//        DataGrid result = new DataGrid();
//        result.setTotal(page.getTotal());
//        result.setRows(page.getRecords());
        List<BaseDepositoryInfoModel> pageInfo = new ArrayList<BaseDepositoryInfoModel>();
        BaseDepositoryInfoModel model = new BaseDepositoryInfoModel();
        model.setId(1);
        model.setDepositoryNum("800005321");
        model.setDepositoryName("泰达电力仓库");
        model.setDepositoryPerson("王五");
        model.setDepositoryMobile("13700000001");
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
    @GetMapping("storage/sarea")
    public String sareaList() {
        return "admin/sarea/list";
    }

    /**
     * 加载列表数据
     */
    @PostMapping("storage/sarea/findList")
    @ResponseBody
    public DataGrid sareaFindList(@RequestBody JSONObject jsonObject) {
//        Map<String, Object> searchParams = (HashMap<String, Object>) jsonObject.get("search");
//        int offset = "".equals(jsonObject.getString("offset")) ? 0 : jsonObject.getIntValue("offset");
//        int size = "".equals(jsonObject.getString("limit")) ? 10 : jsonObject.getIntValue("limit");
//
//        IPage<Map<String, Object>> page = cateService.getPageInfo(searchParams, offset, size);
//
//        DataGrid result = new DataGrid();
//        result.setTotal(page.getTotal());
//        result.setRows(page.getRecords());
        List<BaseSareaInfoModel> pageInfo = new ArrayList<BaseSareaInfoModel>();
        BaseSareaInfoModel model = new BaseSareaInfoModel();
        model.setId(1);
        model.setSareaNum("A-1");
        model.setSareaName("储区1");
        model.setBareaName("一大区");
        model.setSareaTypeName("照明设备");
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
    @GetMapping("storage/sposition")
    public String spositionList() {
        return "admin/sposition/list";
    }

    /**
     * 加载列表数据
     */
    @PostMapping("storage/sposition/findList")
    @ResponseBody
    public DataGrid spositionFindList(@RequestBody JSONObject jsonObject) {
//        Map<String, Object> searchParams = (HashMap<String, Object>) jsonObject.get("search");
//        int offset = "".equals(jsonObject.getString("offset")) ? 0 : jsonObject.getIntValue("offset");
//        int size = "".equals(jsonObject.getString("limit")) ? 10 : jsonObject.getIntValue("limit");
//
//        IPage<Map<String, Object>> page = cateService.getPageInfo(searchParams, offset, size);
//
//        DataGrid result = new DataGrid();
//        result.setTotal(page.getTotal());
//        result.setRows(page.getRecords());
        List<BaseSpositionInfoModel> pageInfo = new ArrayList<BaseSpositionInfoModel>();
        BaseSpositionInfoModel model = new BaseSpositionInfoModel();
        model.setId(1);
        model.setSpositionNum("A-1-01");
        model.setSpositionLayer(1);
        model.setSpositionPutonOrder(1);
        model.setSpositionWorkOrder(1);
        model.setBareaName("一大区");
        model.setSareaName("储区1");
        model.setSpositionTypeName("照明设备");
        pageInfo.add(model);
        DataGrid result = new DataGrid();
        result.setRows(pageInfo);
        result.setTotal(10L);
        return result;
    }

//    /**
//     * 栏目列表
//     *
//     * @return
//     */
//    @GetMapping("storage/spositionr")
//    public String spositionrList() {
//        return "admin/spositionr/list";
//    }
//
//    /**
//     * 加载列表数据
//     */
//    @PostMapping("storage/sposition/findList")
//    @ResponseBody
//    public DataGrid spositionrFindList(@RequestBody JSONObject jsonObject) {
////        Map<String, Object> searchParams = (HashMap<String, Object>) jsonObject.get("search");
////        int offset = "".equals(jsonObject.getString("offset")) ? 0 : jsonObject.getIntValue("offset");
////        int size = "".equals(jsonObject.getString("limit")) ? 10 : jsonObject.getIntValue("limit");
////
////        IPage<Map<String, Object>> page = cateService.getPageInfo(searchParams, offset, size);
////
////        DataGrid result = new DataGrid();
////        result.setTotal(page.getTotal());
////        result.setRows(page.getRecords());
//        List<BaseSpositionSpecsInfoModel> pageInfo = new ArrayList<BaseSpositionSpecsInfoModel>();
//        BaseSpositionSpecsInfoModel model = new BaseSpositionSpecsInfoModel();
//        model.setSpecsNum("006");
//        model.setSpecsName("规则006");
//        model.setMaxWeight("20000");
//        model.setVolume("20");
//        model.setLength("20");
//        model.setWide("20");
//        model.setHeight("20");
//        pageInfo.add(model);
//        DataGrid result = new DataGrid();
//        result.setRows(pageInfo);
//        result.setTotal(10L);
//        return result;
//    }

    /**
     * 栏目列表
     *
     * @return
     */
    @GetMapping("storage/tunnel")
    public String tunnelList() {
        return "admin/tunnel/list";
    }

    /**
     * 加载列表数据
     */
    @PostMapping("storage/tunnel/findList")
    @ResponseBody
    public DataGrid tunnelFindList(@RequestBody JSONObject jsonObject) {
//        Map<String, Object> searchParams = (HashMap<String, Object>) jsonObject.get("search");
//        int offset = "".equals(jsonObject.getString("offset")) ? 0 : jsonObject.getIntValue("offset");
//        int size = "".equals(jsonObject.getString("limit")) ? 10 : jsonObject.getIntValue("limit");
//
//        IPage<Map<String, Object>> page = cateService.getPageInfo(searchParams, offset, size);
//
//        DataGrid result = new DataGrid();
//        result.setTotal(page.getTotal());
//        result.setRows(page.getRecords());
        List<BaseTunnelInfoModel> pageInfo = new ArrayList<BaseTunnelInfoModel>();
        BaseTunnelInfoModel model = new BaseTunnelInfoModel();
        model.setId(1);
        model.setTunnelNum("A-1-01-01");
        model.setDepositoryName("泰达电力仓库");
        model.setBareaNum("A");
        model.setSareaNum("A-1");
        model.setSpositionNum("A-1-01");
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
    @GetMapping("print")
    public String printList() {
        return "admin/print/list";
    }

    /**
     * 加载列表数据
     */
    @PostMapping("print/findList")
    @ResponseBody
    public DataGrid printFindList(@RequestBody JSONObject jsonObject) {
//        Map<String, Object> searchParams = (HashMap<String, Object>) jsonObject.get("search");
//        int offset = "".equals(jsonObject.getString("offset")) ? 0 : jsonObject.getIntValue("offset");
//        int size = "".equals(jsonObject.getString("limit")) ? 10 : jsonObject.getIntValue("limit");
//
//        IPage<Map<String, Object>> page = cateService.getPageInfo(searchParams, offset, size);
//
//        DataGrid result = new DataGrid();
//        result.setTotal(page.getTotal());
//        result.setRows(page.getRecords());
        List<PrintInfoModel> pageInfo = new ArrayList<PrintInfoModel>();
        PrintInfoModel model = new PrintInfoModel();
        model.setId(1);
        model.setPrintName("Cjbvbnjm");
        model.setPrintConf("xxxxxxxxx");
        pageInfo.add(model);
        DataGrid result = new DataGrid();
        result.setRows(pageInfo);
        result.setTotal(10L);
        return result;
    }

}
