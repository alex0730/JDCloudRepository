package com.lee.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lee.entity.ExcpLocationInfoModel;
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
public interface ExcpLocationService extends IService<ExcpLocationInfoModel> {

    GenericResponse getPageInfo(Map<String, Object> queryParam);


}
