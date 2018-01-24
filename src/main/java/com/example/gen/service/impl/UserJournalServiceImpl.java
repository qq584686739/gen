package com.example.gen.service.impl;

import com.example.gen.annotation.BaseService;
import com.example.gen.base.impl.BaseServiceImpl;
import com.example.gen.service.UserJournalService;
import com.example.gen.mapper.UserJournalMapper;
import com.example.gen.entity.UserJournal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* UserJournalService实现
* Created by XJH on 2018/1/24.
*/
@Service
@Transactional
@BaseService
public class UserJournalServiceImpl extends BaseServiceImpl<UserJournalMapper, UserJournal> implements UserJournalService {

    private final UserJournalMapper userJournalMapper;

    @Autowired
    public UserJournalServiceImpl(UserJournalMapper userJournalMapper) {
        this.userJournalMapper = userJournalMapper;
    }

}