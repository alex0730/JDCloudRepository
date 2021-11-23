package com.lee.entity;

import java.io.Serializable;
public class RuleConfInfoModel  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 主键
     */
	private Integer id;
	/**
     * 规则配置描述
     */
	private String confDesc;

	private String ruleName;

	private String ruleTypeName;
	/**
     * 规则编码
     */
	private String confNum;
	/**
     * 业务类型
     */
	private String businessType;

	private String businessTypeName;
	/**
     * 操作类型
     */
	private String operationType;

	private String operationTypeName;
	/**
     * 供应商编码
     */
	private String supplierNum;

	private String supplierName;
	/**
     * 物资信息编码
     */
	private String materialNum;

	private String materialTypeName;

	private String materialName;
	/**
     * 优先级
     */
	private Integer confPriority;
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
	private String confExt;
	/**
     * 逻辑删除标记
     */
	private Integer isdel;
	

	// setter and getter


	public String getRuleName() {
		return ruleName;
	}

	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}

	public String getRuleTypeName() {
		return ruleTypeName;
	}

	public void setRuleTypeName(String ruleTypeName) {
		this.ruleTypeName = ruleTypeName;
	}

	public String getBusinessTypeName() {
		return businessTypeName;
	}

	public void setBusinessTypeName(String businessTypeName) {
		this.businessTypeName = businessTypeName;
	}

	public String getOperationTypeName() {
		return operationTypeName;
	}

	public void setOperationTypeName(String operationTypeName) {
		this.operationTypeName = operationTypeName;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getMaterialTypeName() {
		return materialTypeName;
	}

	public void setMaterialTypeName(String materialTypeName) {
		this.materialTypeName = materialTypeName;
	}

	public String getMaterialName() {
		return materialName;
	}

	public void setMaterialName(String materialName) {
		this.materialName = materialName;
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
	* <p>Discription:[规则配置描述]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getConfDesc(){
		return confDesc;
	}
	/**
	* <p>Discription:[规则配置描述]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setConfDesc(String confDesc){
		this.confDesc = confDesc;
	}
	/**
	* <p>Discription:[规则编码]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getConfNum(){
		return confNum;
	}
	/**
	* <p>Discription:[规则编码]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setConfNum(String confNum){
		this.confNum = confNum;
	}
	/**
	* <p>Discription:[业务类型]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getBusinessType(){
		return businessType;
	}
	/**
	* <p>Discription:[业务类型]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setBusinessType(String businessType){
		this.businessType = businessType;
	}

	public String getOperationType() {
		return operationType;
	}

	public void setOperationType(String operationType) {
		this.operationType = operationType;
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
	* <p>Discription:[物资信息编码]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getMaterialNum(){
		return materialNum;
	}
	/**
	* <p>Discription:[物资信息编码]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setMaterialNum(String materialNum){
		this.materialNum = materialNum;
	}
	/**
	* <p>Discription:[优先级]</p>
	* Created on 2021年11月18日
	* @return Integer
    * @author:刘超
    */
	public Integer getConfPriority(){
		return confPriority;
	}
	/**
	* <p>Discription:[优先级]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setConfPriority(Integer confPriority){
		this.confPriority = confPriority;
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
	public String getConfExt(){
		return confExt;
	}
	/**
	* <p>Discription:[扩展字段]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setConfExt(String confExt){
		this.confExt = confExt;
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
