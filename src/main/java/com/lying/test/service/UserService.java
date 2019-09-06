/**
 * className:UserService
 * author:Liuyibin
 * date: 2019/9/5
 */
package com.lying.test.service;

import com.lying.test.pojo.User;

import java.util.List;

public interface UserService {
    public List<User> list();
    public List<User> findByUsername(String username);
    public List<User> Login(String username, String password);
    public void deleteByid(int id);
    public void updateUserInfo(User record);
    public void insert(User record);


}
