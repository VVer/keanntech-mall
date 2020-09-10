package com.keanntech.mall.admin.util;

import com.keanntech.mall.admin.dto.SysAdminUserDetails;
import com.keanntech.mall.admin.service.SysAdminService;
import com.keanntech.mall.common.exception.UserNotLoginException;
import com.keanntech.mall.common.until.SpringBeanUtil;
import com.keanntech.mall.mbg.model.SysAdmin;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

public class AdminUtil {

    public static SysAdminUserDetails getAuthentication() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if(authentication instanceof AnonymousAuthenticationToken) {
            return null;
        }
        if(authentication instanceof UsernamePasswordAuthenticationToken) {
            return (SysAdminUserDetails) authentication.getPrincipal();
        }
        return null;
    }

    public static SysAdmin getCurrentAdmin() {
        SysAdminUserDetails userDetails = getAuthentication();
        if(userDetails == null) {
            throw new UserNotLoginException("用户未登录");
        }
        SysAdminService sysAdminService = (SysAdminService) SpringBeanUtil.getBean("sysAdminService");
        return sysAdminService.getAdminByUsername(userDetails.getUsername());
    }

}
