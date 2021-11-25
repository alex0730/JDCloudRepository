package com.lee.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lee.entity.ExcpPutonInfoModel;
import com.lee.entity.common.GenericResponse;

import java.util.Map;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author lee
 * @since 2020-02-19
 */
public interface ExcpPutonService extends IService<ExcpPutonInfoModel> {

    GenericResponse getPageInfo(Map<String, Object> queryParam);


}
