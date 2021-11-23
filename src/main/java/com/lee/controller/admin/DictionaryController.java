package com.lee.controller.admin;


import com.alibaba.fastjson.JSONObject;
import com.lee.common.DataGrid;
import com.lee.entity.SysDictionaryInfoModel;
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
public class DictionaryController extends BasicController {
    @Autowired
    CateService cateService;

    /**
     * 栏目列表
     *
     * @return
     */
    @GetMapping("dictionary")
    public String list() {
        return "admin/dictionary/list";
    }

    /**
     * 加载列表数据
     */
    @PostMapping("dictionary/findList")
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
//        return result;
        List<SysDictionaryInfoModel> pageInfo = new ArrayList<SysDictionaryInfoModel>();
        SysDictionaryInfoModel model = new SysDictionaryInfoModel();
        model.setDicNum("111");
        model.setDicDataName("物资类别");
        model.setDicName("item_cate");
        model.setDicStatus("1");
        model.setDicRemark("");
        model.setCreateTime("2020-03-12 11:45:30");
        pageInfo.add(model);
        DataGrid result = new DataGrid();
        result.setRows(pageInfo);
        result.setTotal(10L);
        return result;
    }
}
