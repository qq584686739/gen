package com.example.gen.mapper;

import com.example.gen.entity.ManagerJournal;

public interface ManagerJournalMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ManagerJournal record);

    int insertSelective(ManagerJournal record);

    ManagerJournal selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ManagerJournal record);

    int updateByPrimaryKey(ManagerJournal record);
}