package com.lee.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lee.entity.PurchaseAnnexInfoModel;
import com.lee.entity.PurchaseMaterialInfoModel;
import com.lee.entity.PurchaseOrderInfoModel;
import com.lee.entity.PurchasePaymentInfoModel;
import com.lee.entity.common.GenericResponse;
import com.lee.entity.common.ResponseFormat;
import com.lee.mapper.PurchaseAnnexMapper;
import com.lee.mapper.PurchaseMapper;
import com.lee.mapper.PurchaseMaterialMapper;
import com.lee.mapper.PurchasePaymentMapper;
import com.lee.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author lee
 * @since 2020-02-19
 */
@Service
public class PurchaseServiceImpl extends ServiceImpl<PurchaseMapper, PurchaseOrderInfoModel> implements PurchaseService {

    @Autowired
    PurchaseMapper purchaseMapper;

    @Autowired
    PurchaseMaterialMapper purchaseMaterialMapper;

    @Autowired
    PurchasePaymentMapper purchasePaymentMapper;

    @Autowired
    PurchaseAnnexMapper purchaseAnnexMapper;

    public GenericResponse getPageInfo(Map<String, Object> queryParam) {
        IPage<PurchaseOrderInfoModel> page = new Page<>();
        List<PurchaseOrderInfoModel> purchaseOrderInfoModels = this.purchaseMapper.selectPurchaseOrderList(queryParam);
        if (!CollectionUtils.isEmpty(purchaseOrderInfoModels)) {
            for (PurchaseOrderInfoModel model : purchaseOrderInfoModels) {
                model.setMaterials(purchaseMaterialMapper.selectList(new LambdaQueryWrapper<PurchaseMaterialInfoModel>()
                        .eq(PurchaseMaterialInfoModel::getPurchaseNum, model.getPurchaseNum())));
            }
        }
        page.setRecords(purchaseOrderInfoModels);
        page.setTotal(this.purchaseMapper.selectPurchaseOrderCount(queryParam));
        page.setCurrent(Long.valueOf(String.valueOf(queryParam.get("offsetIndex"))));
        page.setSize(Long.valueOf(String.valueOf(queryParam.get("limit"))));
        return ResponseFormat.retParam(200, page);
    }

    public GenericResponse getPurchaseOrderInfo(Integer id) {
        PurchaseOrderInfoModel model = purchaseMapper.selectOne(new LambdaQueryWrapper<PurchaseOrderInfoModel>()
                .eq(PurchaseOrderInfoModel::getId, id));
        // 采购订单物资信息列表
        model.setMaterials(purchaseMaterialMapper.selectList(new LambdaQueryWrapper<PurchaseMaterialInfoModel>()
                .eq(PurchaseMaterialInfoModel::getPurchaseNum, model.getPurchaseNum())));
        // 采购订单支付信息
        model.setPayments(purchasePaymentMapper.selectList(new LambdaQueryWrapper<PurchasePaymentInfoModel>()
                .eq(PurchasePaymentInfoModel::getPurchaseOrderNum, model.getPurchaseNum())));
        // 合同附件列表
        model.setHannexs(purchaseAnnexMapper.selectList(
                new LambdaQueryWrapper<PurchaseAnnexInfoModel>().eq(PurchaseAnnexInfoModel::getPurchaseAnnexType, "合同附件")
                        .eq(PurchaseAnnexInfoModel::getPurchaseOrderNum, model.getPurchaseNum())));
        // 其他流程附件
        model.setOannexs(purchaseAnnexMapper.selectList(
                new LambdaQueryWrapper<PurchaseAnnexInfoModel>().eq(PurchaseAnnexInfoModel::getPurchaseAnnexType, "其他流程附件")
                        .eq(PurchaseAnnexInfoModel::getPurchaseOrderNum, model.getPurchaseNum())));
        return ResponseFormat.retParam(200, model);
    }

}
