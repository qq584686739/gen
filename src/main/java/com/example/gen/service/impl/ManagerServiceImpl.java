package com.example.gen.service.impl;

import com.example.gen.annotation.BaseService;
import com.example.gen.base.impl.BaseServiceImpl;
import com.example.gen.service.ManagerService;
import com.example.gen.mapper.ManagerMapper;
import com.example.gen.entity.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* ManagerService实现
* Created by XJH on 2018/1/24.
*/
@Service
@Transactional
@BaseService
public class ManagerServiceImpl extends BaseServiceImpl<ManagerMapper, Manager> implements ManagerService {

    private final ManagerMapper managerMapper;

    @Autowired
    public ManagerServiceImpl(ManagerMapper managerMapper) {
        this.managerMapper = managerMapper;
    }

}