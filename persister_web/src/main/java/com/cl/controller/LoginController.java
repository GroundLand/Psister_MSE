package com.cl.controller;

import com.cl.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



/**
 * Created by Administrator on 2017/6/21 0021.
 */
@Controller
@RequestMapping("/")
public class LoginController {

    @RequestMapping("login.html")
    public String login(){
        return "login";
    }

    @RequestMapping("login")
    public String validateLogin(User user){
        return null;
    }
}
