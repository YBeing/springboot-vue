/**
 * className:UserMapper
 * author:Liuyibin
 * date: 2019/8/29
 */
package com.lying.test.mapper;

import com.lying.test.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    @Select("select * from t_user ")
    List<User> list();
    @Select("select * from t_user where username like #{username}")
    List<User> findByUsername(String username);
}
