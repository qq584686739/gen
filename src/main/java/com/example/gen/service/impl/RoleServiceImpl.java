package com.example.gen.service.impl;

import com.example.gen.annotation.BaseService;
import com.example.gen.base.impl.BaseServiceImpl;
import com.example.gen.service.RoleService;
import com.example.gen.mapper.RoleMapper;
import com.example.gen.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* RoleService实现
* Created by XJH on 2018/1/24.
*/
@Service
@Transactional
@BaseService
public class RoleServiceImpl extends BaseServiceImpl<RoleMapper, Role> implements RoleService {

    private final RoleMapper roleMapper;

    @Autowired
    public RoleServiceImpl(RoleMapper roleMapper) {
        this.roleMapper = roleMapper;
    }

}