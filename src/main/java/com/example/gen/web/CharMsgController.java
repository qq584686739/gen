package com.example.gen.web;

import com.example.gen.entity.CharMsg;
import com.example.gen.service.CharMsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* 控制层：CharMsgController
* Created by XJH on 2018/1/24.
*/
@RestController
@RequestMapping("/charMsg")
public class CharMsgController {

    private final CharMsgService charMsgService;

    @Autowired
    public CharMsgController(CharMsgService charMsgService) {
        this.charMsgService = charMsgService;
    }
}