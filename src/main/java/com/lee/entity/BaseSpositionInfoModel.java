package com.lee.entity;

import java.io.Serializable;
public class BaseSpositionInfoModel  implements Serializable {

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

	private String bareaName;
	/**
     * 储区编号
     */
	private String sareaNum;

	private String sareaName;
	/**
     * 层
     */
	private Integer spositionLayer;
	/**
     * 上架顺序
     */
	private Integer spositionPutonOrder;
	/**
     * 拣货作业顺序
     */
	private Integer spositionWorkOrder;
	/**
     * 储位类型
     */
	private String spositionType;

	private String spositionTypeName;
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
	
	// setter and getter


	public String getBareaName() {
		return bareaName;
	}

	public void setBareaName(String bareaName) {
		this.bareaName = bareaName;
	}

	public String getSareaName() {
		return sareaName;
	}

	public void setSareaName(String sareaName) {
		this.sareaName = sareaName;
	}

	public String getSpositionTypeName() {
		return spositionTypeName;
	}

	public void setSpositionTypeName(String spositionTypeName) {
		this.spositionTypeName = spositionTypeName;
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
	* <p>Discription:[层]</p>
	* Created on 2021年11月18日
	* @return Integer
    * @author:刘超
    */
	public Integer getSpositionLayer(){
		return spositionLayer;
	}
	/**
	* <p>Discription:[层]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setSpositionLayer(Integer spositionLayer){
		this.spositionLayer = spositionLayer;
	}
	/**
	* <p>Discription:[上架顺序]</p>
	* Created on 2021年11月18日
	* @return Integer
    * @author:刘超
    */
	public Integer getSpositionPutonOrder(){
		return spositionPutonOrder;
	}
	/**
	* <p>Discription:[上架顺序]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setSpositionPutonOrder(Integer spositionPutonOrder){
		this.spositionPutonOrder = spositionPutonOrder;
	}
	/**
	* <p>Discription:[拣货作业顺序]</p>
	* Created on 2021年11月18日
	* @return Integer
    * @author:刘超
    */
	public Integer getSpositionWorkOrder(){
		return spositionWorkOrder;
	}
	/**
	* <p>Discription:[拣货作业顺序]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setSpositionWorkOrder(Integer spositionWorkOrder){
		this.spositionWorkOrder = spositionWorkOrder;
	}
	/**
	* <p>Discription:[储位类型]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getSpositionType(){
		return spositionType;
	}
	/**
	* <p>Discription:[储位类型]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setSpositionType(String spositionType){
		this.spositionType = spositionType;
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
}
