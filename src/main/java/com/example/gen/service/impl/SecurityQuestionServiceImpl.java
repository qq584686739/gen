package com.example.gen.service.impl;

import com.example.gen.annotation.BaseService;
import com.example.gen.base.impl.BaseServiceImpl;
import com.example.gen.service.SecurityQuestionService;
import com.example.gen.mapper.SecurityQuestionMapper;
import com.example.gen.entity.SecurityQuestion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* SecurityQuestionService实现
* Created by XJH on 2018/1/24.
*/
@Service
@Transactional
@BaseService
public class SecurityQuestionServiceImpl extends BaseServiceImpl<SecurityQuestionMapper, SecurityQuestion> implements SecurityQuestionService {

    private final SecurityQuestionMapper securityQuestionMapper;

    @Autowired
    public SecurityQuestionServiceImpl(SecurityQuestionMapper securityQuestionMapper) {
        this.securityQuestionMapper = securityQuestionMapper;
    }

}