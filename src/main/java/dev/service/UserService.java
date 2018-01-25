package dev.service;

import dev.entity.User;


public interface UserService {
    Boolean signUp(User user);
    Boolean checkUserNameIsExist(String userName);
    Boolean checkUserEmailIsExist(String userEmail);

    Boolean signIn(User user);
}
