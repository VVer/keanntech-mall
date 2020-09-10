package com.keanntech.mall.admin.service;

import com.keanntech.mall.mbg.model.SysRole;

import java.text.ParseException;
import java.util.List;

public interface SysRoleService {

    List<SysRole> getAllRole();
    boolean saveRole(SysRole sysRole) throws ParseException;
    int updateRole(SysRole sysRole) throws ParseException ;

}
