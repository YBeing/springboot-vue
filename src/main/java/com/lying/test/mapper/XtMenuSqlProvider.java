package com.lying.test.mapper;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import com.lying.test.pojo.XtMenu;

public class XtMenuSqlProvider {

    public String insertSelective(XtMenu record) {
        BEGIN();
        INSERT_INTO("xt_menu");
        
        if (record.getGuid() != null) {
            VALUES("guid", "#{guid,jdbcType=INTEGER}");
        }
        
        if (record.getMenuname() != null) {
            VALUES("menuname", "#{menuname,jdbcType=VARCHAR}");
        }
        
        if (record.getUrl() != null) {
            VALUES("url", "#{url,jdbcType=VARCHAR}");
        }
        
        if (record.getPid() != null) {
            VALUES("pid", "#{pid,jdbcType=INTEGER}");
        }
        
        return SQL();
    }

    public String updateByPrimaryKeySelective(XtMenu record) {
        BEGIN();
        UPDATE("xt_menu");
        
        if (record.getMenuname() != null) {
            SET("menuname = #{menuname,jdbcType=VARCHAR}");
        }
        
        if (record.getUrl() != null) {
            SET("url = #{url,jdbcType=VARCHAR}");
        }
        
        if (record.getPid() != null) {
            SET("pid = #{pid,jdbcType=INTEGER}");
        }
        
        WHERE("guid = #{guid,jdbcType=INTEGER}");
        
        return SQL();
    }
}