package com.example.gen.web;

import com.example.gen.entity.ShoppingCar;
import com.example.gen.service.ShoppingCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* 控制层：ShoppingCarController
* Created by XJH on 2018/1/24.
*/
@RestController
@RequestMapping("/shoppingCar")
public class ShoppingCarController {

    private final ShoppingCarService shoppingCarService;

    @Autowired
    public ShoppingCarController(ShoppingCarService shoppingCarService) {
        this.shoppingCarService = shoppingCarService;
    }
}