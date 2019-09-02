package com.lying.test.mapper;

import com.lying.test.pojo.TUser;
import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface TUserMapper {
    @Delete({
        "delete from t_user",
        "where USER_ID = #{userId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer userId);

    @Insert({
        "insert into t_user (USER_ID, USERNAME, ",
        "PASSWORD, NICKNAME, ",
        "TELPHONE, ADDRESS)",
        "values (#{userId,jdbcType=INTEGER}, #{username,jdbcType=VARCHAR}, ",
        "#{password,jdbcType=VARCHAR}, #{nickname,jdbcType=VARCHAR}, ",
        "#{telphone,jdbcType=VARCHAR}, #{address,jdbcType=VARCHAR})"
    })
    int insert(TUser record);

    @InsertProvider(type=TUserSqlProvider.class, method="insertSelective")
    int insertSelective(TUser record);

    @Select({
        "select",
        "USER_ID, USERNAME, PASSWORD, NICKNAME, TELPHONE, ADDRESS",
        "from t_user",
        "where USER_ID = #{userId,jdbcType=INTEGER}"
    })
    @ConstructorArgs({
        @Arg(column="USER_ID", javaType=Integer.class, jdbcType=JdbcType.INTEGER, id=true),
        @Arg(column="USERNAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="PASSWORD", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="NICKNAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="TELPHONE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="ADDRESS", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    TUser selectByPrimaryKey(Integer userId);

    @UpdateProvider(type=TUserSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TUser record);

    @Update({
        "update t_user",
        "set USERNAME = #{username,jdbcType=VARCHAR},",
          "PASSWORD = #{password,jdbcType=VARCHAR},",
          "NICKNAME = #{nickname,jdbcType=VARCHAR},",
          "TELPHONE = #{telphone,jdbcType=VARCHAR},",
          "ADDRESS = #{address,jdbcType=VARCHAR}",
        "where USER_ID = #{userId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(TUser record);
}