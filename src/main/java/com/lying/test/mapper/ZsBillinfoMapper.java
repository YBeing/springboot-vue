package com.lying.test.mapper;

import com.lying.test.pojo.ZsBillinfo;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.Date;

public interface ZsBillinfoMapper {
    @Delete({
        "delete from zs_billinfo",
        "where billid = #{billid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer billid);

    @Insert({
        "insert into zs_billinfo (billid, billno, ",
        "billtypeNo, billtypeName, ",
        "makeDate, makePlayer)",
        "values (#{billid,jdbcType=INTEGER}, #{billno,jdbcType=VARCHAR}, ",
        "#{billtypeno,jdbcType=VARCHAR}, #{billtypename,jdbcType=VARCHAR}, ",
        "#{makedate,jdbcType=TIMESTAMP}, #{makeplayer,jdbcType=VARCHAR})"
    })
    int insert(ZsBillinfo record);


    @Select({
        "select",
        "billid, billno, billtypeNo, billtypeName, makeDate, makePlayer",
        "from zs_billinfo",
        "where billid = #{billid,jdbcType=INTEGER}"
    })
    @ConstructorArgs({
        @Arg(column="billid", javaType=Integer.class, jdbcType=JdbcType.INTEGER, id=true),
        @Arg(column="billno", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="billtypeNo", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="billtypeName", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="makeDate", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="makePlayer", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    ZsBillinfo selectByPrimaryKey(Integer billid);


    @Update({
        "update zs_billinfo",
        "set billno = #{billno,jdbcType=VARCHAR},",
          "billtypeNo = #{billtypeno,jdbcType=VARCHAR},",
          "billtypeName = #{billtypename,jdbcType=VARCHAR},",
          "makeDate = #{makedate,jdbcType=TIMESTAMP},",
          "makePlayer = #{makeplayer,jdbcType=VARCHAR}",
        "where billid = #{billid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(ZsBillinfo record);
}