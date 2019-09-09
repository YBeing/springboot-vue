package com.lying.test.mapper;

import com.lying.test.pojo.EBillChargeitem;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface EBillChargeitemMapper {
    @Delete({
        "delete from e_bill_chargeitem",
        "where guid = #{guid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer guid);

    @Insert({
        "insert into e_bill_chargeitem (guid, bitycode, ",
        "itemcode)",
        "values (#{guid,jdbcType=INTEGER}, #{bitycode,jdbcType=VARCHAR}, ",
        "#{itemcode,jdbcType=VARCHAR})"
    })
    int insert(EBillChargeitem record);

    @InsertProvider(type=EBillChargeitemSqlProvider.class, method="insertSelective")
    int insertSelective(EBillChargeitem record);

    @Select({
        "select",
        "guid, bitycode, itemcode",
        "from e_bill_chargeitem",
        "where guid = #{guid,jdbcType=INTEGER}"
    })
    @ConstructorArgs({
        @Arg(column="guid", javaType=Integer.class, jdbcType=JdbcType.INTEGER, id=true),
        @Arg(column="bitycode", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="itemcode", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    EBillChargeitem selectByPrimaryKey(Integer guid);

    @UpdateProvider(type=EBillChargeitemSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(EBillChargeitem record);

    @Update({
        "update e_bill_chargeitem",
        "set bitycode = #{bitycode,jdbcType=VARCHAR},",
          "itemcode = #{itemcode,jdbcType=VARCHAR}",
        "where guid = #{guid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(EBillChargeitem record);
    @Select("select * from e_bill_chargeitem where bitycode=#{bitycode}")
    @Results({
            @Result(property = "chargeitem",column = "itemcode",
                    one=@One(select="com.lying.test.mapper.XtChargeitemMapper.selectByItemcode",fetchType = FetchType.EAGER))}
    )
    List<EBillChargeitem> selectByBitycode(String bitycode);
    @Delete({
            "delete from e_bill_chargeitem",
            "where bitycode = #{bitycode} and itemcode =#{itemcode}"
    })
    int deleteByBitycodeAndItemcode(@Param("bitycode") String bitycode,@Param("itemcode") String itemcode);
}