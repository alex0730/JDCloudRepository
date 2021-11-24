package com.lee.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lee.entity.RuleLocationInfoModel;
import com.lee.mapper.RuleLocationMapper;
import com.lee.service.RuleLocationService;
import org.springframework.stereotype.Service;

@Service
public class RuleLocationServiceImpl extends ServiceImpl<RuleLocationMapper, RuleLocationInfoModel> implements RuleLocationService {

}
