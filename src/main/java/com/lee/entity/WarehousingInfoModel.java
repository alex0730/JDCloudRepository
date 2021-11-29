package com.lee.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@TableName(value ="warehousing_info")
public class WarehousingInfoModel  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 主键Id
     */
	private Integer id;
	/**
     * 入库单号
     */
	private String warehousingNum;
	/**
     * 采购单编号
     */
	private String purchaseNum;
	/**
     * 供应商编号
     */
	private String supplierNum;
	@TableField(exist = false)
	private String supplierName;
	/**
     * 采购物资编号
     */
	private String matPurchaseNum;
	@TableField(exist = false)
	private String matPurchaseName;
	@TableField(exist = false)
	private String matSpecs;
	@TableField(exist = false)
	private String matTypeName;
	/**
     * 状态
     */
	private Integer warehousingStatus;
	@TableField(exist = false)
	private String warehousingStatusName;
	/**
     * 入库用途
     */
	private Integer warehousingPurpose;
	@TableField(exist = false)
	private String warehousingPurposeName;
	/**
     * 应收数量
     */
	private Integer receivableCount;
	/**
     * 实收数量
     */
	private Integer receivedCount;
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
	private String warehousingExt;
	/**
     * 逻辑删除标记
     */
	private Integer isdel;
	/**
     * 原出库单号
     */
	private String originalOutOrder;
	/**
     * 领用日期
     */
	private String claimDate;

	/**
	 * 资金类型
	 * @return
	 */
	private String amountType;

	/**
	 * 物资列表
	 */
	@TableField(exist = false)
	private List<WarehouseMaterialInfoModel> materials;
}
