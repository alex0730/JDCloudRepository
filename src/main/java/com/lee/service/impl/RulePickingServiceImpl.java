package com.lee.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lee.entity.RuleConfInfoModel;
import com.lee.entity.RulePickingInfoModel;
import com.lee.entity.common.GenericResponse;
import com.lee.entity.common.ResponseFormat;
import com.lee.mapper.RulePickingMapper;
import com.lee.service.RulePickingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class RulePickingServiceImpl extends ServiceImpl<RulePickingMapper, RulePickingInfoModel> implements RulePickingService {

    @Autowired
    private RulePickingMapper rulePickingMapper;

    @Override
    public GenericResponse getPageInfo(Map<String, Object> queryParam) {
        IPage<RuleConfInfoModel> page = new Page<>();
        page.setRecords(this.rulePickingMapper.selectRulePickingList(queryParam));
        page.setTotal(this.rulePickingMapper.selectRulePickingCount(queryParam));
        page.setCurrent(Long.valueOf(String.valueOf(queryParam.get("offsetIndex"))));
        page.setSize(Long.valueOf(String.valueOf(queryParam.get("limit"))));
        return ResponseFormat.retParam(200, page);
    }

    @Override
    public RulePickingInfoModel getById(Integer id) {
        return rulePickingMapper.selectById(id);
    }
}
