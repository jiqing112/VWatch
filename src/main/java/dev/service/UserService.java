package dev.service;

import dev.entity.User;

import java.util.List;

public interface UserService {
    List<User> getUserList(int offset, int limit);
}
