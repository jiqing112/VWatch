package dev.dao;

import dev.cache.JedisClient;
import dev.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/spring/spring-redis.xml")
public class RedisTest {
    @Autowired
    JedisClient jedisClient;

    @Test
    public void testGetUserByName(){
        User user = new User();
        user.setUserName("用户1");
        jedisClient.put("user1", user);

        Assert.assertEquals(user.getUserName(), ((User) jedisClient.get("user1")).getUserName());
    }
}
