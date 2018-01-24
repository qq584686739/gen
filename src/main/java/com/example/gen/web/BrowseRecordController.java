package com.example.gen.web;

import com.example.gen.entity.BrowseRecord;
import com.example.gen.service.BrowseRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* 控制层：BrowseRecordController
* Created by XJH on 2018/1/24.
*/
@RestController
@RequestMapping("/browseRecord")
public class BrowseRecordController {

    private final BrowseRecordService browseRecordService;

    @Autowired
    public BrowseRecordController(BrowseRecordService browseRecordService) {
        this.browseRecordService = browseRecordService;
    }
}