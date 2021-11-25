package com.lee.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lee.entity.ExcpLocationInfoModel;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public interface ExcpLocationMapper extends BaseMapper<ExcpLocationInfoModel> {

    List<ExcpLocationInfoModel> selectLocationList(Map<String, Object> map);

    Integer selectLocationCount(Map<String, Object> map);
}
