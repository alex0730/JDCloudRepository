package com.lee.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lee.entity.Admin;
import com.lee.entity.WarehousingInfoModel;
import com.lee.entity.common.GenericResponse;
import com.lee.entity.common.ResponseFormat;
import com.lee.mapper.WarehousingMapper;
import com.lee.service.WarehousingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class WarehousingServiceImpl extends ServiceImpl<WarehousingMapper, WarehousingInfoModel> implements WarehousingService {

    @Autowired
    WarehousingMapper warehousingMapper;

    @Override
    public GenericResponse getPageInfo(Map<String, Object> queryParam) {
        IPage<Admin> page = new Page<>();
        page.setRecords(this.warehousingMapper.selectWarehousingList(queryParam));
        page.setTotal(this.warehousingMapper.selectWarehousingCount(queryParam));
        page.setCurrent(Long.valueOf(String.valueOf(queryParam.get("offsetIndex"))));
        page.setSize(Long.valueOf(String.valueOf(queryParam.get("limit"))));
        return ResponseFormat.retParam(200, page);
    }
}
