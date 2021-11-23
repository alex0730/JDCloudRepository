package com.lee.controller.admin;

import com.alibaba.fastjson.JSONObject;
import com.lee.common.DataGrid;
import com.lee.entity.SysSupplierInfoModel;
import com.lee.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/sys")
public class SupplierController extends BasicController {
    @Autowired
    AdminService adminService;

    /**
     * 管理员管理列表页面跳转
     *
     * @return
     */
    @RequestMapping("supplier")
    public String supplierList(HttpServletRequest request) {
        if (getCurrentUser(request).getIsSupper() == 1) {
            return "admin/supplier/list";
        } else {
            return "admin/home";
        }

    }

    /**
     * 加载列表数据
     *
     * @param jsonObject
     * @return
     */
    @RequestMapping("supplier/findList")
    @ResponseBody
    public DataGrid supplierfindList(@RequestBody JSONObject jsonObject) {
        //获取查询参数
//        Map<String, Object> searchParams = (HashMap<String, Object>) jsonObject.get("search");
//        int offset = "".equals(jsonObject.getString("offset")) ? 0 : jsonObject.getIntValue("offset");
//        int size = "".equals(jsonObject.getString("limit")) ? 10 : jsonObject.getIntValue("limit");
//        searchParams.put("offsetIndex", offset);
//        searchParams.put("limit", size);
//        List<Role> pageInfo = adminService.getPageInfo(searchParams);
        List<SysSupplierInfoModel> pageInfo = new ArrayList<>();
        SysSupplierInfoModel model = new SysSupplierInfoModel();
        model.setSupNum("CMS4418046517174");
        model.setSupName("天津元宝商厦集团有限公司");
        model.setSupContacts("张三");
        model.setSupAddress("xxxxxxxxx");
        model.setSupTeleno("13700000001");
        model.setUpdateTime("2021-11-17 22:22:22");
        model.setSupRemark("供应商的物资信息");
        pageInfo.add(model);
        DataGrid result = new DataGrid();
        result.setRows(pageInfo);
        result.setTotal(10L);

        return result;
    }


}
