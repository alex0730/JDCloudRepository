package com.lee.entity;

import java.io.Serializable;
public class SysMaterialInfoModel  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 主键Id
     */
	private Integer id;
	/**
     * 采购编号
     */
	private String matPurchaseNum;
	/**
     * 入库单号
     */
	private String matOrderNum;
	/**
     * 物资名称
     */
	private String matName;
	/**
     * 物资类别（material_type_id）
     */
	private String matTypeCode;

	/**
     * 物资类别（material_type_id）
     */
	private String matTypeName;
	/**
     * 物资规格
     */
	private String matSpecs;
	/**
     * 物资单位
     */
	private String matUnit;
	/**
     * 供应商编码
     */
	private String supplierNum;

	private String supplierName;
	/**
     * 库存
     */
	private Integer matNum;
	/**
     * 临期时间
     */
	private String matTemporaryDate;
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
	private String matExt;

	/**
	 * 单价
	 */
	private String	unitPrice;
	/**
	 * 数量
	 */
	private Integer	matCount;
	/**
	 * 金额
	 */
	private String	totalAmount;
	/**
	 * 物资状态
	 */
	private String matStatus;
	// setter and getter


	public String getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Integer getMatCount() {
		return matCount;
	}

	public void setMatCount(Integer matCount) {
		this.matCount = matCount;
	}

	public String getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getMatStatus() {
		return matStatus;
	}

	public void setMatStatus(String matStatus) {
		this.matStatus = matStatus;
	}

	public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getMatTypeName() {
		return matTypeName;
	}

	public void setMatTypeName(String matTypeName) {
		this.matTypeName = matTypeName;
	}

	/**
	* <p>Discription:[主键Id]</p>
	* Created on 2021年11月17日
	* @return Integer
    * @author:刘超
    */
	public Integer getId(){
		return id;
	}
	/**
	* <p>Discription:[主键Id]</p>
	* Created on 2021年11月17日
	* @author:刘超
	*/
	public void setId(Integer id){
		this.id = id;
	}
	/**
	* <p>Discription:[采购编号]</p>
	* Created on 2021年11月17日
	* @return String
    * @author:刘超
    */
	public String getMatPurchaseNum(){
		return matPurchaseNum;
	}
	/**
	* <p>Discription:[采购编号]</p>
	* Created on 2021年11月17日
	* @author:刘超
	*/
	public void setMatPurchaseNum(String matPurchaseNum){
		this.matPurchaseNum = matPurchaseNum;
	}
	/**
	* <p>Discription:[入库单号]</p>
	* Created on 2021年11月17日
	* @return String
    * @author:刘超
    */
	public String getMatOrderNum(){
		return matOrderNum;
	}
	/**
	* <p>Discription:[入库单号]</p>
	* Created on 2021年11月17日
	* @author:刘超
	*/
	public void setMatOrderNum(String matOrderNum){
		this.matOrderNum = matOrderNum;
	}
	/**
	* <p>Discription:[物资名称]</p>
	* Created on 2021年11月17日
	* @return String
    * @author:刘超
    */
	public String getMatName(){
		return matName;
	}
	/**
	* <p>Discription:[物资名称]</p>
	* Created on 2021年11月17日
	* @author:刘超
	*/
	public void setMatName(String matName){
		this.matName = matName;
	}
	/**
	* <p>Discription:[物资类别（material_type_id）]</p>
	* Created on 2021年11月17日
	* @return String
    * @author:刘超
    */
	public String getMatTypeCode(){
		return matTypeCode;
	}
	/**
	* <p>Discription:[物资类别（material_type_id）]</p>
	* Created on 2021年11月17日
	* @author:刘超
	*/
	public void setMatTypeCode(String matTypeCode){
		this.matTypeCode = matTypeCode;
	}
	/**
	* <p>Discription:[物资规格]</p>
	* Created on 2021年11月17日
	* @return String
    * @author:刘超
    */
	public String getMatSpecs(){
		return matSpecs;
	}
	/**
	* <p>Discription:[物资规格]</p>
	* Created on 2021年11月17日
	* @author:刘超
	*/
	public void setMatSpecs(String matSpecs){
		this.matSpecs = matSpecs;
	}
	/**
	* <p>Discription:[物资单位]</p>
	* Created on 2021年11月17日
	* @return String
    * @author:刘超
    */
	public String getMatUnit(){
		return matUnit;
	}
	/**
	* <p>Discription:[物资单位]</p>
	* Created on 2021年11月17日
	* @author:刘超
	*/
	public void setMatUnit(String matUnit){
		this.matUnit = matUnit;
	}
	/**
	* <p>Discription:[供应商编码]</p>
	* Created on 2021年11月17日
	* @return String
    * @author:刘超
    */
	public String getSupplierNum(){
		return supplierNum;
	}
	/**
	* <p>Discription:[供应商编码]</p>
	* Created on 2021年11月17日
	* @author:刘超
	*/
	public void setSupplierNum(String supplierNum){
		this.supplierNum = supplierNum;
	}
	/**
	* <p>Discription:[库存]</p>
	* Created on 2021年11月17日
	* @return Integer
    * @author:刘超
    */
	public Integer getMatNum(){
		return matNum;
	}
	/**
	* <p>Discription:[库存]</p>
	* Created on 2021年11月17日
	* @author:刘超
	*/
	public void setMatNum(Integer matNum){
		this.matNum = matNum;
	}
	/**
	* <p>Discription:[临期时间]</p>
	* Created on 2021年11月17日
	* @return String
    * @author:刘超
    */
	public String getMatTemporaryDate(){
		return matTemporaryDate;
	}
	/**
	* <p>Discription:[临期时间]</p>
	* Created on 2021年11月17日
	* @author:刘超
	*/
	public void setMatTemporaryDate(String matTemporaryDate){
		this.matTemporaryDate = matTemporaryDate;
	}
	/**
	* <p>Discription:[创建时间]</p>
	* Created on 2021年11月17日
	* @return String
    * @author:刘超
    */
	public String getCreateTime(){
		return createTime;
	}
	/**
	* <p>Discription:[创建时间]</p>
	* Created on 2021年11月17日
	* @author:刘超
	*/
	public void setCreateTime(String createTime){
		this.createTime = createTime;
	}
	/**
	* <p>Discription:[更新时间]</p>
	* Created on 2021年11月17日
	* @return String
    * @author:刘超
    */
	public String getUpdateTime(){
		return updateTime;
	}
	/**
	* <p>Discription:[更新时间]</p>
	* Created on 2021年11月17日
	* @author:刘超
	*/
	public void setUpdateTime(String updateTime){
		this.updateTime = updateTime;
	}
	/**
	* <p>Discription:[扩展字段]</p>
	* Created on 2021年11月17日
	* @return String
    * @author:刘超
    */
	public String getMatExt(){
		return matExt;
	}
	/**
	* <p>Discription:[扩展字段]</p>
	* Created on 2021年11月17日
	* @author:刘超
	*/
	public void setMatExt(String matExt){
		this.matExt = matExt;
	}
}
