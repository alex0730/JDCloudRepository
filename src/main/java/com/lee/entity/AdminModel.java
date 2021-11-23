package com.lee.entity;

/**
 * <p>
 * 
 * </p>
 *
 * @author lee
 * @since 2020-02-19
 */
public class AdminModel extends Admin {

    private static final long serialVersionUID = 1L;

    /**
     * 管理员账户
     */
    private String roleName;

    /**
     * 密码
     */
    private String deptName;

    /**
     * 手机号
     */

    private String mobile;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
