package com.lee.entity;

import java.io.Serializable;
public class SysSupplierInfoModel  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 主键Id
     */
	private Integer id;
	/**
     * 供应商编号
     */
	private String supNum;
	/**
     * 供应商名称
     */
	private String supName;
	/**
     * 联系人
     */
	private String supContacts;
	/**
     * 联系地址
     */
	private String supAddress;
	/**
     * 联系电话
     */
	private String supTeleno;
	/**
     * 联系邮箱
     */
	private String supMail;
	/**
     * 银行账户
     */
	private String supAccountNumber;
	/**
     * 开户行名称
     */
	private String supBankName;
	/**
     * 备注
     */
	private String supRemark;
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
	private String supExt;
	
	// setter and getter
	/**
	* <p>Discription:[主键Id]</p>
	* Created on 2021年11月17日
	* @return Integer
    * @author:刘超
    */
	public Integer getId(){
		return id;
	}
	/**
	* <p>Discription:[主键Id]</p>
	* Created on 2021年11月17日
	* @author:刘超
	*/
	public void setId(Integer id){
		this.id = id;
	}
	/**
	* <p>Discription:[供应商编号]</p>
	* Created on 2021年11月17日
	* @return String
    * @author:刘超
    */
	public String getSupNum(){
		return supNum;
	}
	/**
	* <p>Discription:[供应商编号]</p>
	* Created on 2021年11月17日
	* @author:刘超
	*/
	public void setSupNum(String supNum){
		this.supNum = supNum;
	}
	/**
	* <p>Discription:[供应商名称]</p>
	* Created on 2021年11月17日
	* @return String
    * @author:刘超
    */
	public String getSupName(){
		return supName;
	}
	/**
	* <p>Discription:[供应商名称]</p>
	* Created on 2021年11月17日
	* @author:刘超
	*/
	public void setSupName(String supName){
		this.supName = supName;
	}
	/**
	* <p>Discription:[联系人]</p>
	* Created on 2021年11月17日
	* @return String
    * @author:刘超
    */
	public String getSupContacts(){
		return supContacts;
	}
	/**
	* <p>Discription:[联系人]</p>
	* Created on 2021年11月17日
	* @author:刘超
	*/
	public void setSupContacts(String supContacts){
		this.supContacts = supContacts;
	}
	/**
	* <p>Discription:[联系地址]</p>
	* Created on 2021年11月17日
	* @return String
    * @author:刘超
    */
	public String getSupAddress(){
		return supAddress;
	}
	/**
	* <p>Discription:[联系地址]</p>
	* Created on 2021年11月17日
	* @author:刘超
	*/
	public void setSupAddress(String supAddress){
		this.supAddress = supAddress;
	}
	/**
	* <p>Discription:[联系电话]</p>
	* Created on 2021年11月17日
	* @return String
    * @author:刘超
    */
	public String getSupTeleno(){
		return supTeleno;
	}
	/**
	* <p>Discription:[联系电话]</p>
	* Created on 2021年11月17日
	* @author:刘超
	*/
	public void setSupTeleno(String supTeleno){
		this.supTeleno = supTeleno;
	}
	/**
	* <p>Discription:[联系邮箱]</p>
	* Created on 2021年11月17日
	* @return String
    * @author:刘超
    */
	public String getSupMail(){
		return supMail;
	}
	/**
	* <p>Discription:[联系邮箱]</p>
	* Created on 2021年11月17日
	* @author:刘超
	*/
	public void setSupMail(String supMail){
		this.supMail = supMail;
	}
	/**
	* <p>Discription:[银行账户]</p>
	* Created on 2021年11月17日
	* @return String
    * @author:刘超
    */
	public String getSupAccountNumber(){
		return supAccountNumber;
	}
	/**
	* <p>Discription:[银行账户]</p>
	* Created on 2021年11月17日
	* @author:刘超
	*/
	public void setSupAccountNumber(String supAccountNumber){
		this.supAccountNumber = supAccountNumber;
	}
	/**
	* <p>Discription:[开户行名称]</p>
	* Created on 2021年11月17日
	* @return String
    * @author:刘超
    */
	public String getSupBankName(){
		return supBankName;
	}
	/**
	* <p>Discription:[开户行名称]</p>
	* Created on 2021年11月17日
	}
	/**
	* <p>Discription:[备注]</p>
	* Created on 2021年11月17日
	* @return String
    * @author:刘超
    */
	public String getSupRemark(){
		return supRemark;
	}
	/**
	* <p>Discription:[备注]</p>
	* Created on 2021年11月17日
	* @author:刘超
	*/
	public void setSupRemark(String supRemark){
		this.supRemark = supRemark;
	}
	/**
	* <p>Discription:[创建时间]</p>
	* Created on 2021年11月17日
	* @return String
    * @author:刘超
    */
	public String getCreateTime(){
		return createTime;
	}
	/**
	* <p>Discription:[创建时间]</p>
	* Created on 2021年11月17日
	* @author:刘超
	*/
	public void setCreateTime(String createTime){
		this.createTime = createTime;
	}
	/**
	* <p>Discription:[更新时间]</p>
	* Created on 2021年11月17日
	* @return String
    * @author:刘超
    */
	public String getUpdateTime(){
		return updateTime;
	}
	/**
	* <p>Discription:[更新时间]</p>
	* Created on 2021年11月17日
	* @author:刘超
	*/
	public void setUpdateTime(String updateTime){
		this.updateTime = updateTime;
	}
	/**
	* <p>Discription:[扩展字段]</p>
	* Created on 2021年11月17日
	* @return String
    * @author:刘超
    */
	public String getSupExt(){
		return supExt;
	}
	/**
	* <p>Discription:[扩展字段]</p>
	* Created on 2021年11月17日
	* @author:刘超
	*/
	public void setSupExt(String supExt){
		this.supExt = supExt;
	}
}
