package com.example.gen.base;

/**
 * @ Author     ：XJH.
 * @ Date       ：Created in 13:44 2018/1/24/024.
 * @ Description：
 * @ Modified By：
 */
public interface BaseService<Record> {
    int deleteByPrimaryKey(Integer id);

    int insert(Record record);

    int insertSelective(Record record);

    Record selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Record record);

    int updateByPrimaryKey(Record record);

    int deleteByPrimaryKeys(String ids);

    void initMapper();
}
