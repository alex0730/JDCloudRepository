package com.lee.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lee.entity.SysSupplierInfoModel;
import com.lee.mapper.SysSupplierMapper;
import com.lee.service.SupplierService;
import org.springframework.stereotype.Service;

@Service
public class SupplierServiceImpl extends ServiceImpl<SysSupplierMapper, SysSupplierInfoModel> implements SupplierService {
}
