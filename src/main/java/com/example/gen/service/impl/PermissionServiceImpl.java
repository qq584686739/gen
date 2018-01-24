package com.example.gen.service.impl;

import com.example.gen.annotation.BaseService;
import com.example.gen.base.impl.BaseServiceImpl;
import com.example.gen.service.PermissionService;
import com.example.gen.mapper.PermissionMapper;
import com.example.gen.entity.Permission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* PermissionService实现
* Created by XJH on 2018/1/24.
*/
@Service
@Transactional
@BaseService
public class PermissionServiceImpl extends BaseServiceImpl<PermissionMapper, Permission> implements PermissionService {

    private final PermissionMapper permissionMapper;

    @Autowired
    public PermissionServiceImpl(PermissionMapper permissionMapper) {
        this.permissionMapper = permissionMapper;
    }

}