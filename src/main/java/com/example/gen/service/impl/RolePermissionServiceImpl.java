package com.example.gen.service.impl;

import com.example.gen.annotation.BaseService;
import com.example.gen.base.impl.BaseServiceImpl;
import com.example.gen.service.RolePermissionService;
import com.example.gen.mapper.RolePermissionMapper;
import com.example.gen.entity.RolePermission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* RolePermissionService实现
* Created by XJH on 2018/1/24.
*/
@Service
@Transactional
@BaseService
public class RolePermissionServiceImpl extends BaseServiceImpl<RolePermissionMapper, RolePermission> implements RolePermissionService {

    private final RolePermissionMapper rolePermissionMapper;

    @Autowired
    public RolePermissionServiceImpl(RolePermissionMapper rolePermissionMapper) {
        this.rolePermissionMapper = rolePermissionMapper;
    }

}