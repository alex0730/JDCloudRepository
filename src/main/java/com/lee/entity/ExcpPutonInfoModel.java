package com.lee.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName(value = "excp_puton_info")
public class ExcpPutonInfoModel implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键Id
     */
    private Integer id;
    /**
     * 容器编号
     */
    private String containerNum;
    /**
     * 采购物资编号
     */
    private String matPurchaseNum;
    /**
     * 失败原因
     */
    private String expReason;
    /**
     * 应收数量
     */
    private Integer receivableCount;
    /**
     * 实收数量
     */
    private Integer receivedCount;
    /**
     * 处理数量
     */
    private Integer handleCount;
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
    private String exputonExt;
    /**
     * 逻辑删除标记
     */
    private Integer isdel;

    @TableField(exist = false)
    private String matName;
    @TableField(exist = false)
    private String matTypeCode;
    @TableField(exist = false)
    private String matNum;
    @TableField(exist = false)
    private String matUnit;
    @TableField(exist = false)
    private String matSpecs;

}
