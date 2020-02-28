package com.jlu.wbw.one.service;

import com.jlu.wbw.one.base.result.Results;
import com.jlu.wbw.one.dto.UserDto;
import com.jlu.wbw.one.model.SysUser;

public interface UserService {
    SysUser getUser(String username);

    Results<SysUser> getAllUsersByPage(Integer startPosition, Integer limit);
/*

    SysUser getUserByPhone(String phone);

    SysUser getUserByEmail(String email);
*/

    Results save(SysUser user, Integer roleId);

    SysUser getUserByPhone(String telephone);

    SysUser getUserByEmail(String email);

    SysUser getUserById(Long id);



    Results updateUser(UserDto userDto, Integer roleId);

    int deleteUser(Long id);

    Results<SysUser> getUserByFuzzyUserNamePage(String username, Integer startPosition, Integer limit);

    Results changePassword(String username, String oldPassword, String newPassword);
}
