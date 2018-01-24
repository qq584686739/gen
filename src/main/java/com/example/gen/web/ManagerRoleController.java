package com.example.gen.web;

import com.example.gen.entity.ManagerRole;
import com.example.gen.service.ManagerRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* 控制层：ManagerRoleController
* Created by XJH on 2018/1/24.
*/
@RestController
@RequestMapping("/managerRole")
public class ManagerRoleController {

    private final ManagerRoleService managerRoleService;

    @Autowired
    public ManagerRoleController(ManagerRoleService managerRoleService) {
        this.managerRoleService = managerRoleService;
    }
}