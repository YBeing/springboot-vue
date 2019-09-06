package com.lying.test.mapper;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import com.lying.test.pojo.UnitBillTb;

public class UnitBillTbSqlProvider {

    public String insertSelective(UnitBillTb record) {
        BEGIN();
        INSERT_INTO("unit_bill_tb");
        
        if (record.getGuid() != null) {
            VALUES("guid", "#{guid,jdbcType=INTEGER}");
        }
        
        if (record.getUnitcode() != null) {
            VALUES("unitcode", "#{unitcode,jdbcType=VARCHAR}");
        }
        
        if (record.getBillcode() != null) {
            VALUES("billcode", "#{billcode,jdbcType=VARCHAR}");
        }
        
        return SQL();
    }

    public String updateByPrimaryKeySelective(UnitBillTb record) {
        BEGIN();
        UPDATE("unit_bill_tb");
        
        if (record.getUnitcode() != null) {
            SET("unitcode = #{unitcode,jdbcType=VARCHAR}");
        }
        
        if (record.getBillcode() != null) {
            SET("billcode = #{billcode,jdbcType=VARCHAR}");
        }
        
        WHERE("guid = #{guid,jdbcType=INTEGER}");
        
        return SQL();
    }
}