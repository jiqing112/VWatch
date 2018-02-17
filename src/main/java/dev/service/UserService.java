package dev.service;

import dev.dto.LoginResult;
import dev.dto.RegisterResult;
import dev.entity.User;


public interface UserService {
    RegisterResult register(User user);

    Boolean checkUserNameIsExist(String userName);
    Boolean checkUserEmailIsExist(String userEmail);

    LoginResult login (User user);
}
