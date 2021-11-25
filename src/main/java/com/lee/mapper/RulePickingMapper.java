package com.lee.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lee.entity.RuleConfInfoModel;
import com.lee.entity.RulePickingInfoModel;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public interface RulePickingMapper extends BaseMapper<RulePickingInfoModel> {

    List<RuleConfInfoModel> selectRulePickingList(Map<String, Object> map);

    Integer selectRulePickingCount(Map<String, Object> map);

}
