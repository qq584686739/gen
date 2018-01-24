package com.example.gen.base.impl;


import com.example.gen.base.BaseService;
import com.example.gen.utils.SpringContextUtil;
import org.apache.commons.lang.StringUtils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;

/**
 * @ Author     ：XJH.
 * @ Date       ：Created in 13:47 2018/1/24/024.
 * @ Description：
 * @ Modified By：
 */
public abstract class BaseServiceImpl<Mapper, Record> implements BaseService<Record> {

    public Mapper mapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        try {
            initMapper();
            Method deleteByPrimaryKey = mapper.getClass().getDeclaredMethod("deleteByPrimaryKey", id.getClass());
            Object result = deleteByPrimaryKey.invoke(mapper, id);
            return Integer.parseInt(String.valueOf(result));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int insert(Record record) {
        try {
            initMapper();
            Method insert = mapper.getClass().getDeclaredMethod("insert", record.getClass());
            Object result = insert.invoke(mapper, record);
            return Integer.parseInt(String.valueOf(result));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int insertSelective(Record record) {
        try {
            initMapper();
            Method insertSelective = mapper.getClass().getDeclaredMethod("insertSelective", record.getClass());
            Object result = insertSelective.invoke(mapper, record);
            return Integer.parseInt(String.valueOf(result));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return 0;
    }




    @Override
    public Record selectByPrimaryKey(Integer id) {
        try {
            initMapper();
            Method selectByPrimaryKey = mapper.getClass().getDeclaredMethod("selectByPrimaryKey", id.getClass());
            Object result = selectByPrimaryKey.invoke(mapper, id);
            return (Record) result;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return null;
    }


    @Override
    public int updateByPrimaryKeySelective(Record record) {
        try {
            initMapper();
            Method updateByPrimaryKeySelective = mapper.getClass().getDeclaredMethod("updateByPrimaryKeySelective", record.getClass());
            Object result = updateByPrimaryKeySelective.invoke(mapper, record);
            return Integer.parseInt(String.valueOf(result));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return 0;
    }


    @Override
    public int updateByPrimaryKey(Record record) {
        try {
            initMapper();
            Method updateByPrimaryKey = mapper.getClass().getDeclaredMethod("updateByPrimaryKey", record.getClass());
            Object result = updateByPrimaryKey.invoke(mapper, record);
            return Integer.parseInt(String.valueOf(result));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int deleteByPrimaryKeys(String ids) {
        initMapper();
        try {
            if (StringUtils.isBlank(ids)) {
                return 0;
            }
            String[] idArray = ids.split("-");
            int count = 0;
            for (String idStr : idArray) {
                if (StringUtils.isBlank(idStr)) {
                    continue;
                }
                Integer id = Integer.parseInt(idStr);
                Method deleteByPrimaryKey = mapper.getClass().getDeclaredMethod("deleteByPrimaryKey", id.getClass());
                Object result = deleteByPrimaryKey.invoke(mapper, id);
                count += Integer.parseInt(String.valueOf(result));
            }
            return count;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public void initMapper() {
        this.mapper = SpringContextUtil.getBean(getMapperClass());
    }

    /**
     * 获取类泛型class
     * @return
     */
    public Class<Mapper> getMapperClass() {
        return (Class<Mapper>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

}