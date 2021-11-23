package com.lee.entity;

import java.io.Serializable;
/** 
 * <p>Description: [出库订单信息表 model]</p>
 * Created on 2021年11月22日
 */
public class ExwarehouseInfoModel  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 主键Id
     */
	private Integer id;
	/**
     * 入库单号
     */
	private String exwarehouNum;
	/**
     * 采购单编号
     */
	private String purchaseNum;
	/**
     * 供应商编号
     */
	private String supplierNum;
	/**
     * 采购物资编号
     */
	private String matPurchaseNum;
	/**
     * 状态
     */
	private Integer warehousingStatus;
	/**
     * 入库用途
     */
	private Integer warehousingPurpose;
	/**
     * 物资数量
     */
	private Integer exwarehouCount;
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
	private String claimDatetime;
	/**
     * 领用单位
     */
	private String claimCompany;
	/**
     * 领用方式
     */
	private String claimMode;
	/**
     * 领用人
     */
	private String claimPerson;
	/**
     * 领用人联系电话
     */
	private String claimPersonMobile;
	/**
     * 计划出库时间
     */
	private String planOutDatetime;

	private String matTypeName;
	private String matPurchaseName;


	// setter and getter

	public String getMatTypeName() {
		return matTypeName;
	}

	public void setMatTypeName(String matTypeName) {
		this.matTypeName = matTypeName;
	}

	public String getMatPurchaseName() {
		return matPurchaseName;
	}

	public void setMatPurchaseName(String matPurchaseName) {
		this.matPurchaseName = matPurchaseName;
	}

	/**
	* <p>Discription:[主键Id]</p>
	* Created on 2021年11月22日
	* @return Integer
    * @author:刘超
    */
	public Integer getId(){
		return id;
	}
	/**
	* <p>Discription:[主键Id]</p>
	* Created on 2021年11月22日
	* @author:刘超
	*/
	public void setId(Integer id){
		this.id = id;
	}
	/**
	* <p>Discription:[入库单号]</p>
	* Created on 2021年11月22日
	* @return String
    * @author:刘超
    */
	public String getExwarehouNum(){
		return exwarehouNum;
	}
	/**
	* <p>Discription:[入库单号]</p>
	* Created on 2021年11月22日
	* @author:刘超
	*/
	public void setExwarehouNum(String exwarehouNum){
		this.exwarehouNum = exwarehouNum;
	}
	/**
	* <p>Discription:[采购单编号]</p>
	* Created on 2021年11月22日
	* @return String
    * @author:刘超
    */
	public String getPurchaseNum(){
		return purchaseNum;
	}
	/**
	* <p>Discription:[采购单编号]</p>
	* Created on 2021年11月22日
	* @author:刘超
	*/
	public void setPurchaseNum(String purchaseNum){
		this.purchaseNum = purchaseNum;
	}
	/**
	* <p>Discription:[供应商编号]</p>
	* Created on 2021年11月22日
	* @return String
    * @author:刘超
    */
	public String getSupplierNum(){
		return supplierNum;
	}
	/**
	* <p>Discription:[供应商编号]</p>
	* Created on 2021年11月22日
	* @author:刘超
	*/
	public void setSupplierNum(String supplierNum){
		this.supplierNum = supplierNum;
	}
	/**
	* <p>Discription:[采购物资编号]</p>
	* Created on 2021年11月22日
	* @return String
    * @author:刘超
    */
	public String getMatPurchaseNum(){
		return matPurchaseNum;
	}
	/**
	* <p>Discription:[采购物资编号]</p>
	* Created on 2021年11月22日
	* @author:刘超
	*/
	public void setMatPurchaseNum(String matPurchaseNum){
		this.matPurchaseNum = matPurchaseNum;
	}
	/**
	* <p>Discription:[状态]</p>
	* Created on 2021年11月22日
	* @return Integer
    * @author:刘超
    */
	public Integer getWarehousingStatus(){
		return warehousingStatus;
	}
	/**
	* <p>Discription:[状态]</p>
	* Created on 2021年11月22日
	* @author:刘超
	*/
	public void setWarehousingStatus(Integer warehousingStatus){
		this.warehousingStatus = warehousingStatus;
	}
	/**
	* <p>Discription:[入库用途]</p>
	* Created on 2021年11月22日
	* @return Integer
    * @author:刘超
    */
	public Integer getWarehousingPurpose(){
		return warehousingPurpose;
	}
	/**
	* <p>Discription:[入库用途]</p>
	* Created on 2021年11月22日
	* @author:刘超
	*/
	public void setWarehousingPurpose(Integer warehousingPurpose){
		this.warehousingPurpose = warehousingPurpose;
	}
	/**
	* <p>Discription:[物资数量]</p>
	* Created on 2021年11月22日
	* @return Integer
    * @author:刘超
    */
	public Integer getExwarehouCount(){
		return exwarehouCount;
	}
	/**
	* <p>Discription:[物资数量]</p>
	* Created on 2021年11月22日
	* @author:刘超
	*/
	public void setExwarehouCount(Integer exwarehouCount){
		this.exwarehouCount = exwarehouCount;
	}
	/**
	* <p>Discription:[创建时间]</p>
	* Created on 2021年11月22日
	* @return String
    * @author:刘超
    */
	public String getCreateTime(){
		return createTime;
	}
	/**
	* <p>Discription:[创建时间]</p>
	* Created on 2021年11月22日
	* @author:刘超
	*/
	public void setCreateTime(String createTime){
		this.createTime = createTime;
	}
	/**
	* <p>Discription:[更新时间]</p>
	* Created on 2021年11月22日
	* @return String
    * @author:刘超
    */
	public String getUpdateTime(){
		return updateTime;
	}
	/**
	* <p>Discription:[更新时间]</p>
	* Created on 2021年11月22日
	* @author:刘超
	*/
	public void setUpdateTime(String updateTime){
		this.updateTime = updateTime;
	}
	/**
	* <p>Discription:[扩展字段]</p>
	* Created on 2021年11月22日
	* @return String
    * @author:刘超
    */
	public String getWarehousingExt(){
		return warehousingExt;
	}
	/**
	* <p>Discription:[扩展字段]</p>
	* Created on 2021年11月22日
	* @author:刘超
	*/
	public void setWarehousingExt(String warehousingExt){
		this.warehousingExt = warehousingExt;
	}
	/**
	* <p>Discription:[逻辑删除标记]</p>
	* Created on 2021年11月22日
	* @return Integer
    * @author:刘超
    */
	public Integer getIsdel(){
		return isdel;
	}
	/**
	* <p>Discription:[逻辑删除标记]</p>
	* Created on 2021年11月22日
	* @author:刘超
	*/
	public void setIsdel(Integer isdel){
		this.isdel = isdel;
	}
	/**
	* <p>Discription:[原出库单号]</p>
	* Created on 2021年11月22日
	* @return String
    * @author:刘超
    */
	public String getOriginalOutOrder(){
		return originalOutOrder;
	}
	/**
	* <p>Discription:[原出库单号]</p>
	* Created on 2021年11月22日
	* @author:刘超
	*/
	public void setOriginalOutOrder(String originalOutOrder){
		this.originalOutOrder = originalOutOrder;
	}
	/**
	* <p>Discription:[领用日期]</p>
	* Created on 2021年11月22日
	* @return String
    * @author:刘超
    */
	public String getClaimDatetime(){
		return claimDatetime;
	}
	/**
	* <p>Discription:[领用日期]</p>
	* Created on 2021年11月22日
	* @author:刘超
	*/
	public void setClaimDatetime(String claimDatetime){
		this.claimDatetime = claimDatetime;
	}
	/**
	* <p>Discription:[领用单位]</p>
	* Created on 2021年11月22日
	* @return String
    * @author:刘超
    */
	public String getClaimCompany(){
		return claimCompany;
	}
	/**
	* <p>Discription:[领用单位]</p>
	* Created on 2021年11月22日
	* @author:刘超
	*/
	public void setClaimCompany(String claimCompany){
		this.claimCompany = claimCompany;
	}
	/**
	* <p>Discription:[领用方式]</p>
	* Created on 2021年11月22日
	* @return String
    * @author:刘超
    */
	public String getClaimMode(){
		return claimMode;
	}
	/**
	* <p>Discription:[领用方式]</p>
	* Created on 2021年11月22日
	* @author:刘超
	*/
	public void setClaimMode(String claimMode){
		this.claimMode = claimMode;
	}
	/**
	* <p>Discription:[领用人]</p>
	* Created on 2021年11月22日
	* @return String
    * @author:刘超
    */
	public String getClaimPerson(){
		return claimPerson;
	}
	/**
	* <p>Discription:[领用人]</p>
	* Created on 2021年11月22日
	* @author:刘超
	*/
	public void setClaimPerson(String claimPerson){
		this.claimPerson = claimPerson;
	}
	/**
	* <p>Discription:[领用人联系电话]</p>
	* Created on 2021年11月22日
	* @return String
    * @author:刘超
    */
	public String getClaimPersonMobile(){
		return claimPersonMobile;
	}
	/**
	* <p>Discription:[领用人联系电话]</p>
	* Created on 2021年11月22日
	* @author:刘超
	*/
	public void setClaimPersonMobile(String claimPersonMobile){
		this.claimPersonMobile = claimPersonMobile;
	}
	/**
	* <p>Discription:[计划出库时间]</p>
	* Created on 2021年11月22日
	* @return String
    * @author:刘超
    */
	public String getPlanOutDatetime(){
		return planOutDatetime;
	}
	/**
	* <p>Discription:[计划出库时间]</p>
	* Created on 2021年11月22日
	* @author:刘超
	*/
	public void setPlanOutDatetime(String planOutDatetime){
		this.planOutDatetime = planOutDatetime;
	}
}
