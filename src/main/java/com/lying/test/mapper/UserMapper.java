/**
 * className:UserMapper
 * author:Liuyibin
 * date: 2019/8/29
 */
package com.lying.test.mapper;

import com.lying.test.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserMapper {
    @Select("select * from t_user ")
    List<User> list();
    @Select("select * from t_user where username like #{username}")
    List<User> findByUsername(String username);
    @Select("select * from t_user where username = #{username} and password=#{password}")
    List<User> Login(@Param("username") String username, @Param("password") String password);
    @Delete("delete from t_user where user_id =#{userId}")
    void deleteByid(int id);
    @Update({
            "update t_user",
            "set USERNAME = #{username,jdbcType=VARCHAR},",
            "PASSWORD = #{password,jdbcType=VARCHAR},",
            "NICKNAME = #{nickname,jdbcType=VARCHAR},",
            "TELPHONE = #{telphone,jdbcType=VARCHAR},",
            "ADDRESS = #{address,jdbcType=VARCHAR}",
            "where USER_ID = #{userId,jdbcType=INTEGER}"
    })
    void updateUserInfo(User record);

}
