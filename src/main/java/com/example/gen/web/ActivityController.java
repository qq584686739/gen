package com.example.gen.web;

import com.example.gen.entity.Activity;
import com.example.gen.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* 控制层：ActivityController
* Created by XJH on 2018/1/24.
*/
@RestController
@RequestMapping("/activity")
public class ActivityController {

    private final ActivityService activityService;

    @Autowired
    public ActivityController(ActivityService activityService) {
        this.activityService = activityService;
    }
}