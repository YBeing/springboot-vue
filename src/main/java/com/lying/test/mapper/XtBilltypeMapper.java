package com.lying.test.mapper;

import com.lying.test.pojo.XtBilltype;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.Date;

public interface XtBilltypeMapper {
    @Delete({
        "delete from xt_billtype",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into xt_billtype (id, billcode, ",
        "billname, isdzpj, startdate, ",
        "enddate)",
        "values (#{id,jdbcType=INTEGER}, #{billcode,jdbcType=VARCHAR}, ",
        "#{billname,jdbcType=VARCHAR}, #{isdzpj,jdbcType=CHAR}, #{startdate,jdbcType=TIMESTAMP}, ",
        "#{enddate,jdbcType=TIMESTAMP})"
    })
    int insert(XtBilltype record);

    @InsertProvider(type=XtBilltypeSqlProvider.class, method="insertSelective")
    int insertSelective(XtBilltype record);

    @Select({
        "select",
        "id, billcode, billname, isdzpj, startdate, enddate",
        "from xt_billtype",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ConstructorArgs({
        @Arg(column="id", javaType=Integer.class, jdbcType=JdbcType.INTEGER, id=true),
        @Arg(column="billcode", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="billname", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="isdzpj", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="startdate", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="enddate", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    XtBilltype selectByPrimaryKey(Integer id);

    @UpdateProvider(type=XtBilltypeSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(XtBilltype record);

    @Update({
        "update xt_billtype",
        "set billcode = #{billcode,jdbcType=VARCHAR},",
          "billname = #{billname,jdbcType=VARCHAR},",
          "isdzpj = #{isdzpj,jdbcType=CHAR},",
          "startdate = #{startdate,jdbcType=TIMESTAMP},",
          "enddate = #{enddate,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(XtBilltype record);
    @Select("select * from xt_billtype where billcode=#{billcode}")
    XtBilltype selectByBillcode(String billcode);



}