package dev.dao;

import dev.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {

    /**
     *注册
     */
    int register(User user);

    /**
     *更新信息
     */
    int updateInfoById(User user);

    /**
     *选择用户
     */
    User selectById(long userId);
    User selectByUserName(String userName);
    User selectByUserEmail(String userEmail);

}
