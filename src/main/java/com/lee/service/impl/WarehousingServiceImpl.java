package com.lee.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lee.entity.WarehouseMaterialInfoModel;
import com.lee.entity.WarehousingInfoModel;
import com.lee.entity.common.GenericResponse;
import com.lee.entity.common.ResponseFormat;
import com.lee.mapper.WarehouseMaterialMapper;
import com.lee.mapper.WarehousingMapper;
import com.lee.service.WarehousingService;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class WarehousingServiceImpl extends ServiceImpl<WarehousingMapper, WarehousingInfoModel> implements WarehousingService {

    @Autowired
    WarehousingMapper warehousingMapper;

    @Autowired
    WarehouseMaterialMapper warehouseMaterialMapper;

    @Override
    public GenericResponse getPageInfo(Map<String, Object> queryParam) {
        IPage<WarehousingInfoModel> page = new Page<>();
        List<WarehousingInfoModel> warehousingInfoModels = this.warehousingMapper.selectWarehousingList(queryParam);
        // 入库单物资列表
        if (!CollectionUtils.isEmpty(warehousingInfoModels)) {
            for (WarehousingInfoModel model : warehousingInfoModels) {
                // 采购订单物资信息列表
                model.setMaterials(warehouseMaterialMapper.selectList(new LambdaQueryWrapper<WarehouseMaterialInfoModel>()
                        .eq(WarehouseMaterialInfoModel::getWarehouseNum, model.getWarehousingNum())));
            }
        }
        page.setRecords(warehousingInfoModels);
        page.setTotal(this.warehousingMapper.selectWarehousingCount(queryParam));
        page.setCurrent(Long.valueOf(String.valueOf(queryParam.get("offsetIndex"))));
        page.setSize(Long.valueOf(String.valueOf(queryParam.get("limit"))));
        // 入库单物资列表

        return ResponseFormat.retParam(200, page);
    }
}
