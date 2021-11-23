package com.lee.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName(value = "purchase_material_info")
public class PurchaseMaterialInfoModel implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    /**
     * 物资状态
     */
    private String purchaseMatStatus;
    /**
     * 扩展字段
     */
    private String purchaseMatExt;
    /**
     * 采购编号
     */
    private String purchaseMatCode;
    /**
     * 物资单位
     */
    private String purchaseMatUnit;
    /**
     * 单价
     */
    private String purchaseMatPrice;
    /**
     * 物资数量
     */
    private Integer purchaseMatNum;
    /**
     * 物资总金额
     */
    private String purchaseMatAmount;
    /**
     * 创建时间
     */
    private String createTime;
    /**
     * 更新时间
     */
    private String updateTime;
    /**
     * 逻辑删除标记
     */
    private Integer isdel;

    /**
     * 采购订单编号
     */
    private Integer purchaseNum;



}
