package com.example.gen.service.impl;

import com.example.gen.annotation.BaseService;
import com.example.gen.base.impl.BaseServiceImpl;
import com.example.gen.service.UserCollectionService;
import com.example.gen.mapper.UserCollectionMapper;
import com.example.gen.entity.UserCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* UserCollectionService实现
* Created by XJH on 2018/1/24.
*/
@Service
@Transactional
@BaseService
public class UserCollectionServiceImpl extends BaseServiceImpl<UserCollectionMapper, UserCollection> implements UserCollectionService {

    private final UserCollectionMapper userCollectionMapper;

    @Autowired
    public UserCollectionServiceImpl(UserCollectionMapper userCollectionMapper) {
        this.userCollectionMapper = userCollectionMapper;
    }

}