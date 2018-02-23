package dev.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

@Component
public class JedisClient {

    /**
     * 添加
     * @param key
     * @param value
     * @return
     * @throws Exception
     */
    public Boolean add(String key,String value) throws Exception{
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-redis.xml");
        JedisPool pool = (JedisPool) context.getBean("jedisConnectionFactory");
        Jedis jedis = null;
        try {
            jedis = pool.getResource();
            if(jedis.exists(key)){
                throw new Exception(String.format("key (%s) 已存在 ",key));
            }
            jedis.set(key,value);

        }catch (Exception e){
            throw e;
        }
        finally {
            if(jedis!=null){
                jedis.close();
            }
        }
        pool.destroy();
        return true;
    }

    /**
     * 获取值
     * @param key
     * @return
     * @throws Exception
     */
    public String get(String key) throws Exception{
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-redis.xml");
        JedisPool pool = (JedisPool) context.getBean("jedisConnectionFactory");
        Jedis jedis = null;
        String result = "";
        try {
            jedis = pool.getResource();
            result = jedis.get(key);
        }catch (Exception e){
            throw e;
        }
        finally {
            if(jedis!=null){
                jedis.close();
            }
        }
        pool.destroy();
        return result;
    }

}
