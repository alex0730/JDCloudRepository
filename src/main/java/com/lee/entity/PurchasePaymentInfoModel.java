package com.lee.entity;

import java.io.Serializable;
public class PurchasePaymentInfoModel  implements Serializable {

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
	* <p>Discription:[采购订单编号]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getPurchaseOrderNum(){
		return purchaseOrderNum;
	}
	/**
	* <p>Discription:[采购订单编号]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setPurchaseOrderNum(String purchaseOrderNum){
		this.purchaseOrderNum = purchaseOrderNum;
	}
	/**
	* <p>Discription:[付款时间]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getPurchasePaymentDate(){
		return purchasePaymentDate;
	}
	/**
	* <p>Discription:[付款时间]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setPurchasePaymentDate(String purchasePaymentDate){
		this.purchasePaymentDate = purchasePaymentDate;
	}
	/**
	* <p>Discription:[付款金额]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getPurchasePaymentAmount(){
		return purchasePaymentAmount;
	}
	/**
	* <p>Discription:[付款金额]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setPurchasePaymentAmount(String purchasePaymentAmount){
		this.purchasePaymentAmount = purchasePaymentAmount;
	}
	/**
	* <p>Discription:[本次付款比例]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getPurchasePaymentRatio(){
		return purchasePaymentRatio;
	}
	/**
	* <p>Discription:[本次付款比例]</p>
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
	public String getPaymentExt(){
		return paymentExt;
	}
	/**
	* <p>Discription:[扩展字段]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setPaymentExt(String paymentExt){
		this.paymentExt = paymentExt;
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
