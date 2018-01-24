package com.example.gen.service.impl;

import com.example.gen.annotation.BaseService;
import com.example.gen.base.impl.BaseServiceImpl;
import com.example.gen.service.ActivityService;
import com.example.gen.mapper.ActivityMapper;
import com.example.gen.entity.Activity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* ActivityService实现
* Created by XJH on 2018/1/24.
*/
@Service
@Transactional
@BaseService
public class ActivityServiceImpl extends BaseServiceImpl<ActivityMapper, Activity> implements ActivityService {

    private final ActivityMapper activityMapper;

    @Autowired
    public ActivityServiceImpl(ActivityMapper activityMapper) {
        this.activityMapper = activityMapper;
    }

}