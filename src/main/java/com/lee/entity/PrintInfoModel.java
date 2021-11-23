package com.lee.entity;

import java.io.Serializable;
public class PrintInfoModel  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 主键Id
     */
	private Integer id;
	/**
     * 打印机名称
     */
	private String printName;
	/**
     * 打印机硬件配置
     */
	private String printConf;
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
	private String printExt;
	/**
     * 逻辑删除标记
     */
	private Integer isdel;
	
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
	* <p>Discription:[打印机名称]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getPrintName(){
		return printName;
	}
	/**
	* <p>Discription:[打印机名称]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setPrintName(String printName){
		this.printName = printName;
	}
	/**
	* <p>Discription:[打印机硬件配置]</p>
	* Created on 2021年11月18日
	* @return String
    * @author:刘超
    */
	public String getPrintConf(){
		return printConf;
	}
	/**
	* <p>Discription:[打印机硬件配置]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setPrintConf(String printConf){
		this.printConf = printConf;
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
	public String getPrintExt(){
		return printExt;
	}
	/**
	* <p>Discription:[扩展字段]</p>
	* Created on 2021年11月18日
	* @author:刘超
	*/
	public void setPrintExt(String printExt){
		this.printExt = printExt;
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
