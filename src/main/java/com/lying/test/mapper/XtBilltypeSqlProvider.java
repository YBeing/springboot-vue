package com.lying.test.mapper;

import com.lying.test.pojo.XtBilltype;

import static org.apache.ibatis.jdbc.SqlBuilder.*;

public class XtBilltypeSqlProvider {

    public String insertSelective(XtBilltype record) {
        BEGIN();
        INSERT_INTO("xt_billtype");
        
        if (record.getId() != null) {
            VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getBillcode() != null) {
            VALUES("billcode", "#{billcode,jdbcType=VARCHAR}");
        }
        
        if (record.getBillname() != null) {
            VALUES("billname", "#{billname,jdbcType=VARCHAR}");
        }
        
        if (record.getIsdzpj() != null) {
            VALUES("isdzpj", "#{isdzpj,jdbcType=CHAR}");
        }
        
        if (record.getStartdate() != null) {
            VALUES("startdate", "#{startdate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getEnddate() != null) {
            VALUES("enddate", "#{enddate,jdbcType=TIMESTAMP}");
        }
        
        return SQL();
    }

    public String updateByPrimaryKeySelective(XtBilltype record) {
        BEGIN();
        UPDATE("xt_billtype");
        
        if (record.getBillcode() != null) {
            SET("billcode = #{billcode,jdbcType=VARCHAR}");
        }
        
        if (record.getBillname() != null) {
            SET("billname = #{billname,jdbcType=VARCHAR}");
        }
        
        if (record.getIsdzpj() != null) {
            SET("isdzpj = #{isdzpj,jdbcType=CHAR}");
        }
        
        if (record.getStartdate() != null) {
            SET("startdate = #{startdate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getEnddate() != null) {
            SET("enddate = #{enddate,jdbcType=TIMESTAMP}");
        }
        
        WHERE("id = #{id,jdbcType=INTEGER}");
        
        return SQL();
    }
}