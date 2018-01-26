package com.example.gen.generator.base;

/**
 * @ Author     ：XJH.
 * @ Date       ：Created in 9:02 2018/1/25/025.
 * @ Description：BaseMapper<Record>
 * @ Modified By：
 */
public interface BaseMapper<Record> {
    int deleteByPrimaryKey(Integer id);

    int insert(Record record);

    int insertSelective(Record record);

    Record selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Record record);

    int updateByPrimaryKey(Record record);

    int deleteByPrimaryKeys(String ids);

}
