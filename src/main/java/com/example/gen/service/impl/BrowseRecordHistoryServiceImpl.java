package com.example.gen.service.impl;

import com.example.gen.annotation.BaseService;
import com.example.gen.base.impl.BaseServiceImpl;
import com.example.gen.service.BrowseRecordHistoryService;
import com.example.gen.mapper.BrowseRecordHistoryMapper;
import com.example.gen.entity.BrowseRecordHistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* BrowseRecordHistoryService实现
* Created by XJH on 2018/1/24.
*/
@Service
@Transactional
@BaseService
public class BrowseRecordHistoryServiceImpl extends BaseServiceImpl<BrowseRecordHistoryMapper, BrowseRecordHistory> implements BrowseRecordHistoryService {

    private final BrowseRecordHistoryMapper browseRecordHistoryMapper;

    @Autowired
    public BrowseRecordHistoryServiceImpl(BrowseRecordHistoryMapper browseRecordHistoryMapper) {
        this.browseRecordHistoryMapper = browseRecordHistoryMapper;
    }

}