package dev.service.impl;

import dev.dao.UserDao;
import dev.entity.User;
import dev.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final Logger Log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserDao userDao;
    //TODO redis缓存

    public List<User> getUserList(int offset, int limit) {
        List<User> result_cache = userDao.queryAll(offset, limit);
        return result_cache;
    }
}
