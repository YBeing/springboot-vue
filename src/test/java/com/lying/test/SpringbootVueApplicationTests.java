package com.lying.test;

import com.alibaba.fastjson.JSON;
import com.lying.test.mapper.UserMapper;
import com.lying.test.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootVueApplicationTests {
    @SuppressWarnings("all")   //去除所有警告
    @Autowired
    UserMapper mapper;
    @Test
    public void contextLoads() {
        List<User> list = mapper.findByUsername("admin");
        String s = JSON.toJSONString(list);
        System.out.println(s);



    }

}
