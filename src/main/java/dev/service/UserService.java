package dev.service;

import dev.dto.LoginResult;
import dev.dto.RegisterResult;
import dev.entity.User;

import java.util.List;


public interface UserService {
    RegisterResult register(User user);

    Boolean checkUserNameIsExist(String userName);
    Boolean checkUserEmailIsExist(String userEmail);

    LoginResult login (User user);

    User getUserById (long userId);
    User getUserByName(String userName);
}
