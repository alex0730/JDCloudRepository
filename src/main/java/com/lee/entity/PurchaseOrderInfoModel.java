package com.lee.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@TableName(value="purchase_order_info")
public class PurchaseOrderInfoModel  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Integer id;
	/**
     * 采购编号
     */
	private String purchaseNum;
	/**
     * 申购日期
     */
	private String purchaseDate;
	/**
     * 供应商编号
     */
	@TableField(exist = false)
	private String supplierNum;

	/**
     * 订单总金额
     */
	private String orderAmount;
	/**
     * 资金类型
     */
	private String capitalType;
	/**
     * 采购订单状态
     */
	private String purchaseType;
	/**
     * 采购负责人
     */
	private String purchasePerson;
	/**
     * 采购目的
     */
	private String purchasePurpose;
	/**
     * 采购依据
     */
	private String purchaseBasis;
	/**
     * 采购订单建立时间
     */
	private String purchaseCreateDate;
	/**
     * 采购订单完成时间
     */
	private String purchaseCompleteDate;
	/**
     * 合同签订时间
     */
	private String contractSigningDate;
	/**
     * 当前付款状态
     */
	private String purchasePaymentStatus;
	/**
	 * 当前付款状态
	 */
	@TableField(exist = false)
	private String purchasePaymentStatusName;
	/**
     * 当前付款比例
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
	private String purchaseOrderExt;
	/**
     * 逻辑删除标记
     */
	private Integer isdel;

	@TableField(exist = false)
	private String supplierName;

	@TableField(exist = false)
	private String capitalTypeName;

	@TableField(exist = false)
	private String purchasePurposeName;

	@TableField(exist = false)
	private List<PurchaseMaterialInfoModel> materials;

	@TableField(exist = false)
	private List<PurchasePaymentInfoModel> payments;

	@TableField(exist = false)
	private List<PurchaseAnnexInfoModel> hannexs;

	@TableField(exist = false)
	private List<PurchaseAnnexInfoModel> oannexs;

}
