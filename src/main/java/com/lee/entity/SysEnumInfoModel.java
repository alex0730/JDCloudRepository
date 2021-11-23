package com.lee.entity;

import java.io.Serializable;
public class SysEnumInfoModel  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 主键Id
     */
	private Integer id;
	/**
     * 枚举值编码
     */
	private String enuNum;
	/**
     * 枚举值名称
     */
	private String enuName;
	/**
     * 字典键值
     */
	private String enuDicNum;
	/**
     * 字典排序
     */
	private String enuDicOrder;
	/**
     * 枚举状态（）
     */
	private String enuStatus;
	/**
     * 备注
     */
	private String enuRemark;
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
	private String enuExt;
	
	// setter and getter
	/**
	* <p>Discription:[主键Id]</p>
	* Created on 2021年11月18日
	* @return Integer
    * @author:刘超
    */
	public Integer getId(){
		return id;
	}
	/**
	* <p>Discription:[主键Id]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setId(Integer id){
		this.id = id;
	}
	/**
	* <p>Discription:[枚举值编码]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getEnuNum(){
		return enuNum;
	}
	/**
	* <p>Discription:[枚举值编码]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setEnuNum(String enuNum){
		this.enuNum = enuNum;
	}
	/**
	* <p>Discription:[枚举值名称]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getEnuName(){
		return enuName;
	}
	/**
	* <p>Discription:[枚举值名称]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setEnuName(String enuName){
		this.enuName = enuName;
	}
	/**
	* <p>Discription:[字典键值]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getEnuDicNum(){
		return enuDicNum;
	}
	/**
	* <p>Discription:[字典键值]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setEnuDicNum(String enuDicNum){
		this.enuDicNum = enuDicNum;
	}
	/**
	* <p>Discription:[字典排序]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getEnuDicOrder(){
		return enuDicOrder;
	}
	/**
	* <p>Discription:[字典排序]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setEnuDicOrder(String enuDicOrder){
		this.enuDicOrder = enuDicOrder;
	}
	/**
	* <p>Discription:[枚举状态（）]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getEnuStatus(){
		return enuStatus;
	}
	/**
	* <p>Discription:[枚举状态（）]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setEnuStatus(String enuStatus){
		this.enuStatus = enuStatus;
	}
	/**
	* <p>Discription:[备注]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getEnuRemark(){
		return enuRemark;
	}
	/**
	* <p>Discription:[备注]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setEnuRemark(String enuRemark){
		this.enuRemark = enuRemark;
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
	public String getEnuExt(){
		return enuExt;
	}
	/**
	* <p>Discription:[扩展字段]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setEnuExt(String enuExt){
		this.enuExt = enuExt;
	}
}
