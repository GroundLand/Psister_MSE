package com.cl.service.impl;

import com.cl.entity.User;
import com.cl.mapper.UserMapper;
import com.cl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by evel on 2017/9/15.
 */
@Service("userService")
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;
    public void insert(User user) {
        userMapper.insert(user);
    }
}
