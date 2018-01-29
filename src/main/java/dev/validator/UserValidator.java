package dev.validator;

import dev.dao.UserDao;
import dev.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class UserValidator implements Validator{

    @Autowired
    UserDao userDao;

    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.equals(clazz);
    }

    @Override
    public void validate(Object obj, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors, "userName", null, "用户名为空");
        ValidationUtils.rejectIfEmpty(errors, "userPassword", null, "密码为空");

        User user = (User)obj;

        if (userDao.selectByUserName(user.getUserName()) != null){
            errors.rejectValue("userName", null, "用户已存在");
        }
    }
}
