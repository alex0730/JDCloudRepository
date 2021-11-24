package com.lee.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName(value = "rule_stockturn_info")
public class RuleStockturnInfoModel implements Serializable {

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

}
