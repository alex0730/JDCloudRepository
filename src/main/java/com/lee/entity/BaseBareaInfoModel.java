package com.lee.entity;

import java.io.Serializable;
public class BaseBareaInfoModel  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 主键
     */
	private Integer id;
	/**
     * 仓库号
     */
	private String depositoryNum;
	/**
     * 仓库号
     */
	private String depositoryName;
	/**
     * 大区编号
     */
	private String bareaNum;
	/**
     * 大区名称
     */
	private String bareaName;
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
	private String bareaExt;
	/**
     * 逻辑删除标记
     */
	private Integer isdel;
	
	// setter and getter


	public String getDepositoryName() {
		return depositoryName;
	}

	public void setDepositoryName(String depositoryName) {
		this.depositoryName = depositoryName;
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
	* <p>Discription:[仓库号]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getDepositoryNum(){
		return depositoryNum;
	}
	/**
	* <p>Discription:[仓库号]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setDepositoryNum(String depositoryNum){
		this.depositoryNum = depositoryNum;
	}
	/**
	* <p>Discription:[大区编号]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getBareaNum(){
		return bareaNum;
	}
	/**
	* <p>Discription:[大区编号]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setBareaNum(String bareaNum){
		this.bareaNum = bareaNum;
	}
	/**
	* <p>Discription:[大区名称]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getBareaName(){
		return bareaName;
	}
	/**
	* <p>Discription:[大区名称]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setBareaName(String bareaName){
		this.bareaName = bareaName;
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
	public String getBareaExt(){
		return bareaExt;
	}
	/**
	* <p>Discription:[扩展字段]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setBareaExt(String bareaExt){
		this.bareaExt = bareaExt;
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
