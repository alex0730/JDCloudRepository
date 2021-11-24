package com.lee.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName(value = "rule_putrecomm_info")
public class RulePutrecommInfoModel implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Integer id;
    /**
     * 上架规则编号
     */
    private String putonNum;
    /**
     * 上架规则名称
     */
    private String putonName;
    /**
     * 上架规则描述
     */
    private String putonDesc;
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
    private String putrecommExt;
    /**
     * 备注
     */
    private String putonRemark;
    /**
     * 逻辑删除标记
     */
    private Integer isdel;

}
