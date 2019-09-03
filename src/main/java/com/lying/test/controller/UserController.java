/**
 * className:UserController
 * author:Liuyibin
 * date: 2019/8/29
 */
package com.lying.test.controller;

import com.lying.test.mapper.UserMapper;
import com.lying.test.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.List;
@RestController
public class UserController {

    @Resource
    UserMapper mapper;
    /**
     * 获取所有用户信息列表
     * @param
     * @return java.util.List<com.lying.test.pojo.User>
     */
    @RequestMapping("/getUserList")
    @ResponseBody
    public List<User> index() {

        return mapper.list();
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

        List<User> list=mapper.Login(username,password);
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

        mapper.deleteByid(userid);
    }


}
