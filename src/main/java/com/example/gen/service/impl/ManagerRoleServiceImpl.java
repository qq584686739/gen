package com.example.gen.service.impl;

import com.example.gen.annotation.BaseService;
import com.example.gen.base.impl.BaseServiceImpl;
import com.example.gen.service.ManagerRoleService;
import com.example.gen.mapper.ManagerRoleMapper;
import com.example.gen.entity.ManagerRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* ManagerRoleService实现
* Created by XJH on 2018/1/24.
*/
@Service
@Transactional
@BaseService
public class ManagerRoleServiceImpl extends BaseServiceImpl<ManagerRoleMapper, ManagerRole> implements ManagerRoleService {

    private final ManagerRoleMapper managerRoleMapper;

    @Autowired
    public ManagerRoleServiceImpl(ManagerRoleMapper managerRoleMapper) {
        this.managerRoleMapper = managerRoleMapper;
    }

}