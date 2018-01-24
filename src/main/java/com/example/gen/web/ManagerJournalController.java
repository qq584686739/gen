package com.example.gen.web;

import com.example.gen.entity.ManagerJournal;
import com.example.gen.service.ManagerJournalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* 控制层：ManagerJournalController
* Created by XJH on 2018/1/24.
*/
@RestController
@RequestMapping("/managerJournal")
public class ManagerJournalController {

    private final ManagerJournalService managerJournalService;

    @Autowired
    public ManagerJournalController(ManagerJournalService managerJournalService) {
        this.managerJournalService = managerJournalService;
    }
}