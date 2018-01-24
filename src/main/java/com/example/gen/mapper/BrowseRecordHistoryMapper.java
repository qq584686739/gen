package com.example.gen.mapper;

import com.example.gen.entity.BrowseRecordHistory;

public interface BrowseRecordHistoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BrowseRecordHistory record);

    int insertSelective(BrowseRecordHistory record);

    BrowseRecordHistory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BrowseRecordHistory record);

    int updateByPrimaryKey(BrowseRecordHistory record);
}