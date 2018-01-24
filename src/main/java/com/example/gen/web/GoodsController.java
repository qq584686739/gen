package com.example.gen.web;

import com.example.gen.entity.Goods;
import com.example.gen.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* 控制层：GoodsController
* Created by XJH on 2018/1/24.
*/
@RestController
@RequestMapping("/goods")
public class GoodsController {

    private final GoodsService goodsService;

    @Autowired
    public GoodsController(GoodsService goodsService) {
        this.goodsService = goodsService;
    }
}