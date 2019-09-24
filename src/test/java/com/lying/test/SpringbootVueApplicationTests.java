package com.lying.test;

import com.lying.test.mapper.UserMapper;
import com.lying.test.service.XtUnitService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
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
    @Test
    public void contextLoads() {
        /*List<User> list = mapper.findByUsername("admin");
        String s = JSON.toJSONString(list);
        System.out.println(s);
        String unitTree = service.getUnitTree();
        System.out.println(unitTree);*/
        stringRedisTemplate.opsForValue().set("aaa","111");


    }

}
