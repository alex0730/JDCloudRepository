package com.lee.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName(value = "excp_putin_info")
public class ExcpPutinInfoModel  implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 主键Id
     */
	private Integer id;
	/**
     * 入库单号
     */
	private String warehousingNum;
	/**
     * 任务状态
     */
	private String status;
	/**
     * 失败次数
     */
	private Integer failCount;
	/**
     * 失败原因
     */
	private String failReason;
	/**
     * 创建时间
     */
	private String createTime;
	/**
     * 更新时间
     */
	private String updateTime;
	/**
     * 逻辑删除标记
     */
	private Integer isdel;
	/**
     * 扩展字段
     */
	private String exputinExt;
	
}