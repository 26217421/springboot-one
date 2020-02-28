package com.jlu.wbw.one.service.impl;

import com.jlu.wbw.one.base.result.Results;
import com.jlu.wbw.one.dao.RoleUserDao;
import com.jlu.wbw.one.model.SysRoleUser;
import com.jlu.wbw.one.service.RoleUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Transactional
@Service
public class RoleUserServiceImpl implements RoleUserService {
    @Resource
    private RoleUserDao roleUserDao;

    @Override
    public Results getSysRoleUserByUserId(Integer userId) {
        SysRoleUser sysRoleUser =  roleUserDao.getSysRoleUserByUserId(userId) ;
        if(sysRoleUser != null){
            return Results.success(sysRoleUser);
        }else {
            return Results.success();
        }
    }
}
