package com.lee.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName(value = "excp_location_info")
public class ExcpLocationInfoModel implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键Id
     */
    private Integer id;
    /**
     * 入库单号
     */
    private String matPurchaseNum;
    /**
     * 影响订单数量
     */
    private Integer influenceOrderCount;
    /**
     * 定位异常数量
     */
    private Integer locationExpCount;
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
    private String exlocationExt;
    @TableField(exist = false)
    private String matName;
    @TableField(exist = false)
    private String matTypeCode;
    @TableField(exist = false)
    private String matNum;


}
