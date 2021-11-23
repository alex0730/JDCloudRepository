package com.lee.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lee.entity.Admin;
import com.lee.entity.common.GenericResponse;
import com.lee.entity.common.ResponseFormat;
import com.lee.mapper.AdminMapper;
import com.lee.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lee
 * @since 2020-02-19
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    /**
     * 根据用户名和密码获取管理员信息
     * @param username
     * @param password
     * @return
     */
    public Admin getInfoByUsernameAndPassword(String username, String password){
       Admin admin =  adminMapper.selectOne(new QueryWrapper<Admin>().eq("username",username).eq("password",password));
        return admin;
    }

    /**
     * 根据查询条件获取管理员列表信息
     * @param queryParam
     * @return
     */
    public GenericResponse getPageInfo(Map<String, Object> queryParam) {
        IPage<Admin> page = new Page<>();
        page.setRecords(this.adminMapper.selectUserList(queryParam));
        page.setTotal(this.adminMapper.selectUserCount(queryParam));
        page.setCurrent(Long.valueOf(String.valueOf(queryParam.get("offsetIndex"))));
        page.setSize(Long.valueOf(String.valueOf(queryParam.get("limit"))));
        return ResponseFormat.retParam(200, page);
    }

    /**
     * 根据用户名查询信息，只取一条
     * @param username
     * @return
     */
    public Admin getByUsername(String username){
       return  adminMapper.selectOne(new QueryWrapper<Admin>().eq("username",username));
    }

    /**
     * 验证用户名规则
     * @param username
     * @return
     */

}
