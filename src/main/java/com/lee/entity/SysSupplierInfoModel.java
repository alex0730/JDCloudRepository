package com.lee.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("sys_supplier_info")
public class SysSupplierInfoModel implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键Id
     */
    private Integer id;
    /**
     * 供应商编号
     */
    private String supNum;
    /**
     * 供应商名称
     */
    private String supName;
    /**
     * 联系人
     */
    private String supContacts;
    /**
     * 联系地址
     */
    private String supAddress;
    /**
     * 联系电话
     */
    private String supTeleno;
    /**
     * 联系邮箱
     */
    private String supMail;
    /**
     * 银行账户
     */
    private String supAccountNumber;
    /**
     * 开户行名称
     */
    private String supBankName;
    /**
     * 备注
     */
    private String supRemark;
    /**
     * 创建时间
     */
    private String createTime;
    /**
     * 更新时间
     */
    private String updateTime;
    /**
     * 扩展字段
     */
    private String supExt;

}
