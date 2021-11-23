package com.lee.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lee.entity.PurchaseOrderInfoModel;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public interface PurchaseMapper extends BaseMapper<PurchaseOrderInfoModel> {

    List<PurchaseOrderInfoModel> selectPurchaseOrderList(Map<String, Object> map);

    Integer selectPurchaseOrderCount(Map<String, Object> map);

}
