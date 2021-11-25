package com.lee.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("rule_conf_info")
public class RuleConfInfoModel implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Integer id;
    /**
     * 规则配置描述
     */
    private String confDesc;
    /**
     * 规则编码
     */
    private String confNum;
    /**
     * 业务类型
     */
    private String businessType;
    /**
     * 操作类型
     */
    private String operationType;
    /**
     * 规则编码
     */
    private String ruleCode;
    /**
     * 物资信息编码
     */
    private String materialNum;
    /**
     * 优先级
     */
    private Integer confPriority;
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
    private String confExt;
    /**
     * 逻辑删除标记
     */
    private Integer isdel;
    /**
     * 规则类型
     */
    private String ruleType;
    /**
     * 货主
     */
    private String ownerName;

    private String ruleName;
    @TableField(exist = false)
    private String matName;
    @TableField(exist = false)
    private String matTypeCode;
    @TableField(exist = false)
    private String supplierName;

    // setter and getter

}
