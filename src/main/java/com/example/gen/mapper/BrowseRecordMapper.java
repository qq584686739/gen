package com.example.gen.mapper;

import com.example.gen.entity.BrowseRecord;

public interface BrowseRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BrowseRecord record);

    int insertSelective(BrowseRecord record);

    BrowseRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BrowseRecord record);

    int updateByPrimaryKey(BrowseRecord record);
}