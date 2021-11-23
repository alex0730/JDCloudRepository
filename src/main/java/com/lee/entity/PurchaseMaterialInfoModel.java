package com.lee.entity;

import java.io.Serializable;
public class PurchaseMaterialInfoModel  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Integer id;
	/**
     * 物资状态
     */
	private String purchaseMatStatus;
	/**
     * 扩展字段
     */
	private String purchaseExt;
	/**
     * 采购编号
     */
	private String purchaseMatCode;
	/**
     * 物资单位
     */
	private String purchaseMatUnit;
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
	* <p>Discription:[物资状态]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getPurchaseMatStatus(){
		return purchaseMatStatus;
	}
	/**
	* <p>Discription:[物资状态]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setPurchaseMatStatus(String purchaseMatStatus){
		this.purchaseMatStatus = purchaseMatStatus;
	}
	/**
	* <p>Discription:[扩展字段]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getPurchaseExt(){
		return purchaseExt;
	}
	/**
	* <p>Discription:[扩展字段]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setPurchaseExt(String purchaseExt){
		this.purchaseExt = purchaseExt;
	}
	/**
	* <p>Discription:[采购编号]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getPurchaseMatCode(){
		return purchaseMatCode;
	}
	/**
	* <p>Discription:[采购编号]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setPurchaseMatCode(String purchaseMatCode){
		this.purchaseMatCode = purchaseMatCode;
	}
	/**
	* <p>Discription:[物资单位]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getPurchaseMatUnit(){
		return purchaseMatUnit;
	}
	/**
	* <p>Discription:[物资单位]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setPurchaseMatUnit(String purchaseMatUnit){
		this.purchaseMatUnit = purchaseMatUnit;
	}
	/**
	* <p>Discription:[物资数量]</p>
	* Created on 2021年11月18日
	* @return Integer
    * @author:刘超
    */
	public Integer getPurchaseMatNum(){
		return purchaseMatNum;
	}
	/**
	* <p>Discription:[物资数量]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setPurchaseMatNum(Integer purchaseMatNum){
		this.purchaseMatNum = purchaseMatNum;
	}
	/**
	* <p>Discription:[物资总金额]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getPurchaseMatAmount(){
		return purchaseMatAmount;
	}
	/**
	* <p>Discription:[物资总金额]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setPurchaseMatAmount(String purchaseMatAmount){
		this.purchaseMatAmount = purchaseMatAmount;
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
