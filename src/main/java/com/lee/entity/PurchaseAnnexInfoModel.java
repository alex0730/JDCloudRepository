package com.lee.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName(value = "purchase_annex_info")
public class PurchaseAnnexInfoModel implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     *
     */
    private Integer id;
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
    private String annexExt;
    /**
     * 逻辑删除标记
     */
    private Integer isdel;
    /**
     * 附件类型
     */
    private String purchaseAnnexType;
    /**
     * 附件名称
     */
    private String purchaseAnnexAnme;
    /**
     * 采购订单编号
     */
    private String purchaseOrderNum;
    /**
     * 附件相对路径
     */
    private String purchaseAnnexPath;
    /**
     * 附件上传时间
     */
    private String purchaseAnnexUptime;

}
