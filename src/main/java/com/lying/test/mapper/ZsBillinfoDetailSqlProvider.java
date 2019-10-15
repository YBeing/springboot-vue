package com.lying.test.mapper;

import com.lying.test.pojo.ZsBillinfoDetail;

import static org.apache.ibatis.jdbc.SqlBuilder.*;

public class ZsBillinfoDetailSqlProvider {

    public String insertSelective(ZsBillinfoDetail record) {
        BEGIN();
        INSERT_INTO("zs_billinfodetail");
        
        if (record.getGuid() != null) {
            VALUES("guid", "#{guid,jdbcType=INTEGER}");
        }
        
        if (record.getpBillid() != null) {
            VALUES("p_billid", "#{pBillid,jdbcType=INTEGER}");
        }
        
        if (record.getItemcode() != null) {
            VALUES("itemcode", "#{itemcode,jdbcType=VARCHAR}");
        }
        
        if (record.getUnitcode() != null) {
            VALUES("unitcode", "#{unitcode,jdbcType=VARCHAR}");
        }
        
        if (record.getCount() != null) {
            VALUES("count", "#{count,jdbcType=INTEGER}");
        }
        
        if (record.getPrice() != null) {
            VALUES("price", "#{price,jdbcType=DECIMAL}");
        }
        
        if (record.getMoney() != null) {
            VALUES("money", "#{money,jdbcType=VARCHAR}");
        }
        
        return SQL();
    }

    public String updateByPrimaryKeySelective(ZsBillinfoDetail record) {
        BEGIN();
        UPDATE("zs_billinfodetail");
        
        if (record.getpBillid() != null) {
            SET("p_billid = #{pBillid,jdbcType=INTEGER}");
        }
        
        if (record.getItemcode() != null) {
            SET("itemcode = #{itemcode,jdbcType=VARCHAR}");
        }
        
        if (record.getUnitcode() != null) {
            SET("unitcode = #{unitcode,jdbcType=VARCHAR}");
        }
        
        if (record.getCount() != null) {
            SET("count = #{count,jdbcType=INTEGER}");
        }
        
        if (record.getPrice() != null) {
            SET("price = #{price,jdbcType=DECIMAL}");
        }
        
        if (record.getMoney() != null) {
            SET("money = #{money,jdbcType=VARCHAR}");
        }
        
        WHERE("guid = #{guid,jdbcType=INTEGER}");
        
        return SQL();
    }
}