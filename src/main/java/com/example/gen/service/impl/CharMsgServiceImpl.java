package com.example.gen.service.impl;

import com.example.gen.annotation.BaseService;
import com.example.gen.base.impl.BaseServiceImpl;
import com.example.gen.service.CharMsgService;
import com.example.gen.mapper.CharMsgMapper;
import com.example.gen.entity.CharMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* CharMsgService实现
* Created by XJH on 2018/1/24.
*/
@Service
@Transactional
@BaseService
public class CharMsgServiceImpl extends BaseServiceImpl<CharMsgMapper, CharMsg> implements CharMsgService {

    private final CharMsgMapper charMsgMapper;

    @Autowired
    public CharMsgServiceImpl(CharMsgMapper charMsgMapper) {
        this.charMsgMapper = charMsgMapper;
    }

}