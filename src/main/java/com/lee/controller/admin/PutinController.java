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
@RequestMapping("/putin")
public class PutinController extends BasicController {
    @Autowired
    CateService cateService;

    /**
     * 栏目列表
     *
     * @return
     */
    @GetMapping("purchase")
    public String purchaseList() {
        return "admin/putin/list";
    }

    /**
     * 加载列表数据
     */
    @PostMapping("purchase/findList")
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
        List<WarehousingInfoModel> pageInfo = new ArrayList<WarehousingInfoModel>();
        WarehousingInfoModel model = new WarehousingInfoModel();
        model.setId(1);
        model.setWarehousingNum("YJ20210915");
        model.setPurchaseNum("10461");
        model.setMatPurchaseNum("YJ256233");
        model.setSupplierName("xxxxxx");
        model.setMatPurchaseName("除菌液");
        model.setMatSpecs("威猛84");
        model.setMatTypeName("消毒产品");
        model.setWarehousingPurposeName("防汛");
        model.setAmountType("XXXXXXX");
        model.setReceivableCount(300);
        model.setReceivedCount(300);
        model.setWarehousingStatusName("验收中");
        pageInfo.add(model);
        DataGrid result = new DataGrid();
        result.setRows(pageInfo);
        result.setTotal(10L);
        return result;
    }

}
