package com.lee.controller.admin;


import com.alibaba.fastjson.JSONObject;
import com.lee.common.DataGrid;
import com.lee.entity.PurchaseOrderInfoModel;
import com.lee.entity.PurchasePaymentInfoModel;
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
@RequestMapping("/purchase")
public class PurchaseController extends BasicController {
    @Autowired
    CateService cateService;

    /**
     * 栏目列表
     *
     * @return
     */
    @GetMapping("list")
    public String list() {
        return "admin/purchase/list";
    }

    /**
     * 加载列表数据
     */
    @PostMapping("findList")
    @ResponseBody
    public DataGrid findList(@RequestBody JSONObject jsonObject) {
//        Map<String, Object> searchParams = (HashMap<String, Object>) jsonObject.get("search");
//        int offset = "".equals(jsonObject.getString("offset")) ? 0 : jsonObject.getIntValue("offset");
//        int size = "".equals(jsonObject.getString("limit")) ? 10 : jsonObject.getIntValue("limit");
//
//        IPage<Map<String, Object>> page = cateService.getPageInfo(searchParams, offset, size);
//
//        DataGrid result = new DataGrid();
//        result.setTotal(page.getTotal());
//        result.setRows(page.getRecords());
        List<PurchaseOrderInfoModel> pageInfo = new ArrayList<PurchaseOrderInfoModel>();
        PurchaseOrderInfoModel model = new PurchaseOrderInfoModel();
        model.setPurchaseNum("10451");
        model.setPurchaseDate("2020-03-12");
        model.setSupplierName("泰达洁净");
        model.setOrderAmount("24480");
        model.setCapitalTypeName("专项资金");
        model.setPurchasePaymentStatus("0");
        model.setPurchasePerson("王XX");
        model.setPurchasePurpose("防汛储备");
        model.setPurchaseBasis("XXX");
        model.setPurchaseCreateDate("2020-09-08");
        model.setPurchaseCompleteDate("-");
        pageInfo.add(model);
        DataGrid result = new DataGrid();
        result.setRows(pageInfo);
        result.setTotal(10L);
        return result;
    }
    /**
     * 加载列表数据
     */
    @GetMapping("add")
    public String add() {
        return "admin/purchase/add";
    }

    @GetMapping("/view/{id}")
    public String update(@PathVariable Integer id, PurchaseOrderInfoModel model) {
        model.setId(1);
        model.setPurchaseNum("10451");
        model.setPurchaseDate("2020-03-12");
        model.setSupplierName("泰达洁净");
        model.setOrderAmount("24480");
        model.setCapitalTypeName("专项资金");
        model.setPurchasePaymentStatusName("部分付款");
        model.setPurchasePerson("王XX");
        model.setPurchasePurposeName("防汛储备");
        model.setPurchaseBasis("XXX");
        model.setPurchaseCreateDate("2020-09-08");
        model.setPurchaseCompleteDate("-");
        model.setContractSigningDate("2020-09-08");
        model.setCapitalTypeName("专项资金");
        model.setOrderAmount("450,000");
        return "admin/purchase/view";
    }


    @PostMapping("paymentInfo")
    @ResponseBody
    public DataGrid getPaymentInfo(@RequestBody JSONObject jsonObject) {
        List<PurchasePaymentInfoModel> pageInfo = new ArrayList<PurchasePaymentInfoModel>();
        PurchasePaymentInfoModel model = new PurchasePaymentInfoModel();
        model.setId(1);
        model.setPurchasePaymentAmount("90,000");
        model.setPurchasePaymentDate("2020年3月15日");
        model.setPurchasePaymentRatio("20%");
        pageInfo.add(model);
        DataGrid result = new DataGrid();
        result.setRows(pageInfo);
        result.setTotal(10L);
        return result;
    }


}
