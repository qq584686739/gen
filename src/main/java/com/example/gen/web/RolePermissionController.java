package com.example.gen.web;

import com.example.gen.entity.RolePermission;
import com.example.gen.service.RolePermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* 控制层：RolePermissionController
* Created by XJH on 2018/1/24.
*/
@RestController
@RequestMapping("/rolePermission")
public class RolePermissionController {

    private final RolePermissionService rolePermissionService;

    @Autowired
    public RolePermissionController(RolePermissionService rolePermissionService) {
        this.rolePermissionService = rolePermissionService;
    }
}