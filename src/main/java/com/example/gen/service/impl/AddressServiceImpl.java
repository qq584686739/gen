package com.example.gen.service.impl;

import com.example.gen.annotation.BaseService;
import com.example.gen.base.impl.BaseServiceImpl;
import com.example.gen.service.AddressService;
import com.example.gen.mapper.AddressMapper;
import com.example.gen.entity.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* AddressService实现
* Created by XJH on 2018/1/24.
*/
@Service
@Transactional
@BaseService
public class AddressServiceImpl extends BaseServiceImpl<AddressMapper, Address> implements AddressService {

    private final AddressMapper addressMapper;

    @Autowired
    public AddressServiceImpl(AddressMapper addressMapper) {
        this.addressMapper = addressMapper;
    }

}