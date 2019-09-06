package com.lying.test.mapper;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import com.lying.test.pojo.EBillChargeitem;

public class EBillChargeitemSqlProvider {

    public String insertSelective(EBillChargeitem record) {
        BEGIN();
        INSERT_INTO("e_bill_chargeitem");
        
        if (record.getGuid() != null) {
            VALUES("guid", "#{guid,jdbcType=INTEGER}");
        }
        
        if (record.getBitycode() != null) {
            VALUES("bitycode", "#{bitycode,jdbcType=VARCHAR}");
        }
        
        if (record.getItemcode() != null) {
            VALUES("itemcode", "#{itemcode,jdbcType=VARCHAR}");
        }
        
        return SQL();
    }

    public String updateByPrimaryKeySelective(EBillChargeitem record) {
        BEGIN();
        UPDATE("e_bill_chargeitem");
        
        if (record.getBitycode() != null) {
            SET("bitycode = #{bitycode,jdbcType=VARCHAR}");
        }
        
        if (record.getItemcode() != null) {
            SET("itemcode = #{itemcode,jdbcType=VARCHAR}");
        }
        
        WHERE("guid = #{guid,jdbcType=INTEGER}");
        
        return SQL();
    }
}