package com.jlu.wbw.one.service;

import com.alibaba.fastjson.JSONArray;
import com.jlu.wbw.one.base.result.Results;
import com.jlu.wbw.one.model.SysPermission;

import java.util.List;

public interface PermissionService {
    Results<JSONArray> listAllPermission();

    Results<SysPermission> listByRoleId(Integer intValue);

    Results<SysPermission> getMenuAll();

    Results<SysPermission> save(SysPermission sysPermission);

    SysPermission getSysPermissionById(Integer id);

    Results  updateSysPermission(SysPermission sysPermission);

    Results delete(Integer id);

    List<SysPermission> getMenu();

    Results<SysPermission> getMenu(Long userId);
}
