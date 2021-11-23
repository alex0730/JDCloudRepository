package com.lee.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Data
public class Admin extends Model<Admin> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 管理员账户
     */
    @NotEmpty(message = "用户名不能为空！")
    private String username;

    /**
     * 密码
     */
    @NotEmpty(message = "密码不能为空！")
    private String password;

    /**
     * 昵称
     */
    @NotEmpty(message = "昵称不能为空！")
    private String nickname;

    /**
     * 邮箱
     */
    @NotEmpty(message = "邮箱不能为空！")
    @Email(message = "邮箱格式不正确")
    private String email;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 是否超级管理员
     */
    private Integer isSupper;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 更新时间
     */
    private String updateTime;

    /**
     * 软删除时间
     */
    private String deleteTime;

    @TableLogic
    private Integer isdel;//逻辑删除字段 0 未删除 1已删除

    /**
     * 管理员账户
     */
    @TableField(exist = false)
    private String roleName;

    @TableField(exist = false)
    private String roleId;

    /**
     * 密码
     */
    @TableField(exist = false)
    private String deptName;

    private String deptId;

    /**
     * 手机号
     */
    private String mobile;

    private String userId;
}
