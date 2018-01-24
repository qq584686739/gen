package com.example.gen.service.impl;

import com.example.gen.annotation.BaseService;
import com.example.gen.base.impl.BaseServiceImpl;
import com.example.gen.service.ShoppingCarService;
import com.example.gen.mapper.ShoppingCarMapper;
import com.example.gen.entity.ShoppingCar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* ShoppingCarService实现
* Created by XJH on 2018/1/24.
*/
@Service
@Transactional
@BaseService
public class ShoppingCarServiceImpl extends BaseServiceImpl<ShoppingCarMapper, ShoppingCar> implements ShoppingCarService {

    private final ShoppingCarMapper shoppingCarMapper;

    @Autowired
    public ShoppingCarServiceImpl(ShoppingCarMapper shoppingCarMapper) {
        this.shoppingCarMapper = shoppingCarMapper;
    }

}