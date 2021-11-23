package com.lee.entity;

import java.io.Serializable;
public class RuleStockturnInfoModel  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 主键
     */
	private Integer id;
	/**
     * 周转规则编号
     */
	private String stockturnNum;
	/**
     * 周转规则名称
     */
	private String stockturnName;
	/**
     * 周转规则描述
     */
	private String stockturnDesc;
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
	private String stockturnExt;
	/**
     * 逻辑删除标记
     */
	private Integer isdel;
	/**
     * 周转规则备注
     */
	private String stockturnRemark;
	
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
	* <p>Discription:[周转规则编号]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getStockturnNum(){
		return stockturnNum;
	}
	/**
	* <p>Discription:[周转规则编号]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setStockturnNum(String stockturnNum){
		this.stockturnNum = stockturnNum;
	}
	/**
	* <p>Discription:[周转规则名称]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getStockturnName(){
		return stockturnName;
	}
	/**
	* <p>Discription:[周转规则名称]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setStockturnName(String stockturnName){
		this.stockturnName = stockturnName;
	}
	/**
	* <p>Discription:[周转规则描述]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getStockturnDesc(){
		return stockturnDesc;
	}
	/**
	* <p>Discription:[周转规则描述]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setStockturnDesc(String stockturnDesc){
		this.stockturnDesc = stockturnDesc;
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
	public String getStockturnExt(){
		return stockturnExt;
	}
	/**
	* <p>Discription:[扩展字段]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setStockturnExt(String stockturnExt){
		this.stockturnExt = stockturnExt;
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
	* <p>Discription:[周转规则备注]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getStockturnRemark(){
		return stockturnRemark;
	}
	/**
	* <p>Discription:[周转规则备注]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setStockturnRemark(String stockturnRemark){
		this.stockturnRemark = stockturnRemark;
	}
}
