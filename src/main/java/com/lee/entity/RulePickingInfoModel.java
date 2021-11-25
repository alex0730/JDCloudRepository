package com.lee.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName(value = "rule_picking_info")
public class RulePickingInfoModel implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Integer id;
    /**
     * 规则编码
     */
    private String pickingNum;
    /**
     * 规则描述
     */
    private String pickingDesc;
    /**
     * 执行顺序
     */
    private Integer pickingExecuteOrder;
    /**
     * 状态
     */
    private String pickingStatus;
    /**
     * 订单类型
     */
    private String pickingOrderType;
    /**
     * 供应商编码
     */
    private String supplierNum;
    @TableField(exist = false)
    private String supplierName;
    /**
     * 创建时间
     */
    private String createTime;
    /**
     * 更新时间
     */
    private String updater;
    /**
     * 更新时间
     */
    private String updateTime;
    /**
     * 扩展字段
     */
    private String pickingExt;
    /**
     * 逻辑删除标记
     */
    private Integer isdel;
    /**
     * 体积限制
     */
    private String limitVolume;
    /**
     * 重量限制
     */
    private String limitWeight;
    /**
     * 数量限制
     */
    private String limitCount;
    /**
     * 品种限制
     */
    private String limitVarieties;
    /**
     * 任务条数限制
     */
    private String limitTask;

}
