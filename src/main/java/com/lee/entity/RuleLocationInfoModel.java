package com.lee.entity;

import java.io.Serializable;
public class RuleLocationInfoModel  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 主键
     */
	private Integer id;
	/**
     * 定位规则编号
     */
	private String locationNum;
	/**
     * 定位规则名称
     */
	private String locationName;
	/**
     * 定位规则描述
     */
	private String locationDesc;
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
	private String locationExt;
	/**
     * 逻辑删除标记
     */
	private Integer isdel;
	/**
     * 规则代码
     */
	private String ruleCode;
	/**
     * 过滤临期物资
     */
	private String filterTempMat;
	/**
     * 储位数量策略
     */
	private String spositionNumPolicy;
	/**
     * 定位库区限制
     */
	private String locationDepositoryLimit;
	/**
     * 创建人
     */
	private String creator;
	/**
     * 更新人
     */
	private String updater;
	
	// setter and getter
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
	* <p>Discription:[定位规则编号]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getLocationNum(){
		return locationNum;
	}
	/**
	* <p>Discription:[定位规则编号]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setLocationNum(String locationNum){
		this.locationNum = locationNum;
	}
	/**
	* <p>Discription:[定位规则名称]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getLocationName(){
		return locationName;
	}
	/**
	* <p>Discription:[定位规则名称]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setLocationName(String locationName){
		this.locationName = locationName;
	}
	/**
	* <p>Discription:[定位规则描述]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getLocationDesc(){
		return locationDesc;
	}
	/**
	* <p>Discription:[定位规则描述]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setLocationDesc(String locationDesc){
		this.locationDesc = locationDesc;
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
	public String getLocationExt(){
		return locationExt;
	}
	/**
	* <p>Discription:[扩展字段]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setLocationExt(String locationExt){
		this.locationExt = locationExt;
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
	* <p>Discription:[规则代码]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getRuleCode(){
		return ruleCode;
	}
	/**
	* <p>Discription:[规则代码]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setRuleCode(String ruleCode){
		this.ruleCode = ruleCode;
	}
	/**
	* <p>Discription:[过滤临期物资]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getFilterTempMat(){
		return filterTempMat;
	}
	/**
	* <p>Discription:[过滤临期物资]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setFilterTempMat(String filterTempMat){
		this.filterTempMat = filterTempMat;
	}
	/**
	* <p>Discription:[储位数量策略]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getSpositionNumPolicy(){
		return spositionNumPolicy;
	}
	/**
	* <p>Discription:[储位数量策略]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setSpositionNumPolicy(String spositionNumPolicy){
		this.spositionNumPolicy = spositionNumPolicy;
	}
	/**
	* <p>Discription:[定位库区限制]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getLocationDepositoryLimit(){
		return locationDepositoryLimit;
	}
	/**
	* <p>Discription:[定位库区限制]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setLocationDepositoryLimit(String locationDepositoryLimit){
		this.locationDepositoryLimit = locationDepositoryLimit;
	}
	/**
	* <p>Discription:[创建人]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getCreator(){
		return creator;
	}
	/**
	* <p>Discription:[创建人]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setCreator(String creator){
		this.creator = creator;
	}
	/**
	* <p>Discription:[更新人]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getUpdater(){
		return updater;
	}
	/**
	* <p>Discription:[更新人]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setUpdater(String updater){
		this.updater = updater;
	}
}
