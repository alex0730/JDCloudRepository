package com.lee.entity;

import java.io.Serializable;
public class RulePutrecommInfoModel  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 主键
     */
	private Integer id;
	/**
     * 上架规则编号
     */
	private String putonNum;
	/**
     * 上架规则名称
     */
	private String putonName;
	/**
     * 上架规则描述
     */
	private String putonDesc;
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
	private String putrecommExt;
	/**
     * 逻辑删除标记
     */
	private Integer isdel;
	
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
	* <p>Discription:[上架规则编号]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getPutonNum(){
		return putonNum;
	}
	/**
	* <p>Discription:[上架规则编号]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setPutonNum(String putonNum){
		this.putonNum = putonNum;
	}
	/**
	* <p>Discription:[上架规则名称]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getPutonName(){
		return putonName;
	}
	/**
	* <p>Discription:[上架规则名称]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setPutonName(String putonName){
		this.putonName = putonName;
	}
	/**
	* <p>Discription:[上架规则描述]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getPutonDesc(){
		return putonDesc;
	}
	/**
	* <p>Discription:[上架规则描述]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setPutonDesc(String putonDesc){
		this.putonDesc = putonDesc;
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
	public String getPutrecommExt(){
		return putrecommExt;
	}
	/**
	* <p>Discription:[扩展字段]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setPutrecommExt(String putrecommExt){
		this.putrecommExt = putrecommExt;
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
