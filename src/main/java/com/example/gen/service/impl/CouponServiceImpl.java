package com.example.gen.service.impl;

import com.example.gen.annotation.BaseService;
import com.example.gen.base.impl.BaseServiceImpl;
import com.example.gen.service.CouponService;
import com.example.gen.mapper.CouponMapper;
import com.example.gen.entity.Coupon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* CouponService实现
* Created by XJH on 2018/1/24.
*/
@Service
@Transactional
@BaseService
public class CouponServiceImpl extends BaseServiceImpl<CouponMapper, Coupon> implements CouponService {

    private final CouponMapper couponMapper;

    @Autowired
    public CouponServiceImpl(CouponMapper couponMapper) {
        this.couponMapper = couponMapper;
    }

}