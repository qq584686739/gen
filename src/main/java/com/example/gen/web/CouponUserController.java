package com.example.gen.web;

import com.example.gen.entity.CouponUser;
import com.example.gen.service.CouponUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* 控制层：CouponUserController
* Created by XJH on 2018/1/24.
*/
@RestController
@RequestMapping("/couponUser")
public class CouponUserController {

    private final CouponUserService couponUserService;

    @Autowired
    public CouponUserController(CouponUserService couponUserService) {
        this.couponUserService = couponUserService;
    }
}