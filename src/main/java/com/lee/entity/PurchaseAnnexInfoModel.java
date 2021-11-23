package com.lee.entity;

import java.io.Serializable;
public class PurchaseAnnexInfoModel  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	private Integer id;
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
	private String annexExt;
	/**
     * 逻辑删除标记
     */
	private Integer isdel;
	/**
     * 附件类型
     */
	private String purchaseAnnexType;
	/**
     * 附件名称
     */
	private String purchaseAnnexAnme;
	/**
     * 采购订单编号
     */
	private String purchaseOrderNum;
	/**
     * 附件相对路径
     */
	private String purchaseAnnexPath;
	/**
     * 附件上传时间
     */
	private String purchaseAnnexUptime;
	
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
	public String getAnnexExt(){
		return annexExt;
	}
	/**
	* <p>Discription:[扩展字段]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setAnnexExt(String annexExt){
		this.annexExt = annexExt;
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
	/**
	* <p>Discription:[附件类型]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getPurchaseAnnexType(){
		return purchaseAnnexType;
	}
	/**
	* <p>Discription:[附件类型]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setPurchaseAnnexType(String purchaseAnnexType){
		this.purchaseAnnexType = purchaseAnnexType;
	}
	/**
	* <p>Discription:[附件名称]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getPurchaseAnnexAnme(){
		return purchaseAnnexAnme;
	}
	/**
	* <p>Discription:[附件名称]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setPurchaseAnnexAnme(String purchaseAnnexAnme){
		this.purchaseAnnexAnme = purchaseAnnexAnme;
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
	* <p>Discription:[附件相对路径]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getPurchaseAnnexPath(){
		return purchaseAnnexPath;
	}
	/**
	* <p>Discription:[附件相对路径]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setPurchaseAnnexPath(String purchaseAnnexPath){
		this.purchaseAnnexPath = purchaseAnnexPath;
	}
	/**
	* <p>Discription:[附件上传时间]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getPurchaseAnnexUptime(){
		return purchaseAnnexUptime;
	}
	/**
	* <p>Discription:[附件上传时间]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setPurchaseAnnexUptime(String purchaseAnnexUptime){
		this.purchaseAnnexUptime = purchaseAnnexUptime;
	}
}
