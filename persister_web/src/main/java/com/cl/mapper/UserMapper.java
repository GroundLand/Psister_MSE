package com.cl.mapper;


import com.cl.entity.User;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Service;

/**
 * Created by evel on 2017/9/15.
 */
@Service
public interface UserMapper {
    User findUserByUserName(String username);
    User findUserByUserId(long id);
    User insert(User user);
}
