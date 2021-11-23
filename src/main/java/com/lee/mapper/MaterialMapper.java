package com.lee.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lee.entity.SysMaterialInfoModel;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public interface MaterialMapper extends BaseMapper<SysMaterialInfoModel> {

    List<SysMaterialInfoModel> selectMaterialList(Map<String,Object> map);

    Integer selectMaterialCount(Map<String,Object> map);

}
