package com.lee.controller.admin;


import com.alibaba.fastjson.JSONObject;
import com.lee.common.DataGrid;
import com.lee.entity.ExwarehouseInfoModel;
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
@RequestMapping("/putout/neworder")
public class PutoutController extends BasicController {
    @Autowired
    CateService cateService;

    /**
     * 栏目列表
     *
     * @return
     */
    @GetMapping("neworder")
    public String purchaseList() {
        return "admin/putout/list";
    }

    /**
     * 加载列表数据
     */
    @PostMapping("neworder/findList")
    @ResponseBody
    public DataGrid purchaseFindList(@RequestBody JSONObject jsonObject) {
//        Map<String, Object> searchParams = (HashMap<String, Object>) jsonObject.get("search");
//        int offset = "".equals(jsonObject.getString("offset")) ? 0 : jsonObject.getIntValue("offset");
//        int size = "".equals(jsonObject.getString("limit")) ? 10 : jsonObject.getIntValue("limit");
//
//        IPage<Map<String, Object>> page = cateService.getPageInfo(searchParams, offset, size);
//
//        DataGrid result = new DataGrid();
//        result.setTotal(page.getTotal());
//        result.setRows(page.getRecords());
        List<ExwarehouseInfoModel> pageInfo = new ArrayList<ExwarehouseInfoModel>();
        ExwarehouseInfoModel model = new ExwarehouseInfoModel();
        model.setId(1);
        model.setExwarehouNum("YJ20210915");
        model.setExwarehouCount(60);
        model.setClaimCompany("事业单位");
        model.setClaimMode("自取");
        model.setClaimPersonMobile("13600000001");
        model.setClaimPerson("XXX");
        model.setClaimDatetime("2020-03-12 18:32:55");
        model.setMatPurchaseName("消毒手套");
        model.setMatTypeName("物资类别");
        pageInfo.add(model);
        DataGrid result = new DataGrid();
        result.setRows(pageInfo);
        result.setTotal(10L);
        return result;
    }

}
