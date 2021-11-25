package com.lee.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lee.common.DateTimeUtil;
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
import org.springframework.transaction.annotation.Transactional;
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
                // 采购订单物资信息列表
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
        if (model == null) {
            return ResponseFormat.retParam(50001, "数据未找到");
        }
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

    @Override
    @Transactional(rollbackFor = Exception.class)
    public GenericResponse save(PurchaseOrderInfoModel model, List<PurchaseMaterialInfoModel> materials,
                                List<PurchasePaymentInfoModel> payments, List<PurchaseAnnexInfoModel> hannexs,
                                List<PurchaseAnnexInfoModel> oannexs) {
        // 添加采购订单基本信息
        purchaseMapper.insert(model);
        // 添加采购订单物资信息
        if (!CollectionUtils.isEmpty(materials)) {
            for (PurchaseMaterialInfoModel material : materials) {
                material.setCreateTime(DateTimeUtil.nowTimeStr());
                material.setPurchaseNum(model.getPurchaseNum());
                purchaseMaterialMapper.insert(material);
            }
        }
        // 添加采购订单支付信息
        if (!CollectionUtils.isEmpty(payments)) {
            for (PurchasePaymentInfoModel payment : payments) {
                payment.setCreateTime(DateTimeUtil.nowTimeStr());
                payment.setPurchaseOrderNum(model.getPurchaseNum());
                purchasePaymentMapper.insert(payment);
            }
        }
        // 添加采购订单合同附件信息
        if (!CollectionUtils.isEmpty(hannexs)) {
            for (PurchaseAnnexInfoModel hannex : hannexs) {
                hannex.setCreateTime(DateTimeUtil.nowTimeStr());
                hannex.setPurchaseOrderNum(model.getPurchaseNum());
                hannex.setPurchaseAnnexType("合同附件");
                purchaseAnnexMapper.insert(hannex);
            }
        }
        // 添加采购订单其他流程附件信息
        if (!CollectionUtils.isEmpty(hannexs)) {
            for (PurchaseAnnexInfoModel oannex : oannexs) {
                oannex.setCreateTime(DateTimeUtil.nowTimeStr());
                oannex.setPurchaseOrderNum(model.getPurchaseNum());
                oannex.setPurchaseAnnexType("其他流程附件");
                purchaseAnnexMapper.insert(oannex);
            }
        }
        return ResponseFormat.retParam(200, "添加成功");
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public GenericResponse update(PurchaseOrderInfoModel model, List<PurchaseMaterialInfoModel> materials,
                                  List<PurchasePaymentInfoModel> payments, List<PurchaseAnnexInfoModel> hannexs,
                                  List<PurchaseAnnexInfoModel> oannexs) {
        // 修改采购订单基本信息
        purchaseMapper.updateById(model);
        // 删除采购订单下的所有物资信息
        purchaseMaterialMapper.delete(new LambdaQueryWrapper<PurchaseMaterialInfoModel>().
                eq(PurchaseMaterialInfoModel::getPurchaseNum, model.getPurchaseNum()));
        if (!CollectionUtils.isEmpty(materials)) {
            // 修改采购订单物资信息
            for (PurchaseMaterialInfoModel material : materials) {
                material.setCreateTime(DateTimeUtil.nowTimeStr());
                material.setUpdateTime(DateTimeUtil.nowTimeStr());
                material.setPurchaseNum(model.getPurchaseNum());
                purchaseMaterialMapper.insert(material);
            }
        }
        // 删除采购订单下的所有支付信息
        purchasePaymentMapper.delete(new LambdaQueryWrapper<PurchasePaymentInfoModel>().
                eq(PurchasePaymentInfoModel::getPurchaseOrderNum, model.getPurchaseNum()));
        if (!CollectionUtils.isEmpty(payments)) {
            // 修改采购订单支付信息
            for (PurchasePaymentInfoModel payment : payments) {
                payment.setPurchaseOrderNum(model.getPurchaseNum());
                payment.setCreateTime(DateTimeUtil.nowTimeStr());
                payment.setUpdateTime(DateTimeUtil.nowTimeStr());
                purchasePaymentMapper.insert(payment);
            }
        }
        // 删除采购订单下的所有合同附件
        purchaseAnnexMapper.delete(new LambdaQueryWrapper<PurchaseAnnexInfoModel>().eq(PurchaseAnnexInfoModel::getPurchaseAnnexType, "合同附件")
                .eq(PurchaseAnnexInfoModel::getPurchaseOrderNum, model.getPurchaseNum()));
        if (!CollectionUtils.isEmpty(hannexs)) {
            // 修改采购订单合同附件信息
            for (PurchaseAnnexInfoModel hannex : hannexs) {
                hannex.setCreateTime(DateTimeUtil.nowTimeStr());
                hannex.setUpdateTime(DateTimeUtil.nowTimeStr());
                hannex.setPurchaseOrderNum(model.getPurchaseNum());
                hannex.setPurchaseAnnexType("合同附件");
                purchaseAnnexMapper.insert(hannex);
            }
        }
        // 删除采购订单下的其他流程附件
        purchaseAnnexMapper.delete(new LambdaQueryWrapper<PurchaseAnnexInfoModel>().eq(PurchaseAnnexInfoModel::getPurchaseAnnexType, "其他流程附件")
                .eq(PurchaseAnnexInfoModel::getPurchaseOrderNum, model.getPurchaseNum()));
        if (!CollectionUtils.isEmpty(hannexs)) {
            // 修改采购订单其他流程附件信息
            for (PurchaseAnnexInfoModel oannex : oannexs) {
                oannex.setCreateTime(DateTimeUtil.nowTimeStr());
                oannex.setUpdateTime(DateTimeUtil.nowTimeStr());
                oannex.setPurchaseOrderNum(model.getPurchaseNum());
                oannex.setPurchaseAnnexType("其他流程附件");
                purchaseAnnexMapper.insert(oannex);
            }
        }
        return ResponseFormat.retParam(200, "修改成功");
    }
}
