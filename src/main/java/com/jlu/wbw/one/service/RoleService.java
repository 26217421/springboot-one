package com.jlu.wbw.one.service;

import com.jlu.wbw.one.base.result.Results;
import com.jlu.wbw.one.dto.RoleDto;
import com.jlu.wbw.one.model.SysRole;

public interface RoleService {
    Results<SysRole> getAllRoles();

    Results<SysRole> getAllRolesByPage(Integer offset, Integer limit);

    Results<SysRole> save(RoleDto roleDto);

    SysRole getRoleById(Integer id);


    Results update(RoleDto roleDto);


    Results delete(Integer id);

    Results<SysRole> getRoleByFuzzyRoleNamePage(String roleName, Integer offset, Integer limit);
}
