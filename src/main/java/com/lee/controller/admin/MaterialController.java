package com.lee.controller.admin;

import com.alibaba.fastjson.JSONObject;
import com.lee.common.DataGrid;
import com.lee.entity.SysMaterialInfoModel;
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
public class MaterialController extends BasicController {
    @Autowired
    AdminService adminService;

    /**
     * 管理员管理列表页面跳转
     *
     * @return
     */
    @RequestMapping("material")
    public String supplierList(HttpServletRequest request) {
        if (getCurrentUser(request).getIsSupper() == 1) {
            return "admin/material/list";
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
    @RequestMapping("material/findList")
    @ResponseBody
    public DataGrid supplierfindList(@RequestBody JSONObject jsonObject) {
        //获取查询参数
//        Map<String, Object> searchParams = (HashMap<String, Object>) jsonObject.get("search");
//        int offset = "".equals(jsonObject.getString("offset")) ? 0 : jsonObject.getIntValue("offset");
//        int size = "".equals(jsonObject.getString("limit")) ? 10 : jsonObject.getIntValue("limit");
//        searchParams.put("offsetIndex", offset);
//        searchParams.put("limit", size);
//        List<Role> pageInfo = adminService.getPageInfo(searchParams);
        List<SysMaterialInfoModel> pageInfo = new ArrayList<SysMaterialInfoModel>();
        SysMaterialInfoModel model = new SysMaterialInfoModel();
        model.setMatPurchaseNum("10461");
        model.setMatOrderNum("YJ20210915");
        model.setMatName("除菌液");
        model.setMatTypeName("消毒产品");
        model.setMatSpecs("威猛84");
        model.setMatUnit("瓶");
        model.setSupplierName("天津金元宝商厦集团有限公司");
        model.setMatNum(100);
        model.setMatTemporaryDate("2021-03-12");
        model.setUnitPrice("5.5");
        model.setMatNum(10);
        model.setTotalAmount("55");
        model.setMatStatus("未发货");
        pageInfo.add(model);
        DataGrid result = new DataGrid();
        result.setRows(pageInfo);
        result.setTotal(10L);

        return result;
    }


}
