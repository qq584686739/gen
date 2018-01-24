package com.example.gen.web;

import com.example.gen.entity.UserJournal;
import com.example.gen.service.UserJournalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* 控制层：UserJournalController
* Created by XJH on 2018/1/24.
*/
@RestController
@RequestMapping("/userJournal")
public class UserJournalController {

    private final UserJournalService userJournalService;

    @Autowired
    public UserJournalController(UserJournalService userJournalService) {
        this.userJournalService = userJournalService;
    }
}