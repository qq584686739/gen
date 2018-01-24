package com.example.gen.service.impl;

import com.example.gen.annotation.BaseService;
import com.example.gen.base.impl.BaseServiceImpl;
import com.example.gen.service.FeedbackService;
import com.example.gen.mapper.FeedbackMapper;
import com.example.gen.entity.Feedback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* FeedbackService实现
* Created by XJH on 2018/1/24.
*/
@Service
@Transactional
@BaseService
public class FeedbackServiceImpl extends BaseServiceImpl<FeedbackMapper, Feedback> implements FeedbackService {

    private final FeedbackMapper feedbackMapper;

    @Autowired
    public FeedbackServiceImpl(FeedbackMapper feedbackMapper) {
        this.feedbackMapper = feedbackMapper;
    }

}