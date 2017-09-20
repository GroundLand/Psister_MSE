package com.cl.controller;

import com.cl.entity.User;
import com.cl.service.UserService;
import com.cl.validate.UserSignupValidator;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;


/**
 * Created by Administrator on 2017/6/21 0021.
 */
@Controller
@RequestMapping("/")
public class LoginController {

    private UserSignupValidator signupValidator = new UserSignupValidator();

    @Autowired
    private UserService userService;

    @GetMapping("login.html")
    public String login(){
        return "login";
    }

    @PostMapping("login.html")
    public String login(User user){
        return null;
    }

    @GetMapping("signup.html")
    public String showSignupForm(Model model, @ModelAttribute User user){
        return "signup";
    }

    @PostMapping("signup.html")
    public String showSignupForm(Model model, @ModelAttribute User user, BindingResult errors){
        //校验表单
        signupValidator.validate(model,errors);

        if (errors.hasErrors()){
            return showSignupForm(model,user);
        }
        //保存用户
        userService.insert(user);

        SecurityUtils.getSubject().login(new UsernamePasswordToken(user.getName(),user.getPassword()));

        return "redirect:/mse/home";
    }
}
