package com.lee.entity;

import java.io.Serializable;
public class BaseSareaInfoModel  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 主键
     */
	private Integer id;
	/**
     * 储区编号
     */
	private String sareaNum;
	/**
     * 储区名称
     */
	private String sareaName;
	/**
     * 大区编码
     */
	private String bareaNum;

	private String bareaName;
	/**
     * 储区类型
     */
	private String sareaType;

	private String sareaTypeName;
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
	private String sareaExt;
	/**
     * 逻辑删除标记
     */
	private Integer isdel;
	
	// setter and getter


	public String getBareaName() {
		return bareaName;
	}

	public void setBareaName(String bareaName) {
		this.bareaName = bareaName;
	}

	public String getSareaTypeName() {
		return sareaTypeName;
	}

	public void setSareaTypeName(String sareaTypeName) {
		this.sareaTypeName = sareaTypeName;
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
	* <p>Discription:[储区编号]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getSareaNum(){
		return sareaNum;
	}
	/**
	* <p>Discription:[储区编号]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setSareaNum(String sareaNum){
		this.sareaNum = sareaNum;
	}
	/**
	* <p>Discription:[储区名称]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getSareaName(){
		return sareaName;
	}
	/**
	* <p>Discription:[储区名称]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setSareaName(String sareaName){
		this.sareaName = sareaName;
	}
	/**
	* <p>Discription:[大区编码]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getBareaNum(){
		return bareaNum;
	}
	/**
	* <p>Discription:[大区编码]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setBareaNum(String bareaNum){
		this.bareaNum = bareaNum;
	}
	/**
	* <p>Discription:[储区类型]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getSareaType(){
		return sareaType;
	}
	/**
	* <p>Discription:[储区类型]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setSareaType(String sareaType){
		this.sareaType = sareaType;
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
	public String getSareaExt(){
		return sareaExt;
	}
	/**
	* <p>Discription:[扩展字段]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setSareaExt(String sareaExt){
		this.sareaExt = sareaExt;
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
