package com.lee.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lee.entity.PurchaseAnnexInfoModel;
import com.lee.entity.PurchaseMaterialInfoModel;
import com.lee.entity.PurchaseOrderInfoModel;
import com.lee.entity.PurchasePaymentInfoModel;
import com.lee.entity.common.GenericResponse;

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
public interface PurchaseService extends IService<PurchaseOrderInfoModel> {

    GenericResponse getPageInfo(Map<String, Object> queryParam);

    GenericResponse getPurchaseOrderInfo(Integer id);

    GenericResponse save(PurchaseOrderInfoModel model, List<PurchaseMaterialInfoModel> materials,
                         List<PurchasePaymentInfoModel> payments, List<PurchaseAnnexInfoModel> hannexs, List<PurchaseAnnexInfoModel> oannexs);

    GenericResponse update(PurchaseOrderInfoModel model, List<PurchaseMaterialInfoModel> materials,
                         List<PurchasePaymentInfoModel> payments, List<PurchaseAnnexInfoModel> hannexs, List<PurchaseAnnexInfoModel> oannexs);

    GenericResponse delete(Integer id, String purchaseNum);
}
