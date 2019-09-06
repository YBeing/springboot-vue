/**
 * className:UserServiceImpl
 * author:Liuyibin
 * date: 2019/9/5
 */
package com.lying.test.service.impl;

import com.lying.test.mapper.UserMapper;
import com.lying.test.pojo.User;
import com.lying.test.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper mapper;
    public List<User> list(){
        return mapper.list();
    }
    public List<User> findByUsername(String username){
        return mapper.findByUsername(username);
    }
    public List<User> Login(String username, String password){
        return mapper.Login(username,password);
    }
    public void deleteByid(int id){
         mapper.deleteByid(id);
    }
    public void updateUserInfo(User record){
         mapper.updateUserInfo(record);
    }
    public void insert(User record){
         mapper.insert(record);
    }


}
