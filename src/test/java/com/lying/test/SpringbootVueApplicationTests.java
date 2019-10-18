package com.lying.test;

import com.lying.test.mapper.UserMapper;
import com.lying.test.rabbitMq.HelloRabbitProvider;
import com.lying.test.service.XtUnitService;
import com.lying.test.utils.RedisOperaUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootVueApplicationTests {
    @SuppressWarnings("all")   //去除所有警告
    @Autowired
    UserMapper mapper;
    @Autowired
    XtUnitService service;
    @Autowired
    StringRedisTemplate stringRedisTemplate;
    @Autowired
    RedisTemplate redisTemplate;
    @Autowired
    private RedisOperaUtils redisOperaUtils;
    @Autowired
    private HelloRabbitProvider helloRabbitProvider;
    @Test
    public void testSend() {
        for (int i = 0; i < 10; i++) {
            helloRabbitProvider.send();
        }

    }

}
