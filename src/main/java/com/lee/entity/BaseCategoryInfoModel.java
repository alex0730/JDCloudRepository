package com.lee.entity;

import java.io.Serializable;
public class BaseCategoryInfoModel  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 主键
     */
	private Integer id;
	/**
     * 类目编码
     */
	private String categoryNum;
	/**
     * 类目名称
     */
	private String categoryName;
	/**
     * 上级目录编码
     */
	private String categoryParentNum;
	/**
     * 上级目录编码
     */
	private String categoryParentName;
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
	private String categoryExt;
	/**
     * 逻辑删除标记
     */
	private Integer isdel;

	public String getCategoryParentName() {
		return categoryParentName;
	}

	public void setCategoryParentName(String categoryParentName) {
		this.categoryParentName = categoryParentName;
	}

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
	* <p>Discription:[类目编码]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getCategoryNum(){
		return categoryNum;
	}
	/**
	* <p>Discription:[类目编码]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setCategoryNum(String categoryNum){
		this.categoryNum = categoryNum;
	}
	/**
	* <p>Discription:[类目名称]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getCategoryName(){
		return categoryName;
	}
	/**
	* <p>Discription:[类目名称]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setCategoryName(String categoryName){
		this.categoryName = categoryName;
	}
	/**
	* <p>Discription:[上级目录编码]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getCategoryParentNum(){
		return categoryParentNum;
	}
	/**
	* <p>Discription:[上级目录编码]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setCategoryParentNum(String categoryParentNum){
		this.categoryParentNum = categoryParentNum;
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
	public String getCategoryExt(){
		return categoryExt;
	}
	/**
	* <p>Discription:[扩展字段]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setCategoryExt(String categoryExt){
		this.categoryExt = categoryExt;
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
