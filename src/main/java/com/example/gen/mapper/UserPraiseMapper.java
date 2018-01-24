package com.example.gen.mapper;

import com.example.gen.entity.UserPraise;

public interface UserPraiseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserPraise record);

    int insertSelective(UserPraise record);

    UserPraise selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserPraise record);

    int updateByPrimaryKey(UserPraise record);
}