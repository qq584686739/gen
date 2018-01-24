package com.example.gen.web;

import com.example.gen.entity.Role;
import com.example.gen.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* 控制层：RoleController
* Created by XJH on 2018/1/24.
*/
@RestController
@RequestMapping("/role")
public class RoleController {

    private final RoleService roleService;

    @Autowired
    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }
}