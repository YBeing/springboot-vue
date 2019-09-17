package com.lying.test.mapper;

import com.lying.test.pojo.EModel;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.Date;
import java.util.List;

public interface EModelMapper {
    @Delete({
        "delete from e_model",
        "where modelid = #{modelid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer modelid);

    @Insert({
        "insert into e_model (modelid, bitycode, ",
        "modelversion, modelUrl, ",
        "modelStartDate, modelEndDate)",
        "values (#{modelid,jdbcType=INTEGER}, #{bitycode,jdbcType=VARCHAR}, ",
        "#{modelversion,jdbcType=VARCHAR}, #{modelurl,jdbcType=VARCHAR}, ",
        "#{modelstartdate,jdbcType=TIMESTAMP}, #{modelenddate,jdbcType=TIMESTAMP})"
    })
    int insert(EModel record);


    @Select({
        "select",
        "modelid, bitycode, modelversion, modelUrl, modelStartDate, modelEndDate",
        "from e_model",
        "where modelid = #{modelid,jdbcType=INTEGER}"
    })
    @ConstructorArgs({
        @Arg(column="modelid", javaType=Integer.class, jdbcType=JdbcType.INTEGER, id=true),
        @Arg(column="bitycode", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="modelversion", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="modelUrl", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="modelStartDate", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="modelEndDate", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    EModel selectByPrimaryKey(Integer modelid);


    @Update({
        "update e_model",
        "set bitycode = #{bitycode,jdbcType=VARCHAR},",
          "modelversion = #{modelversion,jdbcType=VARCHAR},",
          "modelUrl = #{modelurl,jdbcType=VARCHAR},",
          "modelStartDate = #{modelstartdate,jdbcType=TIMESTAMP},",
          "modelEndDate = #{modelenddate,jdbcType=TIMESTAMP}",
        "where modelid = #{modelid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(EModel record);
    @Select("select * from e_model")
    List<EModel> list();
    @Select({
            "select",
            "modelid, bitycode, modelversion, modelUrl, modelStartDate, modelEndDate",
            "from e_model",
            "where bitycode = #{bitycode}"
    })
    EModel getByBitycode(String bitycode);

}