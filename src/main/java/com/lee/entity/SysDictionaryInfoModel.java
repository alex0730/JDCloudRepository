package com.lee.entity;

import java.io.Serializable;
/** 
 * <p>Description: [字典管理表 model]</p>
 * Created on 2021年11月17日
 * @author  <a href="mailto: liuchao@camelotchina.com">刘超</a>
 * @version 1.0 
 * Copyright (c) 2016 北京柯莱特科技有限公司  
 */
public class SysDictionaryInfoModel  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 主键Id
     */
	private Integer id;
	/**
     * 数据编号
     */
	private String dicNum;
	/**
     * 数据名称
     */
	private String dicDataName;
	/**
     * 字段名称
     */
	private String dicName;
	/**
     * 状态（）
     */
	private String dicStatus;
	/**
     * 备注
     */
	private String dicRemark;
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
	private String dicExt;
	
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
	* <p>Discription:[数据编号]</p>
	* Created on 2021年11月17日
	* @return String
    * @author:刘超
    */
	public String getDicNum(){
		return dicNum;
	}
	/**
	* <p>Discription:[数据编号]</p>
	* Created on 2021年11月17日
	* @author:刘超
	*/
	public void setDicNum(String dicNum){
		this.dicNum = dicNum;
	}
	/**
	* <p>Discription:[数据名称]</p>
	* Created on 2021年11月17日
	* @return String
    * @author:刘超
    */
	public String getDicDataName(){
		return dicDataName;
	}
	/**
	* <p>Discription:[数据名称]</p>
	* Created on 2021年11月17日
	* @author:刘超
	*/
	public void setDicDataName(String dicDataName){
		this.dicDataName = dicDataName;
	}
	/**
	* <p>Discription:[字段名称]</p>
	* Created on 2021年11月17日
	* @return String
    * @author:刘超
    */
	public String getDicName(){
		return dicName;
	}
	/**
	* <p>Discription:[字段名称]</p>
	* Created on 2021年11月17日
	* @author:刘超
	*/
	public void setDicName(String dicName){
		this.dicName = dicName;
	}
	/**
	* <p>Discription:[状态（）]</p>
	* Created on 2021年11月17日
	* @return String
    * @author:刘超
    */
	public String getDicStatus(){
		return dicStatus;
	}
	/**
	* <p>Discription:[状态（）]</p>
	* Created on 2021年11月17日
	* @author:刘超
	*/
	public void setDicStatus(String dicStatus){
		this.dicStatus = dicStatus;
	}
	/**
	* <p>Discription:[备注]</p>
	* Created on 2021年11月17日
	* @return String
    * @author:刘超
    */
	public String getDicRemark(){
		return dicRemark;
	}
	/**
	* <p>Discription:[备注]</p>
	* Created on 2021年11月17日
	* @author:刘超
	*/
	public void setDicRemark(String dicRemark){
		this.dicRemark = dicRemark;
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
	public String getDicExt(){
		return dicExt;
	}
	/**
	* <p>Discription:[扩展字段]</p>
	* Created on 2021年11月17日
	* @author:刘超
	*/
	public void setDicExt(String dicExt){
		this.dicExt = dicExt;
	}
}
