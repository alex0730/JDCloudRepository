package com.lee.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName(value = "sys_material_info")
public class SysMaterialInfoModel implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键Id
     */
    private Integer id;
    /**
     * 采购编号
     */
    private String matPurchaseNum;
    /**
     * 入库单号
     */
    private String matOrderNum;
    /**
     * 物资名称
     */
    private String matName;
    /**
     * 物资类别（material_type_id）
     */
    private String matTypeCode;

    /**
     * 物资类别（material_type_id）
     */
    @TableField(exist = false)
    private String matTypeName;
    /**
     * 物资规格
     */
    private String matSpecs;
    /**
     * 物资单位
     */
    private String matUnit;
    /**
     * 供应商编码
     */
    private String supplierNum;

    @TableField(exist = false)
    private String supplierName;
    /**
     * 库存
     */
    private Integer matNum;
    /**
     * 临期时间
     */
    private String matTemporaryDate;
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
    private String matExt;

    /**
     * 单价
     */
    @TableField(exist = false)
    private String unitPrice;
    /**
     * 数量
     */
    @TableField(exist = false)
    private Integer matCount;
    /**
     * 金额
     */
    @TableField(exist = false)
    private String totalAmount;
    /**
     * 物资状态
     */
    @TableField(exist = false)
    private String matStatus;

    private Integer isdel;
}
