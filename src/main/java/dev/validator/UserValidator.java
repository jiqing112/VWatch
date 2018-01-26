package dev.validator;

import dev.entity.User;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class UserValidator implements Validator{


    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.equals(clazz);
    }

    @Override
    public void validate(Object obj, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors, "userName", null, "用户名为空");
        User user = (User)obj;
        if (null == user.getUserPassword() || "".equals(user.getUserPassword()))
            errors.rejectValue("userPassword", null, "密码为空");
    }
}
