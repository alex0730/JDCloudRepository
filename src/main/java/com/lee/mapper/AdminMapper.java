package com.lee.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lee.entity.Admin;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lee
 * @since 2020-02-19
 */
@Component
public interface AdminMapper extends BaseMapper<Admin> {

    List<Admin> selectUserList(Map<String,Object> map);

    Integer selectUserCount(Map<String,Object> map);
}
