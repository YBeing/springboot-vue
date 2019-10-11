package com.lying.test.mapper;

import com.lying.test.pojo.EBillStock;
import com.lying.test.utils.StringUtils;

import static org.apache.ibatis.jdbc.SqlBuilder.*;

public class EBillStockSqlProvider {

    public String insertSelective(EBillStock record) {
        BEGIN();
        INSERT_INTO("e_bill_stock");
        
        if (record.getId() != null) {
            VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getRegicode() != null) {
            VALUES("regicode", "#{regicode,jdbcType=VARCHAR}");
        }
        
        if (record.getUnitcode() != null) {
            VALUES("unitcode", "#{unitcode,jdbcType=VARCHAR}");
        }
        
        if (record.getBitycode() != null) {
            VALUES("bitycode", "#{bitycode,jdbcType=VARCHAR}");
        }
        
        if (record.getStartno() != null) {
            VALUES("startno", "#{startno,jdbcType=VARCHAR}");
        }
        
        if (record.getEndno() != null) {
            VALUES("endno", "#{endno,jdbcType=VARCHAR}");
        }
        
        if (record.getSheets() != null) {
            VALUES("sheets", "#{sheets,jdbcType=BIGINT}");
        }
        
        return SQL();
    }

    public String updateByPrimaryKeySelective(EBillStock record) {
        BEGIN();
        UPDATE("e_bill_stock");
        
        if (record.getRegicode() != null) {
            SET("regicode = #{regicode,jdbcType=VARCHAR}");
        }
        
        if (record.getUnitcode() != null) {
            SET("unitcode = #{unitcode,jdbcType=VARCHAR}");
        }
        
        if (record.getBitycode() != null) {
            SET("bitycode = #{bitycode,jdbcType=VARCHAR}");
        }
        
        if (record.getStartno() != null) {
            SET("startno = #{startno,jdbcType=VARCHAR}");
        }
        
        if (record.getEndno() != null) {
            SET("endno = #{endno,jdbcType=VARCHAR}");
        }
        
        if (record.getSheets() != null) {
            SET("sheets = #{sheets,jdbcType=BIGINT}");
        }
        
        WHERE("id = #{id,jdbcType=BIGINT}");
        
        return SQL();
    }
    public String selectByConditions(String  regicode,String  unitcode,String bitycode) {
        BEGIN();
        SELECT(" *  ");
        FROM("e_bill_stock");

        if (StringUtils.isemty(regicode)) {
            WHERE("regicode = #{regicode,jdbcType=VARCHAR}");
        }

        if (StringUtils.isemty(unitcode)) {
            WHERE("unitcode = #{unitcode,jdbcType=VARCHAR}");
        }

        if (StringUtils.isemty(bitycode)) {
            WHERE("bitycode = #{bitycode,jdbcType=VARCHAR}");
        }

        return SQL();
    }
}