package com.example.gen.mapper;

import com.example.gen.entity.SecurityQuestion;

public interface SecurityQuestionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SecurityQuestion record);

    int insertSelective(SecurityQuestion record);

    SecurityQuestion selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SecurityQuestion record);

    int updateByPrimaryKey(SecurityQuestion record);
}