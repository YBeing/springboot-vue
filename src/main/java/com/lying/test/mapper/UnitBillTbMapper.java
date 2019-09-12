package com.lying.test.mapper;

import com.lying.test.pojo.UnitBillTb;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

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



    @Update({
        "update unit_bill_tb",
        "set unitcode = #{unitcode,jdbcType=VARCHAR},",
          "billcode = #{billcode,jdbcType=VARCHAR}",
        "where guid = #{guid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(UnitBillTb record);
    @Select("select * from unit_bill_tb  where unitcode=#{unitcode} ")
    @Results(
            @Result(property = "billtype",column = "billcode",
                    one=@One(select="com.lying.test.mapper.XtBilltypeMapper.selectByBillcode",fetchType = FetchType.EAGER))
    )
    List<UnitBillTb> getByUnitcode(String unitcode);
}