package com.lee.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lee.entity.ExcpLocationInfoModel;
import com.lee.entity.common.GenericResponse;
import com.lee.entity.common.ResponseFormat;
import com.lee.mapper.ExcpLocationMapper;
import com.lee.service.ExcpLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ExcLocationServiceImpl extends ServiceImpl<ExcpLocationMapper, ExcpLocationInfoModel> implements ExcpLocationService {

    @Autowired
    ExcpLocationMapper locationMapper;

    /**
     * 根据查询条件获取管理员列表信息
     *
     * @param queryParam
     * @return
     */
    public GenericResponse getPageInfo(Map<String, Object> queryParam) {
        IPage<ExcpLocationInfoModel> page = new Page<>();
        page.setRecords(this.locationMapper.selectLocationList(queryParam));
        page.setTotal(this.locationMapper.selectLocationCount(queryParam));
        page.setCurrent(Long.valueOf(String.valueOf(queryParam.get("offsetIndex"))));
        page.setSize(Long.valueOf(String.valueOf(queryParam.get("limit"))));
        return ResponseFormat.retParam(200, page);
    }

}
