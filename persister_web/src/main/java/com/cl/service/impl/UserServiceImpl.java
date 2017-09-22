package com.cl.service.impl;

import com.cl.entity.User;
import com.cl.mapper.UserMapper;
import com.cl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by evel on 2017/9/15.
 */
@Service
public class UserServiceImpl implements UserService{

    @Resource
    private UserMapper userMapper;
    public void insert(User user) {
        userMapper.insert(user);
    }
}
