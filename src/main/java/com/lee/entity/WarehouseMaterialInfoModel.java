package com.lee.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName(value = "warehouse_material_info")
public class WarehouseMaterialInfoModel implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     *
     */
    private Integer id;
    /**
     * 入库单编号
     */
    private String warehouseNum;
    /**
     * 物资编号
     */
    private String warehouseMatCode;
    /**
     * 物资应收数量
     */
    private Integer warehouseMatReceived;
    /**
     * 物资待收数量
     */
    private String warehouseMatReceivable;
    /**
     * 物资验证状态
     */
    private String warehouseMatStatus;
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
    private String warehouseMatExt;

    // setter and getter

}
