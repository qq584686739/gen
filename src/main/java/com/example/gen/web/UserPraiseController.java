package com.example.gen.web;

import com.example.gen.entity.UserPraise;
import com.example.gen.service.UserPraiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* 控制层：UserPraiseController
* Created by XJH on 2018/1/24.
*/
@RestController
@RequestMapping("/userPraise")
public class UserPraiseController {

    private final UserPraiseService userPraiseService;

    @Autowired
    public UserPraiseController(UserPraiseService userPraiseService) {
        this.userPraiseService = userPraiseService;
    }
}