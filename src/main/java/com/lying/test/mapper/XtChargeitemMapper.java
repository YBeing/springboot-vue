package com.lying.test.mapper;

import com.lying.test.pojo.XtChargeitem;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface XtChargeitemMapper {
    @Delete({
        "delete from xt_chargeitem",
        "where guid = #{guid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer guid);

    @Insert({
        "insert into xt_chargeitem (guid, itemcode, ",
        "itemname)",
        "values (#{guid,jdbcType=INTEGER}, #{itemcode,jdbcType=VARCHAR}, ",
        "#{itemname,jdbcType=VARCHAR})"
    })
    int insert(XtChargeitem record);

    @InsertProvider(type=XtChargeitemSqlProvider.class, method="insertSelective")
    int insertSelective(XtChargeitem record);

    @Select({
        "select",
        "guid, itemcode, itemname",
        "from xt_chargeitem",
        "where guid = #{guid,jdbcType=INTEGER}"
    })
    @ConstructorArgs({
        @Arg(column="guid", javaType=Integer.class, jdbcType=JdbcType.INTEGER, id=true),
        @Arg(column="itemcode", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="itemname", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    XtChargeitem selectByPrimaryKey(Integer guid);

    @UpdateProvider(type=XtChargeitemSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(XtChargeitem record);

    @Update({
        "update xt_chargeitem",
        "set itemcode = #{itemcode,jdbcType=VARCHAR},",
          "itemname = #{itemname,jdbcType=VARCHAR}",
        "where guid = #{guid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(XtChargeitem record);
    @Select({
        "select * from xt_chargeitem",
        " where itemcode = #{itemcode}"
    })
    XtChargeitem selectByItemcode(String itemcode);
    @Select("select * from xt_chargeitem")
    List<XtChargeitem> list();
}