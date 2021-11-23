package com.lee.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("purchase_payment_info")
public class PurchasePaymentInfoModel implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     *
     */
    private Integer id;
    /**
     * 采购订单编号
     */
    private String purchaseOrderNum;
    /**
     * 付款时间
     */
    private String purchasePaymentDate;
    /**
     * 付款金额
     */
    private String purchasePaymentAmount;
    /**
     * 本次付款比例
     */
    private String purchasePaymentRatio;
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
    private String paymentExt;
    /**
     * 逻辑删除标记
     */
    private Integer isdel;

}
