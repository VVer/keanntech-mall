package com.keanntech.mall.admin.service;

import com.keanntech.mall.mbg.model.SysAdmin;
import com.keanntech.mall.mbg.model.SysResource;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;

public interface SysAdminService {

    SysAdmin getAdminByUsername(String userName);

    /**
     * 获取指定用户的可访问资源
     */
    List<SysResource> getResourceList(Long adminId);

    UserDetails loadUserByUsername(String userName);

    String login(String userName, String passWord);

}
