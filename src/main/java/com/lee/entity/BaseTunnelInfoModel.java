package com.lee.entity;

import java.io.Serializable;
public class BaseTunnelInfoModel  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 主键
     */
	private Integer id;
	/**
     * 储位编号
     */
	private String spositionNum;
	/**
     * 大区编码
     */
	private String bareaNum;
	/**
     * 储区编号
     */
	private String sareaNum;
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
	private String spositionExt;
	/**
     * 逻辑删除标记
     */
	private Integer isdel;
	/**
     * 巷道编号
     */
	private String tunnelNum;
	/**
     * 仓库编号
     */
	private String depositoryNum;

	private String depositoryName;
	/**
     * 方向
     */
	private String tunnelPosition;
	

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
	* <p>Discription:[储位编号]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getSpositionNum(){
		return spositionNum;
	}
	/**
	* <p>Discription:[储位编号]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setSpositionNum(String spositionNum){
		this.spositionNum = spositionNum;
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
	public String getSpositionExt(){
		return spositionExt;
	}
	/**
	* <p>Discription:[扩展字段]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setSpositionExt(String spositionExt){
		this.spositionExt = spositionExt;
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
	* <p>Discription:[巷道编号]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getTunnelNum(){
		return tunnelNum;
	}
	/**
	* <p>Discription:[巷道编号]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setTunnelNum(String tunnelNum){
		this.tunnelNum = tunnelNum;
	}
	/**
	* <p>Discription:[仓库编号]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getDepositoryNum(){
		return depositoryNum;
	}
	/**
	* <p>Discription:[仓库编号]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setDepositoryNum(String depositoryNum){
		this.depositoryNum = depositoryNum;
	}
	/**
	* <p>Discription:[方向]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getTunnelPosition(){
		return tunnelPosition;
	}
	/**
	* <p>Discription:[方向]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setTunnelPosition(String tunnelPosition){
		this.tunnelPosition = tunnelPosition;
	}
}
