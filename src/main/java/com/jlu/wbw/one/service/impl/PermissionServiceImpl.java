package com.jlu.wbw.one.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.jlu.wbw.one.base.result.Results;
import com.jlu.wbw.one.dao.PermissionDao;
import com.jlu.wbw.one.model.SysPermission;
import com.jlu.wbw.one.service.PermissionService;
import com.jlu.wbw.one.util.TreeUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
@Transactional
public class PermissionServiceImpl implements PermissionService {
    @Resource
    PermissionDao permissionDao;

    @Override
    public Results<JSONArray> listAllPermission() {
        log.info(getClass().getName() + ".listAllPermission()");
        List datas = permissionDao.findAll();
        JSONArray array = new JSONArray();
        log.info(getClass().getName() + ".setPermissionsTree(?,?,?)");
        TreeUtils.setPermissionsTree(0, datas, array);
        return Results.success(array);
    }

    @Override
    public Results<SysPermission> listByRoleId(Integer intValue) {
        return Results.success(0, permissionDao.listByRoleId(intValue));
    }

    @Override
    public Results<SysPermission> getMenuAll() {
        return Results.success(0,permissionDao.findAll());
    }

    @Override
    public Results<SysPermission> save(SysPermission sysPermission) {
        return null;
    }

    @Override
    public SysPermission getSysPermissionById(Integer id) {
        return null;
    }

    @Override
    public Results updateSysPermission(SysPermission sysPermission) {
        return null;
    }

    @Override
    public Results delete(Integer id) {
        return null;
    }

    @Override
    public List<SysPermission> getMenu() {
        return permissionDao.findAll();
    }


    public Results getMenu(Long userId) {
        List<SysPermission> datas = permissionDao.listByUserId(userId);
        datas = datas.stream().filter(p -> p.getType().equals(1)).collect(Collectors.toList());
        JSONArray array = new JSONArray();
        log.info(getClass().getName() + ".setPermissionsTree(?,?,?)");
        TreeUtils.setPermissionsTree(0, datas, array);
        return Results.success(array);
    }
}
