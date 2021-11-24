package com.lee.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lee.entity.Admin;
import com.lee.entity.WarehousingInfoModel;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public interface WarehousingMapper extends BaseMapper<WarehousingInfoModel> {

    List<Admin> selectWarehousingList(Map<String, Object> map);

    Integer selectWarehousingCount(Map<String, Object> map);

}
