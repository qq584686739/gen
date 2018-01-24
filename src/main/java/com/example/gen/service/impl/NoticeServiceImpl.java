package com.example.gen.service.impl;

import com.example.gen.annotation.BaseService;
import com.example.gen.base.impl.BaseServiceImpl;
import com.example.gen.service.NoticeService;
import com.example.gen.mapper.NoticeMapper;
import com.example.gen.entity.Notice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* NoticeService实现
* Created by XJH on 2018/1/24.
*/
@Service
@Transactional
@BaseService
public class NoticeServiceImpl extends BaseServiceImpl<NoticeMapper, Notice> implements NoticeService {

    private final NoticeMapper noticeMapper;

    @Autowired
    public NoticeServiceImpl(NoticeMapper noticeMapper) {
        this.noticeMapper = noticeMapper;
    }

}