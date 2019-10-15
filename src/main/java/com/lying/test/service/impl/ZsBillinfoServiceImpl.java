/**
 * className:ZsBillinfoServiceImpl
 * author:Lyibing
 * date: 2019/10/14
 */
package com.lying.test.service.impl;

import com.lying.test.mapper.ZsBillinfoMapper;
import com.lying.test.pojo.ZsBillinfo;
import com.lying.test.service.ZsBillinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class ZsBillinfoServiceImpl implements ZsBillinfoService {
    @Resource
    private ZsBillinfoMapper mapper;
    @Autowired
    protected StringRedisTemplate stringRedisTemplate;
    protected RedisTemplate redisTemplate;

    @Override
    public int insert(ZsBillinfo record) {
        ValueOperations operations=redisTemplate.opsForValue();
        ListOperations opsForList=redisTemplate.opsForList();
//        opsForList.set(a);
      return   mapper.insert(record);
    }
}
