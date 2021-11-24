package com.lee.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lee.entity.RuleConfInfoModel;
import com.lee.entity.common.GenericResponse;
import com.lee.entity.common.ResponseFormat;
import com.lee.mapper.RuleConfMapper;
import com.lee.service.RuleConfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class RuleConfServiceImpl extends ServiceImpl<RuleConfMapper, RuleConfInfoModel> implements RuleConfService {

    @Autowired
    private RuleConfMapper ruleConfMapper;

    @Override
    public GenericResponse getPageInfo(Map<String, Object> queryParam) {
        IPage<RuleConfInfoModel> page = new Page<>();
        page.setRecords(this.ruleConfMapper.selectRuleConfList(queryParam));
        page.setTotal(this.ruleConfMapper.selectRuleConfCount(queryParam));
        page.setCurrent(Long.valueOf(String.valueOf(queryParam.get("offsetIndex"))));
        page.setSize(Long.valueOf(String.valueOf(queryParam.get("limit"))));
        return ResponseFormat.retParam(200, page);
    }
}
