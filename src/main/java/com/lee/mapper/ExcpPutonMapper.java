package com.lee.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lee.entity.ExcpPutonInfoModel;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public interface ExcpPutonMapper extends BaseMapper<ExcpPutonInfoModel> {

    List<ExcpPutonInfoModel> selectPutonList(Map<String, Object> map);

    Integer selectPutonCount(Map<String, Object> map);

}
