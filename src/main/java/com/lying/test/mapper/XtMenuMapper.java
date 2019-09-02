package com.lying.test.mapper;

import com.lying.test.pojo.XtMenu;
import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface XtMenuMapper {
    @Delete({
        "delete from xt_menu",
        "where guid = #{guid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer guid);

    @Insert({
        "insert into xt_menu (guid, menuname, ",
        "url, pid)",
        "values (#{guid,jdbcType=INTEGER}, #{menuname,jdbcType=VARCHAR}, ",
        "#{url,jdbcType=VARCHAR}, #{pid,jdbcType=INTEGER})"
    })
    int insert(XtMenu record);

    @InsertProvider(type=XtMenuSqlProvider.class, method="insertSelective")
    int insertSelective(XtMenu record);

    @Select({
        "select",
        "guid, menuname, url, pid",
        "from xt_menu",
        "where guid = #{guid,jdbcType=INTEGER}"
    })
    @ConstructorArgs({
        @Arg(column="guid", javaType=Integer.class, jdbcType=JdbcType.INTEGER, id=true),
        @Arg(column="menuname", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="url", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="pid", javaType=Integer.class, jdbcType=JdbcType.INTEGER)
    })
    XtMenu selectByPrimaryKey(Integer guid);

    @UpdateProvider(type=XtMenuSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(XtMenu record);

    @Update({
        "update xt_menu",
        "set menuname = #{menuname,jdbcType=VARCHAR},",
          "url = #{url,jdbcType=VARCHAR},",
          "pid = #{pid,jdbcType=INTEGER}",
        "where guid = #{guid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(XtMenu record);
}