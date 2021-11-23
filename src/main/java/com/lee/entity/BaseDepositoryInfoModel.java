package com.lee.entity;

import java.io.Serializable;
public class BaseDepositoryInfoModel  implements Serializable {

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
     * 仓库名称
     */
	private String depositoryName;
	/**
     * 仓库负责人
     */
	private String depositoryPerson;
	/**
     * 联系电话
     */
	private String depositoryMobile;
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
	private String depositoryExt;
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
	* <p>Discription:[仓库名称]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getDepositoryName(){
		return depositoryName;
	}
	/**
	* <p>Discription:[仓库名称]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setDepositoryName(String depositoryName){
		this.depositoryName = depositoryName;
	}
	/**
	* <p>Discription:[仓库负责人]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getDepositoryPerson(){
		return depositoryPerson;
	}
	/**
	* <p>Discription:[仓库负责人]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setDepositoryPerson(String depositoryPerson){
		this.depositoryPerson = depositoryPerson;
	}
	/**
	* <p>Discription:[联系电话]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getDepositoryMobile(){
		return depositoryMobile;
	}
	/**
	* <p>Discription:[联系电话]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setDepositoryMobile(String depositoryMobile){
		this.depositoryMobile = depositoryMobile;
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
	public String getDepositoryExt(){
		return depositoryExt;
	}
	/**
	* <p>Discription:[扩展字段]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setDepositoryExt(String depositoryExt){
		this.depositoryExt = depositoryExt;
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
