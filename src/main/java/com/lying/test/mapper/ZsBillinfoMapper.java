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
        "makeDate, makePlayer, ",
        "unitcode, payerName, ",
        "tel, idcard, email, ",
        "payerKind, totalMoney, ",
        "remark)",
        "values (#{billid,jdbcType=INTEGER}, #{billno,jdbcType=VARCHAR}, ",
        "#{billtypeno,jdbcType=VARCHAR}, #{billtypename,jdbcType=VARCHAR}, ",
        "#{makedate,jdbcType=TIMESTAMP}, #{makeplayer,jdbcType=VARCHAR}, ",
        "#{unitcode,jdbcType=VARCHAR}, #{payername,jdbcType=VARCHAR}, ",
        "#{tel,jdbcType=VARCHAR}, #{idcard,jdbcType=VARCHAR}, #{email,jdbcType=VARCHAR}, ",
        "#{payerkind,jdbcType=VARCHAR}, #{totalmoney,jdbcType=VARCHAR}, ",
        "#{remark,jdbcType=VARCHAR})"
    })
    int insert(ZsBillinfo record);


    @Select({
        "select",
        "billid, billno, billtypeNo, billtypeName, makeDate, makePlayer, unitcode, payerName, ",
        "tel, idcard, email, payerKind, totalMoney, remark",
        "from zs_billinfo",
        "where billid = #{billid,jdbcType=INTEGER}"
    })
    @ConstructorArgs({
        @Arg(column="billid", javaType=Integer.class, jdbcType=JdbcType.INTEGER, id=true),
        @Arg(column="billno", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="billtypeNo", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="billtypeName", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="makeDate", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="makePlayer", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="unitcode", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="payerName", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="tel", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="idcard", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="email", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="payerKind", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="totalMoney", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="remark", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    ZsBillinfo selectByPrimaryKey(Integer billid);


    @Update({
        "update zs_billinfo",
        "set billno = #{billno,jdbcType=VARCHAR},",
          "billtypeNo = #{billtypeno,jdbcType=VARCHAR},",
          "billtypeName = #{billtypename,jdbcType=VARCHAR},",
          "makeDate = #{makedate,jdbcType=TIMESTAMP},",
          "makePlayer = #{makeplayer,jdbcType=VARCHAR},",
          "unitcode = #{unitcode,jdbcType=VARCHAR},",
          "payerName = #{payername,jdbcType=VARCHAR},",
          "tel = #{tel,jdbcType=VARCHAR},",
          "idcard = #{idcard,jdbcType=VARCHAR},",
          "email = #{email,jdbcType=VARCHAR},",
          "payerKind = #{payerkind,jdbcType=VARCHAR},",
          "totalMoney = #{totalmoney,jdbcType=VARCHAR},",
          "remark = #{remark,jdbcType=VARCHAR}",
        "where billid = #{billid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(ZsBillinfo record);
}