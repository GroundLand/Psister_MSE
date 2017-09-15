package com.cl.mapper;

import com.cl.entity.Role;

import java.util.List;

/**
 * Created by evel on 2017/9/15.
 */
public interface RoleMapper {
    List<Role>  getRoleByRoleIds(List<Long>  idList);
}
