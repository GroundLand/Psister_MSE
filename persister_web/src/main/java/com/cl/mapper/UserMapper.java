package com.cl.mapper;


import com.cl.entity.User;

/**
 * Created by evel on 2017/9/15.
 */

public interface UserMapper {
    User findUserByUserName(String username);
    User findUserByUserId(long id);
}
