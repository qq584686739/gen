package com.example.gen.mapper;

import com.example.gen.entity.CouponUser;

public interface CouponUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CouponUser record);

    int insertSelective(CouponUser record);

    CouponUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CouponUser record);

    int updateByPrimaryKey(CouponUser record);
}