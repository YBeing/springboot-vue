package com.lying.test.mapper;

import com.lying.test.pojo.UnitBillTb;
import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface UnitBillTbMapper {
    @Delete({
        "delete from unit_bill_tb",
        "where guid = #{guid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer guid);

    @Insert({
        "insert into unit_bill_tb (guid, unitcode, ",
        "billcode)",
        "values (#{guid,jdbcType=INTEGER}, #{unitcode,jdbcType=VARCHAR}, ",
        "#{billcode,jdbcType=VARCHAR})"
    })
    int insert(UnitBillTb record);

    @InsertProvider(type=UnitBillTbSqlProvider.class, method="insertSelective")
    int insertSelective(UnitBillTb record);

    @Select({
        "select",
        "guid, unitcode, billcode",
        "from unit_bill_tb",
        "where guid = #{guid,jdbcType=INTEGER}"
    })
    @ConstructorArgs({
        @Arg(column="guid", javaType=Integer.class, jdbcType=JdbcType.INTEGER, id=true),
        @Arg(column="unitcode", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="billcode", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    UnitBillTb selectByPrimaryKey(Integer guid);

    @UpdateProvider(type=UnitBillTbSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(UnitBillTb record);

    @Update({
        "update unit_bill_tb",
        "set unitcode = #{unitcode,jdbcType=VARCHAR},",
          "billcode = #{billcode,jdbcType=VARCHAR}",
        "where guid = #{guid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(UnitBillTb record);
}