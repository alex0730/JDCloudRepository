package com.lee.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lee.entity.SysMaterialInfoModel;
import com.lee.entity.common.GenericResponse;
import com.lee.entity.common.ResponseFormat;
import com.lee.mapper.MaterialMapper;
import com.lee.service.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lee
 * @since 2020-02-19
 */
@Service
public class MaterialServiceImpl extends ServiceImpl<MaterialMapper, SysMaterialInfoModel> implements MaterialService {

   @Autowired
   MaterialMapper materialMapper;

   /**
    * 根据查询条件获取物资信息列表
    * @param queryParam
    * @return
    */
   public GenericResponse getPageInfo(Map<String, Object> queryParam) {
      IPage<SysMaterialInfoModel> page = new Page<>();
      page.setRecords(this.materialMapper.selectMaterialList(queryParam));
      page.setTotal(this.materialMapper.selectMaterialCount(queryParam));
      page.setCurrent(Long.valueOf(String.valueOf(queryParam.get("offsetIndex"))));
      page.setSize(Long.valueOf(String.valueOf(queryParam.get("limit"))));
      return ResponseFormat.retParam(200, page);
   }

}
