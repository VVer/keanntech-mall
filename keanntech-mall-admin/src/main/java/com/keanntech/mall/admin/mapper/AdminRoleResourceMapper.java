package com.keanntech.mall.admin.mapper;

import com.keanntech.mall.mbg.model.SysResource;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AdminRoleResourceMapper {

    /**
     * 获取用户所有可访问资源
     */
    List<SysResource> getResourceList(@Param("adminId") Long adminId);


}
