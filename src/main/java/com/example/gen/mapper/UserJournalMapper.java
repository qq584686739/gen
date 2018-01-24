package com.example.gen.mapper;

import com.example.gen.entity.UserJournal;

public interface UserJournalMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserJournal record);

    int insertSelective(UserJournal record);

    UserJournal selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserJournal record);

    int updateByPrimaryKey(UserJournal record);
}