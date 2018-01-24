package com.example.gen.mapper;

import com.example.gen.entity.ManagerRole;
import org.apache.ibatis.annotations.Param;

public interface ManagerRoleMapper {
    int deleteByPrimaryKey(@Param("managerId") Integer managerId, @Param("roleId") Integer roleId);

    int insert(ManagerRole record);

    int insertSelective(ManagerRole record);

    ManagerRole selectByPrimaryKey(@Param("managerId") Integer managerId, @Param("roleId") Integer roleId);

    int updateByPrimaryKeySelective(ManagerRole record);

    int updateByPrimaryKey(ManagerRole record);
}