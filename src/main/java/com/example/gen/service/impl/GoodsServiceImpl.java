package com.example.gen.service.impl;

import com.example.gen.annotation.BaseService;
import com.example.gen.base.impl.BaseServiceImpl;
import com.example.gen.service.GoodsService;
import com.example.gen.mapper.GoodsMapper;
import com.example.gen.entity.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* GoodsService实现
* Created by XJH on 2018/1/24.
*/
@Service
@Transactional
@BaseService
public class GoodsServiceImpl extends BaseServiceImpl<GoodsMapper, Goods> implements GoodsService {

    private final GoodsMapper goodsMapper;

    @Autowired
    public GoodsServiceImpl(GoodsMapper goodsMapper) {
        this.goodsMapper = goodsMapper;
    }

}