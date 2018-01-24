package com.example.gen.service.impl;

import com.example.gen.annotation.BaseService;
import com.example.gen.base.impl.BaseServiceImpl;
import com.example.gen.service.UserPraiseService;
import com.example.gen.mapper.UserPraiseMapper;
import com.example.gen.entity.UserPraise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* UserPraiseService实现
* Created by XJH on 2018/1/24.
*/
@Service
@Transactional
@BaseService
public class UserPraiseServiceImpl extends BaseServiceImpl<UserPraiseMapper, UserPraise> implements UserPraiseService {

    private final UserPraiseMapper userPraiseMapper;

    @Autowired
    public UserPraiseServiceImpl(UserPraiseMapper userPraiseMapper) {
        this.userPraiseMapper = userPraiseMapper;
    }

}