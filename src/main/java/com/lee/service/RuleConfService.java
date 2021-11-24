package com.lee.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lee.entity.RuleConfInfoModel;
import com.lee.entity.common.GenericResponse;

import java.util.Map;

public interface RuleConfService extends IService<RuleConfInfoModel> {

    GenericResponse getPageInfo(Map<String, Object> queryParam);

}
