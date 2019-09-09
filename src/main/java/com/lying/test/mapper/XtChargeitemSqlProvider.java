package com.lying.test.mapper;

import com.lying.test.pojo.XtChargeitem;

import static org.apache.ibatis.jdbc.SqlBuilder.*;

public class XtChargeitemSqlProvider {

    public String insertSelective(XtChargeitem record) {
        BEGIN();
        INSERT_INTO("xt_chargeitem");
        
        if (record.getGuid() != null) {
            VALUES("guid", "#{guid,jdbcType=INTEGER}");
        }
        
        if (record.getItemcode() != null) {
            VALUES("itemcode", "#{itemcode,jdbcType=VARCHAR}");
        }
        
        if (record.getItemname() != null) {
            VALUES("itemname", "#{itemname,jdbcType=VARCHAR}");
        }
        
        return SQL();
    }

    public String updateByPrimaryKeySelective(XtChargeitem record) {
        BEGIN();
        UPDATE("xt_chargeitem");
        
        if (record.getItemcode() != null) {
            SET("itemcode = #{itemcode,jdbcType=VARCHAR}");
        }
        
        if (record.getItemname() != null) {
            SET("itemname = #{itemname,jdbcType=VARCHAR}");
        }
        
        WHERE("guid = #{guid,jdbcType=INTEGER}");
        
        return SQL();
    }
}