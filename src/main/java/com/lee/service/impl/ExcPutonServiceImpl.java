package com.lee.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lee.entity.ExcpPutonInfoModel;
import com.lee.entity.common.GenericResponse;
import com.lee.entity.common.ResponseFormat;
import com.lee.mapper.ExcpPutonMapper;
import com.lee.service.ExcpPutonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ExcPutonServiceImpl extends ServiceImpl<ExcpPutonMapper, ExcpPutonInfoModel> implements ExcpPutonService {

    @Autowired
    ExcpPutonMapper excpPutonMapper;

    /**
     * 根据查询条件获取管理员列表信息
     *
     * @param queryParam
     * @return
     */
    public GenericResponse getPageInfo(Map<String, Object> queryParam) {
        IPage<ExcpPutonInfoModel> page = new Page<>();
        page.setRecords(this.excpPutonMapper.selectPutonList(queryParam));
        page.setTotal(this.excpPutonMapper.selectPutonCount(queryParam));
        page.setCurrent(Long.valueOf(String.valueOf(queryParam.get("offsetIndex"))));
        page.setSize(Long.valueOf(String.valueOf(queryParam.get("limit"))));
        return ResponseFormat.retParam(200, page);
    }

}
