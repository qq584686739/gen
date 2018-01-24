package com.example.gen.service.impl;

import com.example.gen.annotation.BaseService;
import com.example.gen.base.impl.BaseServiceImpl;
import com.example.gen.service.OrderService;
import com.example.gen.mapper.OrderMapper;
import com.example.gen.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* OrderService实现
* Created by XJH on 2018/1/24.
*/
@Service
@Transactional
@BaseService
public class OrderServiceImpl extends BaseServiceImpl<OrderMapper, Order> implements OrderService {

    private final OrderMapper orderMapper;

    @Autowired
    public OrderServiceImpl(OrderMapper orderMapper) {
        this.orderMapper = orderMapper;
    }

}