/**
 * className:RedisOperaUtils
 * author:Lyibing
 * date: 2019/10/15
 */
package com.lying.test.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
@Service
public class RedisOperaUtils {
    @Autowired
    protected RedisTemplate redisTemplate;
    @Resource
    private JedisPool jedisPool;
    /**
     * 写入redis缓存（不设置expire存活时间）,Value 为List类型
     * @param key
     * @param value
     * @return
     */
    public void setListWithoutExpire(String key, List value){
        ListOperations listOperations = redisTemplate.opsForList();
        listOperations.leftPushAll(key,value);

    }
    /**
     * 写入redis缓存（不设置expire存活时间）,Value 为HashMap类型
     * @param key
     * @param value
     * @return
     */
    public void setMapWithoutExpire(String key, Map value){
        HashOperations hashOperations = redisTemplate.opsForHash();
        hashOperations.putAll(key,value);

    }
    /**
     * 写入redis缓存（设置expire存活时间）,Value 为List类型
     * @param key
     * @param value
     * @param expire
     * @return
     */
    public void setListWithExpire(final String key, List value, Long expire){
        ListOperations listOperations = redisTemplate.opsForList();
        listOperations.leftPushAll(key,value);
        redisTemplate.expire(key,expire,TimeUnit.SECONDS);

    }
    /**
     * 写入redis缓存（设置expire存活时间）,Value 为HashMap类型
     * @param key
     * @param value
     * @param expire
     * @return
     */
    public void setMapWithExpire(final String key, List value, Long expire){
        ListOperations listOperations = redisTemplate.opsForList();
        listOperations.leftPushAll(key,value);
        redisTemplate.expire(key,expire,TimeUnit.SECONDS);

    }
    /**
     * 读取redis缓存,Value 为Object类型
     * 如果start 为 0 end 为 -1 则返回全部的list中的value
     * @param key
     * @return
     */
    public List ReadMapWithExpire(final String key,long start,long end){
        Jedis jedis=jedisPool.getResource();
        List lrange = jedis.lrange(key, start, end);
        //用完连接需要关闭否则会报连接用尽的错误（Timeout waiting for idle object）
        jedis.close();
        return lrange;
    }
    /**
     * 根据key删除值
     * @param key
     * @return
     */
    public void deleteBykey(final String key){
        redisTemplate.delete(key);

    }



}
