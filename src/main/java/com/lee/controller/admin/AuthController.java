package com.lee.controller.admin;

import com.lee.common.DateTimeUtil;
import com.lee.entity.Admin;
import com.lee.entity.common.GenericResponse;
import com.lee.entity.common.ResponseFormat;
import com.lee.service.AdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Api(value = "系统管理", description = "系统管理")
@RestController
@RequestMapping("/sys/auth")
public class AuthController extends BasicController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    AdminService adminService;

    @RequestMapping(value = "user/findList", method = RequestMethod.GET)
    @ApiOperation(value = "用户信息列表")
    public GenericResponse findList(
            @ApiParam(value = "登录名称") @RequestParam(required = false) String username,
            @ApiParam(value = "手机号码") @RequestParam(required = false) String mobile,
            @ApiParam(value = "员工姓名") @RequestParam(required = false) String nickname,
            @ApiParam(value = "所属部门") @RequestParam(required = false) String deptId,
            @ApiParam(value = "员工角色") @RequestParam(required = false) String roleId,
            @ApiParam(value = "用户状态") @RequestParam(required = false) String status,
            @ApiParam(value = "创建开始时间") @RequestParam(required = false) String createTimeStart,
            @ApiParam(value = "创建结束时间") @RequestParam(required = false) String createTimeEnd,
            @ApiParam(value = "当前页面", required = true) @RequestParam Integer pageNo,
            @ApiParam(value = "每页记录数", required = true) @RequestParam Integer pageSize
    ) {
        Map<String, Object> searchParams = new HashMap<>();
        try {
            searchParams.put("username", username);
            searchParams.put("mobile", mobile);
            searchParams.put("nickname", nickname);
            searchParams.put("deptId", deptId);
            searchParams.put("roleId", roleId);
            searchParams.put("status", status);
            searchParams.put("createTimeStart", createTimeStart);
            searchParams.put("createTimeEnd", createTimeEnd);
            searchParams.put("offsetIndex", pageNo);
            searchParams.put("limit", pageSize);
            return adminService.getPageInfo(searchParams);
        } catch (Exception e) {
            logger.error("查询用户列表异常", e);
            return ResponseFormat.retParam(500, "查询用户列表异常");
        }
    }

    @RequestMapping(value = "user/view", method = RequestMethod.GET)
    @ApiOperation(value = "用户信息详情")
    public GenericResponse doView(@ApiParam(value = "用户Id", required = true) @RequestParam Integer id) {
        try {
            Admin adminInfo = adminService.getById(id);
            if (adminInfo == null) {
                return ResponseFormat.retParam(50001, "数据未找到");
            }
            return ResponseFormat.retParam(200, adminInfo);
        } catch (Exception e) {
            logger.error("用户修改异常", e);
            return ResponseFormat.retParam(500, "查询用户信息详情异常");

        }
    }

    @RequestMapping(value = "user/add", method = RequestMethod.POST)
    @ApiOperation(value = "添加用户信息")
    public GenericResponse doAdd(@ApiParam(value = "登录名称", required = true) @RequestParam(required = false) String userName,
                                 @ApiParam(value = "手机号码", required = true) @RequestParam(required = false) String mobile,
                                 @ApiParam(value = "员工姓名", required = true) @RequestParam(required = false) String nickname,
                                 @ApiParam(value = "员工姓名", required = true) @RequestParam(required = false) String passWord,
                                 @ApiParam(value = "员工角色", required = true) @RequestParam(required = false) String roleId,
                                 @ApiParam(value = "所属部门", required = true) @RequestParam(required = false) String deptId,
                                 @ApiParam(value = "用户状态", required = true) @RequestParam(required = false) Integer status) {
        try {
            if (adminService.getByUsername(userName) != null) {
                return ResponseFormat.retParam(50003, "数据已存在");
            }
            Admin model = new Admin();
            // TODO 用户编码生成规则
            model.setUserId(userName);
            model.setUsername(userName);
            model.setNickname(nickname);
            model.setPassword(passWord);
            model.setMobile(mobile);
            model.setDeptId(deptId);
            model.setRoleId(roleId);
            model.setStatus(status);
            model.setCreateTime(DateTimeUtil.nowTimeStr());
            adminService.save(model);
            return ResponseFormat.retParam(200, "用户创建成功");
        } catch (Exception e) {
            logger.error("创建用户异常", e);
            return ResponseFormat.retParam(500, "创建用户异常");
        }
    }

    @RequestMapping(value = "user/delete", method = RequestMethod.POST)
    @ApiOperation(value = "批量删除用户信息")
    public GenericResponse doDelete(@ApiParam(value = "用户Id",required = true) @RequestParam(value = "ids") List<Integer> ids) {
        try {
            for (int id : ids) {
                adminService.removeById(id);
            }
            return ResponseFormat.retParam(200, "删除成功");
        } catch (Exception e) {
            logger.error("删除用户异常", e);
            return ResponseFormat.retParam(500, "删除用户异常");
        }
    }

    @RequestMapping(value = "user/update", method = RequestMethod.POST)
    @ApiOperation(value = "修改用户信息")
    public GenericResponse doUpdate(
            @ApiParam(value = "用户Id", required = true) @RequestParam Integer id,
            @ApiParam(value = "员工姓名") @RequestParam(required = false)  String nickname,
            @ApiParam(value = "手机号码") @RequestParam(required = false)  String mobile,
            @ApiParam(value = "员工角色") @RequestParam(required = false)  String roleId,
            @ApiParam(value = "所属部门") @RequestParam(required = false)  String deptId,
            @ApiParam(value = "员工姓名") @RequestParam(required = false)  String passWord,
            @ApiParam(value = "用户状态") @RequestParam(required = false)  Integer status
    ) {
        try {
            Admin adminInfo = adminService.getById(id);
            if (adminInfo == null) {
                return ResponseFormat.retParam(50001, "数据未找到");
            }
            adminInfo.setPassword(passWord);
            adminInfo.setNickname(nickname);
            adminInfo.setMobile(mobile);
            adminInfo.setRoleId(roleId);
            adminInfo.setDeptId(deptId);
            adminInfo.setStatus(status);
            adminInfo.setUpdateTime(DateTimeUtil.nowTimeStr());
            adminService.updateById(adminInfo);
            return ResponseFormat.retParam(50001, "用户修改成功");
        } catch (Exception e) {
            logger.error("用户修改异常", e);
            return ResponseFormat.retParam(500, "用户修改异常");

        }
    }

}
