package com.example.gen.web;

import com.example.gen.entity.SecurityQuestion;
import com.example.gen.service.SecurityQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* 控制层：SecurityQuestionController
* Created by XJH on 2018/1/24.
*/
@RestController
@RequestMapping("/securityQuestion")
public class SecurityQuestionController {

    private final SecurityQuestionService securityQuestionService;

    @Autowired
    public SecurityQuestionController(SecurityQuestionService securityQuestionService) {
        this.securityQuestionService = securityQuestionService;
    }
}