package com.example.gen.web;

import com.example.gen.entity.Notice;
import com.example.gen.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* 控制层：NoticeController
* Created by XJH on 2018/1/24.
*/
@RestController
@RequestMapping("/notice")
public class NoticeController {

    private final NoticeService noticeService;

    @Autowired
    public NoticeController(NoticeService noticeService) {
        this.noticeService = noticeService;
    }
}