package com.example.gen.web;

import com.example.gen.entity.BrowseRecordHistory;
import com.example.gen.service.BrowseRecordHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* 控制层：BrowseRecordHistoryController
* Created by XJH on 2018/1/24.
*/
@RestController
@RequestMapping("/browseRecordHistory")
public class BrowseRecordHistoryController {

    private final BrowseRecordHistoryService browseRecordHistoryService;

    @Autowired
    public BrowseRecordHistoryController(BrowseRecordHistoryService browseRecordHistoryService) {
        this.browseRecordHistoryService = browseRecordHistoryService;
    }
}