package com.lee.controller.admin;


import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.lee.common.DataGrid;
import com.lee.common.DateTimeUtil;
import com.lee.common.Message;
import com.lee.entity.Admin;
import com.lee.entity.PictureModel;
import com.lee.service.PictureService;
import com.lee.service.PictureTagService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description [图片管理控制器]
 * @Author <a href="mailto: wuyingya@oristartech.com">吴迎亚</a>
 * @Date 2021/2/2 13:28
 **/
@Controller
@RequestMapping("/admin/pic")
public class PictureController extends BasicController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PictureService pictureService;

    @Autowired
    private PictureTagService pictureTagService;

    @PostMapping("/use")
    @ResponseBody
    public Message doUse(Integer id, Boolean flag) {
        int status = 1;
        try {
            PictureModel pictureModel = new PictureModel();
            pictureModel.setId(id);
            if (flag) {
                status = 0;
            }
            pictureModel.setUpdateTime(DateTimeUtil.nowTimeStr());
            pictureModel.setStatus(status);
            pictureService.updateById(pictureModel);
        } catch (Exception e) {
            logger.error("图片修改异常：", e);
            return Message.fail("图片状态修改失败！");
        }
        return Message.success("修改成功！");
    }

    @PostMapping("upload")
    @ResponseBody
    public Object upload(HttpServletRequest request) throws Exception {
        return pictureService.uploadFile(((MultipartHttpServletRequest) request).getFile("file"), request);
    }

    @GetMapping("list")
    public String list() {
        return "admin/pic/list";
    }

    /**
     * 分页查询图片列表
     *
     * @param jsonObject
     * @return
     */
    @PostMapping("findList")
    @ResponseBody
    public DataGrid findList(@RequestBody JSONObject jsonObject) {
        DataGrid result = new DataGrid();
        try {
            Map<String, Object> searchParams = (HashMap<String, Object>) jsonObject.get("search");
            IPage<Map<String, Object>> page = pictureService.getPageInfo(searchParams,
                    StringUtils.isEmpty(jsonObject.getString("offset")) ? 0 : jsonObject.getIntValue("offset"),
                    StringUtils.isEmpty(jsonObject.getString("limit")) ? 5 : jsonObject.getIntValue("limit"));
            result.setTotal(page.getTotal());
            result.setRows(page.getRecords());
        } catch (Exception e) {
            logger.error("分页查询图片列表异常：", e);
        }
        return result;
    }

    /**
     * 跳转新建图片页面
     *
     * @return
     */
    @GetMapping("add")
    public String add(Model model) {
        model.addAttribute("pictureTagInfos", pictureTagService.list());
        return "admin/pic/add";
    }

    /**
     * 保存图片信息
     *
     * @param pictureModel
     * @param request
     * @return
     */
    @PostMapping("add")
    @ResponseBody
    public Message doAdd(@Validated PictureModel pictureModel, HttpServletRequest request) {
        try {
            Admin admin = getCurrentUser(request);
            if (null == admin) {
                return Message.fail("登录超时，请重新登录！", null, "/admin/login");
            }
            if (null == pictureModel) {
                return Message.fail("图片信息确实，请检查上传参数", null, "/admin/login");
            }
            pictureModel.setAdminId(admin.getId());
            pictureModel.setCreateTime(DateTimeUtil.nowTimeStr());
            pictureService.save(pictureModel);
        } catch (Exception e) {
            logger.error("保存图片信息异常：", e);
            return Message.fail("保存失败！");
        }
        return Message.success("保存成功！");
    }

    /**
     * 删除图片
     *
     * @param ids
     * @return
     */
    @PostMapping("delete")
    @ResponseBody
    public Message delete(@RequestParam(value = "ids") List<Integer> ids) {
        try {
            pictureService.removeByIds(ids);
        } catch (Exception e) {
            logger.error("删除图片异常", e);
            return Message.fail("删除图片异常！");
        }
        return Message.success("删除图片成功");
    }


    @PostMapping("sort")
    @ResponseBody
    public Message sort(@RequestParam(value = "id") Integer id,
                        @RequestParam(value = "sort") Integer sort) {
        try {
            PictureModel pictureModel = pictureService.getById(id);
            if (pictureModel != null) {
                pictureModel.setSort(sort);
                pictureModel.setUpdateTime(DateTimeUtil.nowTimeStr());
                pictureService.updateById(pictureModel);
                return Message.success("排序成功！");
            } else {
                return Message.fail("图片不存在或已被删除，排序失败！");
            }
        } catch (Exception e) {
            return Message.fail("排序数据操作异常，排序失败！");
        }
    }
//    @PostMapping("top")
//    @ResponseBody
//    public Message top(@RequestParam(value = "id")Integer id,@Re  questParam(value = "istop")Integer istop){
//        try{
//           Article material =  articleService.getById(id);
//           if(material != null) {
//               if(istop == 1) {
//                   material.setIsTop(0);
//               } else if(istop == 0) {
//                   material.setIsTop(1);
//               }
//               articleService.updateById(material);
//               return Message.success("操作成功！");
//           } else {
//               return Message.fail("文章不存在或已被删除，操作失败！");
//           }
//        } catch (Exception e) {
//            return Message.fail("文章推荐操作处理异常！");
//        }
//    }
//    @GetMapping("/update/{id}")
//    public String update(@PathVariable Integer id,Model model){
//       Article material =  articleService.getById(id);
//        model.addAttribute("cateInfos",cateService.getList());
//        model.addAttribute("articleInfo",material);
//       return "admin/material/update";
//    }


}
