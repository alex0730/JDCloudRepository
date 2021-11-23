package com.lee.entity;

import java.io.Serializable;
public class RulePickingInfoModel  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 主键
     */
	private Integer id;
	/**
     * 规则编码
     */
	private String pickingNum;
	/**
     * 规则描述
     */
	private String pickingDesc;
	/**
     * 执行顺序
     */
	private Integer pickingExecuteOrder;
	/**
     * 状态
     */
	private String pickingStatus;
	/**
     * 订单类型
     */
	private String pickingOrderType;
	/**
     * 供应商编码
     */
	private String supplierNum;
	/**
     * 供应商编码
     */
	private String supplierName;
	/**
     * 创建时间
     */
	private String createTime;
	/**
     * 更新时间
     */
	private String updater;
	/**
     * 更新时间
     */
	private String updateTime;
	/**
     * 扩展字段
     */
	private String pickingExt;
	/**
     * 逻辑删除标记
     */
	private Integer isdel;
	
	// setter and getter


	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	/**
	* <p>Discription:[主键]</p>
	* Created on 2021年11月18日
	* @return Integer
    * @author:刘超
    */
	public Integer getId(){
		return id;
	}
	/**
	* <p>Discription:[主键]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setId(Integer id){
		this.id = id;
	}
	/**
	* <p>Discription:[规则编码]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getPickingNum(){
		return pickingNum;
	}
	/**
	* <p>Discription:[规则编码]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setPickingNum(String pickingNum){
		this.pickingNum = pickingNum;
	}
	/**
	* <p>Discription:[规则描述]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getPickingDesc(){
		return pickingDesc;
	}
	/**
	* <p>Discription:[规则描述]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setPickingDesc(String pickingDesc){
		this.pickingDesc = pickingDesc;
	}
	/**
	* <p>Discription:[执行顺序]</p>
	* Created on 2021年11月18日
	* @return Integer
    * @author:刘超
    */
	public Integer getPickingExecuteOrder(){
		return pickingExecuteOrder;
	}
	/**
	* <p>Discription:[执行顺序]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setPickingExecuteOrder(Integer pickingExecuteOrder){
		this.pickingExecuteOrder = pickingExecuteOrder;
	}
	/**
	* <p>Discription:[状态]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getPickingStatus(){
		return pickingStatus;
	}
	/**
	* <p>Discription:[状态]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setPickingStatus(String pickingStatus){
		this.pickingStatus = pickingStatus;
	}
	/**
	* <p>Discription:[订单类型]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getPickingOrderType(){
		return pickingOrderType;
	}
	/**
	* <p>Discription:[订单类型]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setPickingOrderType(String pickingOrderType){
		this.pickingOrderType = pickingOrderType;
	}
	/**
	* <p>Discription:[供应商编码]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getSupplierNum(){
		return supplierNum;
	}
	/**
	* <p>Discription:[供应商编码]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setSupplierNum(String supplierNum){
		this.supplierNum = supplierNum;
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
	public String getUpdater(){
		return updater;
	}
	/**
	* <p>Discription:[更新时间]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setUpdater(String updater){
		this.updater = updater;
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
	public String getPickingExt(){
		return pickingExt;
	}
	/**
	* <p>Discription:[扩展字段]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setPickingExt(String pickingExt){
		this.pickingExt = pickingExt;
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
