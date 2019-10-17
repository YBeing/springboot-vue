package com.lying.test.mapper;

import com.lying.test.pojo.ZsBillinfoDetail;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.math.BigDecimal;

public interface ZsBillinfoDetailMapper {
    @Delete({
        "delete from zs_billinfodetail",
        "where guid = #{guid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer guid);

    @Insert( {
        "insert into zs_billinfodetail (guid, p_billid, ",
        "itemcode, unitcode, ",
        "count, price, money)",
        "values (#{guid,jdbcType=INTEGER}, #{pBillid,jdbcType=INTEGER}, ",
        "#{itemcode,jdbcType=VARCHAR}, #{unitcode,jdbcType=VARCHAR}, ",
        "#{count,jdbcType=INTEGER}, #{price,jdbcType=DECIMAL}, #{money,jdbcType=VARCHAR})"
    })
    int insert(ZsBillinfoDetail record);

    @InsertProvider(type=ZsBillinfoDetailSqlProvider.class, method="insertSelective")
    int insertSelective(ZsBillinfoDetail record);

    @Select({
        "select",
        "guid, p_billid, itemcode, unitcode, count, price, money",
        "from zs_billinfodetail",
        "where guid = #{guid,jdbcType=INTEGER}"
    })
    @ConstructorArgs({
        @Arg(column="guid", javaType=Integer.class, jdbcType=JdbcType.INTEGER, id=true),
        @Arg(column="p_billid", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="itemcode", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="unitcode", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="count", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="price", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="money", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    ZsBillinfoDetail selectByPrimaryKey(Integer guid);

    @UpdateProvider(type=ZsBillinfoDetailSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(ZsBillinfoDetail record);

    @Update({
        "update zs_billinfodetail",
        "set p_billid = #{pBillid,jdbcType=INTEGER},",
          "itemcode = #{itemcode,jdbcType=VARCHAR},",
          "unitcode = #{unitcode,jdbcType=VARCHAR},",
          "count = #{count,jdbcType=INTEGER},",
          "price = #{price,jdbcType=DECIMAL},",
          "money = #{money,jdbcType=VARCHAR}",
        "where guid = #{guid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(ZsBillinfoDetail record);
}