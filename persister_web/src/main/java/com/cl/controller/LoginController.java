package com.cl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/6/21 0021.
 */
@Controller
@RequestMapping("/")
public class LoginController {

    @RequestMapping("login")
    public String login(){
        return "login";
    }
}
