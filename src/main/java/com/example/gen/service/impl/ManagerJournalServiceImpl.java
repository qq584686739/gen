package com.example.gen.service.impl;

import com.example.gen.annotation.BaseService;
import com.example.gen.base.impl.BaseServiceImpl;
import com.example.gen.service.ManagerJournalService;
import com.example.gen.mapper.ManagerJournalMapper;
import com.example.gen.entity.ManagerJournal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* ManagerJournalService实现
* Created by XJH on 2018/1/24.
*/
@Service
@Transactional
@BaseService
public class ManagerJournalServiceImpl extends BaseServiceImpl<ManagerJournalMapper, ManagerJournal> implements ManagerJournalService {

    private final ManagerJournalMapper managerJournalMapper;

    @Autowired
    public ManagerJournalServiceImpl(ManagerJournalMapper managerJournalMapper) {
        this.managerJournalMapper = managerJournalMapper;
    }

}