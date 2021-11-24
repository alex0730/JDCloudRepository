package com.lee.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lee.entity.RuleConfInfoModel;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public interface RuleConfMapper extends BaseMapper<RuleConfInfoModel> {

    List<RuleConfInfoModel> selectRuleConfList(Map<String, Object> map);

    Integer selectRuleConfCount(Map<String, Object> map);


}
