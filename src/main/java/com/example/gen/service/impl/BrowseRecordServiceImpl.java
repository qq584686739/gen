package com.example.gen.service.impl;

import com.example.gen.annotation.BaseService;
import com.example.gen.base.impl.BaseServiceImpl;
import com.example.gen.service.BrowseRecordService;
import com.example.gen.mapper.BrowseRecordMapper;
import com.example.gen.entity.BrowseRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* BrowseRecordService实现
* Created by XJH on 2018/1/24.
*/
@Service
@Transactional
@BaseService
public class BrowseRecordServiceImpl extends BaseServiceImpl<BrowseRecordMapper, BrowseRecord> implements BrowseRecordService {

    private final BrowseRecordMapper browseRecordMapper;

    @Autowired
    public BrowseRecordServiceImpl(BrowseRecordMapper browseRecordMapper) {
        this.browseRecordMapper = browseRecordMapper;
    }

}