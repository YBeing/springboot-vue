package com.lying.test.mapper;

import com.lying.test.pojo.XtUnit;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface XtUnitMapper {
    @Delete({
        "delete from xt_unit",
        "where guid = #{guid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer guid);

    @Insert({
        "insert into xt_unit (guid, unitcode, ",
        "unitname, pid)",
        "values (#{guid,jdbcType=INTEGER}, #{unitcode,jdbcType=VARCHAR}, ",
        "#{unitname,jdbcType=VARCHAR}, #{pid,jdbcType=INTEGER})"
    })
    int insert(XtUnit record);


    @Select({
        "select",
        "guid, unitcode, unitname, pid",
        "from xt_unit",
        "where guid = #{guid,jdbcType=INTEGER}"
    })
    @ConstructorArgs({
        @Arg(column="guid", javaType=Integer.class, jdbcType=JdbcType.INTEGER, id=true),
        @Arg(column="unitcode", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="unitname", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="pid", javaType=Integer.class, jdbcType=JdbcType.INTEGER)
    })
    XtUnit selectByPrimaryKey(Integer guid);


    @Update({
        "update xt_unit",
        "set unitcode = #{unitcode,jdbcType=VARCHAR},",
          "unitname = #{unitname,jdbcType=VARCHAR},",
          "pid = #{pid,jdbcType=INTEGER}",
        "where guid = #{guid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(XtUnit record);
    @Select("select * from xt_unit where pid=#{pid}")
    List<XtUnit> getListBypid(int pid);
    @Select("select * from xt_unit ")
    List<XtUnit> getAllUnit();
}