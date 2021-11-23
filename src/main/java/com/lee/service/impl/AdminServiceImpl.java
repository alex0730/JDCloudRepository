package com.lee.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lee.entity.Admin;
import com.lee.mapper.AdminMapper;
import com.lee.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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
     * @param offset
     * @param size
     * @return
     */
    public List<Admin> getPageInfo(Map<String, Object> queryParam){
        return this.adminMapper.selectUserList(queryParam);
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
