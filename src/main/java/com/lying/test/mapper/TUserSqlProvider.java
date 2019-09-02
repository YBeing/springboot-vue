package com.lying.test.mapper;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import com.lying.test.pojo.TUser;

public class TUserSqlProvider {

    public String insertSelective(TUser record) {
        BEGIN();
        INSERT_INTO("t_user");
        
        if (record.getUserId() != null) {
            VALUES("USER_ID", "#{userId,jdbcType=INTEGER}");
        }
        
        if (record.getUsername() != null) {
            VALUES("USERNAME", "#{username,jdbcType=VARCHAR}");
        }
        
        if (record.getPassword() != null) {
            VALUES("PASSWORD", "#{password,jdbcType=VARCHAR}");
        }
        
        if (record.getNickname() != null) {
            VALUES("NICKNAME", "#{nickname,jdbcType=VARCHAR}");
        }
        
        if (record.getTelphone() != null) {
            VALUES("TELPHONE", "#{telphone,jdbcType=VARCHAR}");
        }
        
        if (record.getAddress() != null) {
            VALUES("ADDRESS", "#{address,jdbcType=VARCHAR}");
        }
        
        return SQL();
    }

    public String updateByPrimaryKeySelective(TUser record) {
        BEGIN();
        UPDATE("t_user");
        
        if (record.getUsername() != null) {
            SET("USERNAME = #{username,jdbcType=VARCHAR}");
        }
        
        if (record.getPassword() != null) {
            SET("PASSWORD = #{password,jdbcType=VARCHAR}");
        }
        
        if (record.getNickname() != null) {
            SET("NICKNAME = #{nickname,jdbcType=VARCHAR}");
        }
        
        if (record.getTelphone() != null) {
            SET("TELPHONE = #{telphone,jdbcType=VARCHAR}");
        }
        
        if (record.getAddress() != null) {
            SET("ADDRESS = #{address,jdbcType=VARCHAR}");
        }
        
        WHERE("USER_ID = #{userId,jdbcType=INTEGER}");
        
        return SQL();
    }
}