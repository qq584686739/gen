package com.example.gen.service.impl;

import com.example.gen.annotation.BaseService;
import com.example.gen.base.impl.BaseServiceImpl;
import com.example.gen.service.CouponUserService;
import com.example.gen.mapper.CouponUserMapper;
import com.example.gen.entity.CouponUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* CouponUserService实现
* Created by XJH on 2018/1/24.
*/
@Service
@Transactional
@BaseService
public class CouponUserServiceImpl extends BaseServiceImpl<CouponUserMapper, CouponUser> implements CouponUserService {

    private final CouponUserMapper couponUserMapper;

    @Autowired
    public CouponUserServiceImpl(CouponUserMapper couponUserMapper) {
        this.couponUserMapper = couponUserMapper;
    }

}