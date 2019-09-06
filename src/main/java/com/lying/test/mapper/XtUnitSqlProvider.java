package com.lying.test.mapper;

import com.lying.test.pojo.XtUnit;

import static org.apache.ibatis.jdbc.SqlBuilder.*;

public class XtUnitSqlProvider {

    public String insertSelective(XtUnit record) {
        BEGIN();
        INSERT_INTO("xt_unit");
        
        if (record.getGuid() != null) {
            VALUES("guid", "#{guid,jdbcType=INTEGER}");
        }
        
        if (record.getUnitcode() != null) {
            VALUES("unitcode", "#{unitcode,jdbcType=VARCHAR}");
        }
        
        if (record.getUnitname() != null) {
            VALUES("unitname", "#{unitname,jdbcType=VARCHAR}");
        }
        
        if (record.getPid() != null) {
            VALUES("pid", "#{pid,jdbcType=INTEGER}");
        }
        
        return SQL();
    }

    public String updateByPrimaryKeySelective(XtUnit record) {
        BEGIN();
        UPDATE("xt_unit");
        
        if (record.getUnitcode() != null) {
            SET("unitcode = #{unitcode,jdbcType=VARCHAR}");
        }
        
        if (record.getUnitname() != null) {
            SET("unitname = #{unitname,jdbcType=VARCHAR}");
        }
        
        if (record.getPid() != null) {
            SET("pid = #{pid,jdbcType=INTEGER}");
        }
        
        WHERE("guid = #{guid,jdbcType=INTEGER}");
        
        return SQL();
    }
}