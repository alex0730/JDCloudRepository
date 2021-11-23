package com.lee.controller.admin;


import com.alibaba.fastjson.JSONObject;
import com.lee.common.DataGrid;
import com.lee.entity.SysEnumInfoModel;
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
@RequestMapping("/sys/other")
public class EnumController extends BasicController {
    @Autowired
    CateService cateService;

    /**
     * 栏目列表
     *
     * @return
     */
    @GetMapping("enum")
    public String list() {
        return "admin/enum/list";
    }

    /**
     * 加载列表数据
     */
    @PostMapping("enum/findList")
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
        List<SysEnumInfoModel> pageInfo = new ArrayList<SysEnumInfoModel>();
        SysEnumInfoModel model = new SysEnumInfoModel();
        model.setEnuNum("111");
        model.setEnuName("专项资金");
        model.setEnuDicNum("1");
        model.setEnuDicOrder("1");
        model.setEnuStatus("1");
        model.setEnuRemark("2");
        model.setCreateTime("2020-03-12 11:45:30");
        pageInfo.add(model);
        DataGrid result = new DataGrid();
        result.setRows(pageInfo);
        result.setTotal(10L);
        return result;
    }
}
