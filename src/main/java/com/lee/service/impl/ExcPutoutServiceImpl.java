package com.lee.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lee.entity.ExcpPutoutInfoModel;
import com.lee.mapper.ExcpPutoutMapper;
import com.lee.service.ExcpPutoutService;
import org.springframework.stereotype.Service;

@Service
public class ExcPutoutServiceImpl extends ServiceImpl<ExcpPutoutMapper, ExcpPutoutInfoModel> implements ExcpPutoutService {

}
