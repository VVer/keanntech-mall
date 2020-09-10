package com.keanntech.mall.admin.service.impl;

import com.keanntech.mall.admin.service.SysResourceService;
import com.keanntech.mall.mbg.mapper.SysResourceMapper;
import com.keanntech.mall.mbg.model.SysResource;
import com.keanntech.mall.mbg.model.SysResourceExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("sysResourceService")
public class SysResourceServiceImpl implements SysResourceService {

    @Autowired
    SysResourceMapper sysResourceMapper;

    @Override
    public List<SysResource> listAll() {
        return sysResourceMapper.selectByExample(new SysResourceExample());
    }
}
