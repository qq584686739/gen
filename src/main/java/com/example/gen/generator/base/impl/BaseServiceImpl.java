package com.example.gen.generator.base.impl;

import com.example.gen.generator.base.BaseMapper;
import com.example.gen.generator.base.BaseService;

/**
 * @ Author     ：XJH.
 * @ Date       ：Created in 13:47 2018/1/24/024.
 * @ Description：BaseServiceImpl<Record>
 * @ Modified By：
 */
public abstract class BaseServiceImpl<Record> implements BaseService<Record> {

    public abstract BaseMapper<Record> baseMapper();

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return baseMapper().deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Record record) {
        return baseMapper().insert(record);
    }

    @Override
    public int insertSelective(Record record) { return baseMapper().insertSelective(record);}

    @Override
    public Record selectByPrimaryKey(Integer id) { return baseMapper().selectByPrimaryKey(id); }

    @Override
    public int updateByPrimaryKeySelective(Record record) {
        return baseMapper().updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Record record) {
        return baseMapper().updateByPrimaryKey(record);
    }

    @Override
    public int deleteByPrimaryKeys(String ids) {
        return baseMapper().deleteByPrimaryKeys(ids);
    }
}