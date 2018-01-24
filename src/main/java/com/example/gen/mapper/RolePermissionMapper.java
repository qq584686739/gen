package com.example.gen.mapper;

import com.example.gen.entity.RolePermission;

public interface RolePermissionMapper {
    int deleteByPrimaryKey(Integer roleId);

    int insert(RolePermission record);

    int insertSelective(RolePermission record);

    RolePermission selectByPrimaryKey(Integer roleId);

    int updateByPrimaryKeySelective(RolePermission record);

    int updateByPrimaryKey(RolePermission record);
}