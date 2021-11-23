package com.lee.entity;

import java.io.Serializable;
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
	private String dicExt;
	/**
     * 逻辑删除标记
     */
	private Integer isdel;

	private String supplierName;

	private String capitalTypeName;

	private String purchasePurposeName;

	public String getPurchasePaymentStatusName() {
		return purchasePaymentStatusName;
	}

	public void setPurchasePaymentStatusName(String purchasePaymentStatusName) {
		this.purchasePaymentStatusName = purchasePaymentStatusName;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getCapitalTypeName() {
		return capitalTypeName;
	}

	public void setCapitalTypeName(String capitalTypeName) {
		this.capitalTypeName = capitalTypeName;
	}

	public String getPurchasePurposeName() {
		return purchasePurposeName;
	}

	public void setPurchasePurposeName(String purchasePurposeName) {
		this.purchasePurposeName = purchasePurposeName;
	}

	// setter and getter
	/**
	* <p>Discription:[]</p>
	* Created on 2021年11月18日
	* @return Integer
    * @author:刘超
    */
	public Integer getId(){
		return id;
	}
	/**
	* <p>Discription:[]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setId(Integer id){
		this.id = id;
	}
	/**
	* <p>Discription:[采购编号]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getPurchaseNum(){
		return purchaseNum;
	}
	/**
	* <p>Discription:[采购编号]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setPurchaseNum(String purchaseNum){
		this.purchaseNum = purchaseNum;
	}
	/**
	* <p>Discription:[申购日期]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getPurchaseDate(){
		return purchaseDate;
	}
	/**
	* <p>Discription:[申购日期]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setPurchaseDate(String purchaseDate){
		this.purchaseDate = purchaseDate;
	}
	/**
	* <p>Discription:[供应商编号]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getSupplierNum(){
		return supplierNum;
	}
	/**
	* <p>Discription:[供应商编号]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setSupplierNum(String supplierNum){
		this.supplierNum = supplierNum;
	}
	/**
	* <p>Discription:[订单总金额]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getOrderAmount(){
		return orderAmount;
	}
	/**
	* <p>Discription:[订单总金额]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setOrderAmount(String orderAmount){
		this.orderAmount = orderAmount;
	}
	/**
	* <p>Discription:[资金类型]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getCapitalType(){
		return capitalType;
	}
	/**
	* <p>Discription:[资金类型]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setCapitalType(String capitalType){
		this.capitalType = capitalType;
	}
	/**
	* <p>Discription:[采购订单状态]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getPurchaseType(){
		return purchaseType;
	}
	/**
	* <p>Discription:[采购订单状态]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setPurchaseType(String purchaseType){
		this.purchaseType = purchaseType;
	}
	/**
	* <p>Discription:[采购负责人]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getPurchasePerson(){
		return purchasePerson;
	}
	/**
	* <p>Discription:[采购负责人]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setPurchasePerson(String purchasePerson){
		this.purchasePerson = purchasePerson;
	}
	/**
	* <p>Discription:[采购目的]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getPurchasePurpose(){
		return purchasePurpose;
	}
	/**
	* <p>Discription:[采购目的]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setPurchasePurpose(String purchasePurpose){
		this.purchasePurpose = purchasePurpose;
	}
	/**
	* <p>Discription:[采购依据]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getPurchaseBasis(){
		return purchaseBasis;
	}
	/**
	* <p>Discription:[采购依据]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setPurchaseBasis(String purchaseBasis){
		this.purchaseBasis = purchaseBasis;
	}
	/**
	* <p>Discription:[采购订单建立时间]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getPurchaseCreateDate(){
		return purchaseCreateDate;
	}
	/**
	* <p>Discription:[采购订单建立时间]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setPurchaseCreateDate(String purchaseCreateDate){
		this.purchaseCreateDate = purchaseCreateDate;
	}
	/**
	* <p>Discription:[采购订单完成时间]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getPurchaseCompleteDate(){
		return purchaseCompleteDate;
	}
	/**
	* <p>Discription:[采购订单完成时间]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setPurchaseCompleteDate(String purchaseCompleteDate){
		this.purchaseCompleteDate = purchaseCompleteDate;
	}
	/**
	* <p>Discription:[合同签订时间]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getContractSigningDate(){
		return contractSigningDate;
	}
	/**
	* <p>Discription:[合同签订时间]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setContractSigningDate(String contractSigningDate){
		this.contractSigningDate = contractSigningDate;
	}
	/**
	* <p>Discription:[当前付款状态]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getPurchasePaymentStatus(){
		return purchasePaymentStatus;
	}
	/**
	* <p>Discription:[当前付款状态]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setPurchasePaymentStatus(String purchasePaymentStatus){
		this.purchasePaymentStatus = purchasePaymentStatus;
	}
	/**
	* <p>Discription:[当前付款比例]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getPurchasePaymentRatio(){
		return purchasePaymentRatio;
	}
	/**
	* <p>Discription:[当前付款比例]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setPurchasePaymentRatio(String purchasePaymentRatio){
		this.purchasePaymentRatio = purchasePaymentRatio;
	}
	/**
	* <p>Discription:[创建时间]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getCreateTime(){
		return createTime;
	}
	/**
	* <p>Discription:[创建时间]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setCreateTime(String createTime){
		this.createTime = createTime;
	}
	/**
	* <p>Discription:[更新时间]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getUpdateTime(){
		return updateTime;
	}
	/**
	* <p>Discription:[更新时间]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setUpdateTime(String updateTime){
		this.updateTime = updateTime;
	}
	/**
	* <p>Discription:[扩展字段]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getDicExt(){
		return dicExt;
	}
	/**
	* <p>Discription:[扩展字段]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setDicExt(String dicExt){
		this.dicExt = dicExt;
	}
	/**
	* <p>Discription:[逻辑删除标记]</p>
	* Created on 2021年11月18日
	* @return Integer
    * @author:刘超
    */
	public Integer getIsdel(){
		return isdel;
	}
	/**
	* <p>Discription:[逻辑删除标记]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setIsdel(Integer isdel){
		this.isdel = isdel;
	}
}
