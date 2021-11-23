package com.lee.entity;

import java.io.Serializable;
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
	private String supplierName;
	/**
     * 采购物资编号
     */
	private String matPurchaseNum;
	private String matPurchaseName;
	private String matSpecs;
	private String matTypeName;
	/**
     * 状态
     */
	private Integer warehousingStatus;
	private String warehousingStatusName;
	/**
     * 入库用途
     */
	private Integer warehousingPurpose;
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
	// setter and getter


	public String getAmountType() {
		return amountType;
	}

	public void setAmountType(String amountType) {
		this.amountType = amountType;
	}

	public String getWarehousingStatusName() {
		return warehousingStatusName;
	}

	public void setWarehousingStatusName(String warehousingStatusName) {
		this.warehousingStatusName = warehousingStatusName;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getMatPurchaseName() {
		return matPurchaseName;
	}

	public void setMatPurchaseName(String matPurchaseName) {
		this.matPurchaseName = matPurchaseName;
	}

	public String getMatSpecs() {
		return matSpecs;
	}

	public void setMatSpecs(String matSpecs) {
		this.matSpecs = matSpecs;
	}

	public String getMatTypeName() {
		return matTypeName;
	}

	public void setMatTypeName(String matTypeName) {
		this.matTypeName = matTypeName;
	}

	public String getWarehousingPurposeName() {
		return warehousingPurposeName;
	}

	public void setWarehousingPurposeName(String warehousingPurposeName) {
		this.warehousingPurposeName = warehousingPurposeName;
	}

	/**
	* <p>Discription:[主键Id]</p>
	* Created on 2021年11月19日
	* @return Integer
    * @author:刘超
    */
	public Integer getId(){
		return id;
	}
	/**
	* <p>Discription:[主键Id]</p>
	* Created on 2021年11月19日
	* @author:刘超
	*/
	public void setId(Integer id){
		this.id = id;
	}
	/**
	* <p>Discription:[入库单号]</p>
	* Created on 2021年11月19日
	* @return String
    * @author:刘超
    */
	public String getWarehousingNum(){
		return warehousingNum;
	}
	/**
	* <p>Discription:[入库单号]</p>
	* Created on 2021年11月19日
	* @author:刘超
	*/
	public void setWarehousingNum(String warehousingNum){
		this.warehousingNum = warehousingNum;
	}
	/**
	* <p>Discription:[采购单编号]</p>
	* Created on 2021年11月19日
	* @return String
    * @author:刘超
    */
	public String getPurchaseNum(){
		return purchaseNum;
	}
	/**
	* <p>Discription:[采购单编号]</p>
	* Created on 2021年11月19日
	* @author:刘超
	*/
	public void setPurchaseNum(String purchaseNum){
		this.purchaseNum = purchaseNum;
	}
	/**
	* <p>Discription:[供应商编号]</p>
	* Created on 2021年11月19日
	* @return String
    * @author:刘超
    */
	public String getSupplierNum(){
		return supplierNum;
	}
	/**
	* <p>Discription:[供应商编号]</p>
	* Created on 2021年11月19日
	* @author:刘超
	*/
	public void setSupplierNum(String supplierNum){
		this.supplierNum = supplierNum;
	}
	/**
	* <p>Discription:[采购物资编号]</p>
	* Created on 2021年11月19日
	* @return String
    * @author:刘超
    */
	public String getMatPurchaseNum(){
		return matPurchaseNum;
	}
	/**
	* <p>Discription:[采购物资编号]</p>
	* Created on 2021年11月19日
	* @author:刘超
	*/
	public void setMatPurchaseNum(String matPurchaseNum){
		this.matPurchaseNum = matPurchaseNum;
	}
	/**
	* <p>Discription:[状态]</p>
	* Created on 2021年11月19日
	* @return Integer
    * @author:刘超
    */
	public Integer getWarehousingStatus(){
		return warehousingStatus;
	}
	/**
	* <p>Discription:[状态]</p>
	* Created on 2021年11月19日
	* @author:刘超
	*/
	public void setWarehousingStatus(Integer warehousingStatus){
		this.warehousingStatus = warehousingStatus;
	}
	/**
	* <p>Discription:[入库用途]</p>
	* Created on 2021年11月19日
	* @return Integer
    * @author:刘超
    */
	public Integer getWarehousingPurpose(){
		return warehousingPurpose;
	}
	/**
	* <p>Discription:[入库用途]</p>
	* Created on 2021年11月19日
	* @author:刘超
	*/
	public void setWarehousingPurpose(Integer warehousingPurpose){
		this.warehousingPurpose = warehousingPurpose;
	}
	/**
	* <p>Discription:[应收数量]</p>
	* Created on 2021年11月19日
	* @return Integer
    * @author:刘超
    */
	public Integer getReceivableCount(){
		return receivableCount;
	}
	/**
	* <p>Discription:[应收数量]</p>
	* Created on 2021年11月19日
	* @author:刘超
	*/
	public void setReceivableCount(Integer receivableCount){
		this.receivableCount = receivableCount;
	}
	/**
	* <p>Discription:[实收数量]</p>
	* Created on 2021年11月19日
	* @return Integer
    * @author:刘超
    */
	public Integer getReceivedCount(){
		return receivedCount;
	}
	/**
	* <p>Discription:[实收数量]</p>
	* Created on 2021年11月19日
	* @author:刘超
	*/
	public void setReceivedCount(Integer receivedCount){
		this.receivedCount = receivedCount;
	}
	/**
	* <p>Discription:[创建时间]</p>
	* Created on 2021年11月19日
	* @return String
    * @author:刘超
    */
	public String getCreateTime(){
		return createTime;
	}
	/**
	* <p>Discription:[创建时间]</p>
	* Created on 2021年11月19日
	* @author:刘超
	*/
	public void setCreateTime(String createTime){
		this.createTime = createTime;
	}
	/**
	* <p>Discription:[更新时间]</p>
	* Created on 2021年11月19日
	* @return String
    * @author:刘超
    */
	public String getUpdateTime(){
		return updateTime;
	}
	/**
	* <p>Discription:[更新时间]</p>
	* Created on 2021年11月19日
	* @author:刘超
	*/
	public void setUpdateTime(String updateTime){
		this.updateTime = updateTime;
	}
	/**
	* <p>Discription:[扩展字段]</p>
	* Created on 2021年11月19日
	* @return String
    * @author:刘超
    */
	public String getWarehousingExt(){
		return warehousingExt;
	}
	/**
	* <p>Discription:[扩展字段]</p>
	* Created on 2021年11月19日
	* @author:刘超
	*/
	public void setWarehousingExt(String warehousingExt){
		this.warehousingExt = warehousingExt;
	}
	/**
	* <p>Discription:[逻辑删除标记]</p>
	* Created on 2021年11月19日
	* @return Integer
    * @author:刘超
    */
	public Integer getIsdel(){
		return isdel;
	}
	/**
	* <p>Discription:[逻辑删除标记]</p>
	* Created on 2021年11月19日
	* @author:刘超
	*/
	public void setIsdel(Integer isdel){
		this.isdel = isdel;
	}
	/**
	* <p>Discription:[原出库单号]</p>
	* Created on 2021年11月19日
	* @return String
    * @author:刘超
    */
	public String getOriginalOutOrder(){
		return originalOutOrder;
	}
	/**
	* <p>Discription:[原出库单号]</p>
	* Created on 2021年11月19日
	* @author:刘超
	*/
	public void setOriginalOutOrder(String originalOutOrder){
		this.originalOutOrder = originalOutOrder;
	}
	/**
	* <p>Discription:[领用日期]</p>
	* Created on 2021年11月19日
	* @return String
    * @author:刘超
    */
	public String getClaimDate(){
		return claimDate;
	}
	/**
	* <p>Discription:[领用日期]</p>
	* Created on 2021年11月19日
	* @author:刘超
	*/
	public void setClaimDate(String claimDate){
		this.claimDate = claimDate;
	}
}
