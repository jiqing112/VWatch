package dev.dao;

import dev.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
    /**
     *根据手机号查询用户对象
     *
     * @param userPhone
     * @return User
     */
    User queryByPhone(long userPhone);

    /**
     * 根据偏移量查询用户列表
     *
     * @param offset
     * @param limit
     * @return List<User>
     */
    List<User> queryAll(@Param("offset") int offset, @Param("limit") int limit);

    /**
     *增加积分
     * @param add
     */
    void addScore(@Param("add")int add);
}
