package com.lying.test.mapper;

import com.lying.test.pojo.EBillStock;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface EBillStockMapper {
    @Delete({
        "delete from e_bill_stock",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into e_bill_stock (id, regicode, ",
        "unitcode, bitycode, ",
        "startno, endno, ",
        "sheets)",
        "values (#{id,jdbcType=BIGINT}, #{regicode,jdbcType=VARCHAR}, ",
        "#{unitcode,jdbcType=VARCHAR}, #{bitycode,jdbcType=VARCHAR}, ",
        "#{startno,jdbcType=VARCHAR}, #{endno,jdbcType=VARCHAR}, ",
        "#{sheets,jdbcType=BIGINT})"
    })
    int insert(EBillStock record);


    @Select({
        "select",
        "id, regicode, unitcode, bitycode, startno, endno, sheets",
        "from e_bill_stock",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="regicode", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="unitcode", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="bitycode", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="startno", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="endno", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="sheets", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    EBillStock selectByPrimaryKey(Long id);


    @Update({
        "update e_bill_stock",
        "set regicode = #{regicode,jdbcType=VARCHAR},",
          "unitcode = #{unitcode,jdbcType=VARCHAR},",
          "bitycode = #{bitycode,jdbcType=VARCHAR},",
          "startno = #{startno,jdbcType=VARCHAR},",
          "endno = #{endno,jdbcType=VARCHAR},",
          "sheets = #{sheets,jdbcType=BIGINT}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(EBillStock record);
}