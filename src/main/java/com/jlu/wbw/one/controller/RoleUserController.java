package com.jlu.wbw.one.controller;


import com.jlu.wbw.one.base.result.ResponseCode;
import com.jlu.wbw.one.base.result.Results;
import com.jlu.wbw.one.dto.UserDto;
import com.jlu.wbw.one.model.SysUser;
import com.jlu.wbw.one.service.RoleUserService;
import com.jlu.wbw.one.util.MD5;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("roleuser")
@Slf4j
public class RoleUserController {
    @Resource
    RoleUserService roleUserService;

    @PostMapping("/getRoleUserByUserId")
    @ResponseBody
    @ApiOperation(value = "获取当前用户角色", notes = "获取当前用户角色")//描述
    @ApiImplicitParam(name = "userId",value = "用户Id", required = true)
    public Results getRoleUserByUserId(Integer userId) {
        log.info("RoleUserController.getRoleUserByUserId: param= " + userId);
        return roleUserService.getSysRoleUserByUserId(userId);
    }
}
