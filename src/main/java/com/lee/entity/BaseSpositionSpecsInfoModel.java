package com.lee.entity;

import java.io.Serializable;
public class BaseSpositionSpecsInfoModel  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 主键
     */
	private Integer id;
	/**
     * 规格编号
     */
	private String specsNum;
	/**
     * 规格名称
     */
	private String specsName;
	/**
     * 最大重量
     */
	private String maxWeight;
	/**
     * 体积
     */
	private String volume;
	/**
     * 长
     */
	private String length;
	/**
     * 宽
     */
	private String wide;
	/**
     * 高
     */
	private String height;
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
	* <p>Discription:[规格编号]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getSpecsNum(){
		return specsNum;
	}
	/**
	* <p>Discription:[规格编号]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setSpecsNum(String specsNum){
		this.specsNum = specsNum;
	}
	/**
	* <p>Discription:[规格名称]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getSpecsName(){
		return specsName;
	}
	/**
	* <p>Discription:[规格名称]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setSpecsName(String specsName){
		this.specsName = specsName;
	}
	/**
	* <p>Discription:[最大重量]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getMaxWeight(){
		return maxWeight;
	}
	/**
	* <p>Discription:[最大重量]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setMaxWeight(String maxWeight){
		this.maxWeight = maxWeight;
	}
	/**
	* <p>Discription:[体积]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getVolume(){
		return volume;
	}
	/**
	* <p>Discription:[体积]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setVolume(String volume){
		this.volume = volume;
	}
	/**
	* <p>Discription:[长]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getLength(){
		return length;
	}
	/**
	* <p>Discription:[长]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setLength(String length){
		this.length = length;
	}
	/**
	* <p>Discription:[宽]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getWide(){
		return wide;
	}
	/**
	* <p>Discription:[宽]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setWide(String wide){
		this.wide = wide;
	}
	/**
	* <p>Discription:[高]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getHeight(){
		return height;
	}
	/**
	* <p>Discription:[高]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setHeight(String height){
		this.height = height;
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
