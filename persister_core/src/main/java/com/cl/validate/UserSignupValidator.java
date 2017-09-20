package com.cl.validate;

import com.cl.entity.User;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import java.util.regex.Pattern;

/**
 * Created by evel on 2017/9/18.
 */
public class UserSignupValidator implements Validator {

    private static final String SIMPLE_EMAIL_REGEX = "[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}";

    public boolean supports(Class<?> aClass) {
        return User.class.isAssignableFrom(aClass);
    }

    public void validate(Object o, Errors errors) {
        User user = (User) o;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "error.username.empty", "请输入用户名");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "error.email.empty", "请输入邮箱地址");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "error.password.empty", "请输入密码");
        if (StringUtils.hasText(user.getEmail()) && !Pattern.matches(SIMPLE_EMAIL_REGEX, user.getEmail().toUpperCase())) {
            errors.rejectValue("email", "error.email.invalid", "" + "请输入正确的邮箱格式");
        }
    }
}
