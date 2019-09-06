/**
 * className:UserController
 * author:Liuyibin
 * date: 2019/8/29
 */
package com.lying.test.controller;

import com.lying.test.mapper.UserMapper;
import com.lying.test.pojo.User;
import com.lying.test.service.UserService;
import com.lying.test.utils.JsonUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    @Resource
    UserMapper mapper;
    @Resource
    UserService service;
    /**
     * 获取所有用户信息列表
     * @param
     * @return java.util.List<com.lying.test.pojo.User>
     */
    @RequestMapping("/getUserList")
    @ResponseBody
    public List<User> index() {

        return service.list();
    }
    /**
     * 登陆
     * @param username
     * @param password
     * @return java.lang.String
     */
    @RequestMapping("/login")
    @ResponseBody
    public String login(String username,String password) {

        List<User> list=service.Login(username,password);
        if (list.size()>0){
            return "登录成功！";
        }else{
            return  "登录失败！";
        }
    }
    /**
     * 删除用户
     * @param userid
     * @return void
     */
    @RequestMapping("/deleteUser")
    public void deleteUser(int userid) {

        service.deleteByid(userid);
    }
    /**
     * 修改用户信息
     * @param userMap
     * @return void
     */
    @PostMapping("/updateUser")
    @ResponseBody
    public void updateUser(@RequestBody Map userMap) {
        User user = (User)JsonUtils.jsonString2Bean(User.class, userMap, "user");
        service.updateUserInfo(user);
    }
    /**
     * 新增用户信息
     * @param userMap
     * @return void
     */
    @PostMapping("/addUser")
    @ResponseBody
    public void addUser(@RequestBody Map userMap) {
        User user = (User)JsonUtils.jsonString2Bean(User.class, userMap, "user");
        service.insert(user);
    }


}
