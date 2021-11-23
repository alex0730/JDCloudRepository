package com.lee.entity;

import java.io.Serializable;
public class RulePutverifiInfoModel  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 主键
     */
	private Integer id;
	/**
     * 配置代码
     */
	private String verifiConfNum;
	/**
     * 库位混放限制
     */
	private String verifiMixLimit;
	/**
     * 库位空间限制
     */
	private String verifiSpaceLimit;
	/**
     * 描述
     */
	private String verifiDesc;
	/**
     * 创建人
     */
	private String creator;
	/**
     * 创建时间
     */
	private String createTime;
	/**
     * 更新人
     */
	private String updater;
	/**
     * 更新时间
     */
	private String updateTime;
	/**
     * 扩展字段
     */
	private String verifiExt;
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
	* <p>Discription:[配置代码]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getVerifiConfNum(){
		return verifiConfNum;
	}
	/**
	* <p>Discription:[配置代码]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setVerifiConfNum(String verifiConfNum){
		this.verifiConfNum = verifiConfNum;
	}
	/**
	* <p>Discription:[库位混放限制]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getVerifiMixLimit(){
		return verifiMixLimit;
	}
	/**
	* <p>Discription:[库位混放限制]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setVerifiMixLimit(String verifiMixLimit){
		this.verifiMixLimit = verifiMixLimit;
	}
	/**
	* <p>Discription:[库位空间限制]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getVerifiSpaceLimit(){
		return verifiSpaceLimit;
	}
	/**
	* <p>Discription:[库位空间限制]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setVerifiSpaceLimit(String verifiSpaceLimit){
		this.verifiSpaceLimit = verifiSpaceLimit;
	}
	/**
	* <p>Discription:[描述]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getVerifiDesc(){
		return verifiDesc;
	}
	/**
	* <p>Discription:[描述]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setVerifiDesc(String verifiDesc){
		this.verifiDesc = verifiDesc;
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
	public String getVerifiExt(){
		return verifiExt;
	}
	/**
	* <p>Discription:[扩展字段]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setVerifiExt(String verifiExt){
		this.verifiExt = verifiExt;
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
