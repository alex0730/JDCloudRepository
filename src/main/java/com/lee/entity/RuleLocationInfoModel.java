package com.lee.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName(value = "rule_location_info")
public class RuleLocationInfoModel implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Integer id;
    /**
     * 定位规则编号
     */
    private String locationNum;
    /**
     * 定位规则名称
     */
    private String locationName;
    /**
     * 定位规则描述
     */
    private String locationDesc;
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
    private String locationExt;
    /**
     * 逻辑删除标记
     */
    private Integer isdel;
    /**
     * 规则代码
     */
    private String ruleCode;
    /**
     * 过滤临期物资
     */
    private String filterTempMat;
    /**
     * 储位数量策略
     */
    private String spositionNumPolicy;
    /**
     * 定位库区限制
     */
    private String locationDepositoryLimit;
    /**
     * 创建人
     */
    private String creator;
    /**
     * 更新人
     */
    private String updater;

}
