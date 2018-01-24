package com.example.gen.web;

import com.example.gen.entity.UserCollection;
import com.example.gen.service.UserCollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* 控制层：UserCollectionController
* Created by XJH on 2018/1/24.
*/
@RestController
@RequestMapping("/userCollection")
public class UserCollectionController {

    private final UserCollectionService userCollectionService;

    @Autowired
    public UserCollectionController(UserCollectionService userCollectionService) {
        this.userCollectionService = userCollectionService;
    }
}