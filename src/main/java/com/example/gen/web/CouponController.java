package com.example.gen.web;

import com.example.gen.entity.Coupon;
import com.example.gen.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* 控制层：CouponController
* Created by XJH on 2018/1/24.
*/
@RestController
@RequestMapping("/coupon")
public class CouponController {

    private final CouponService couponService;

    @Autowired
    public CouponController(CouponService couponService) {
        this.couponService = couponService;
    }
}