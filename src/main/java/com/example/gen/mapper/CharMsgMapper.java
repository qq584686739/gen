package com.example.gen.mapper;

import com.example.gen.entity.CharMsg;

public interface CharMsgMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CharMsg record);

    int insertSelective(CharMsg record);

    CharMsg selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CharMsg record);

    int updateByPrimaryKey(CharMsg record);
}