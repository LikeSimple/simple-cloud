package com.newtouch.cloud.service.business.user.mapper;

import com.newtouch.cloud.service.business.user.model.Authority;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface AuthorityMapper {
    @Delete({
        "delete from authority",
        "where id = #{id,jdbcType=CHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into authority (id, name, description, ",
        "create_time, update_time)",
        "values (#{id,jdbcType=CHAR}, #{name,jdbcType=VARCHAR}, #{description,jdbcType=VARCHAR}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{updateTime,jdbcType=TIMESTAMP})"
    })
    int insert(Authority record);

    int insertSelective(Authority record);

    @Select({
        "select",
        "id, name, description, create_time, update_time",
        "from authority",
        "where id = #{id,jdbcType=CHAR}"
    })
    @ResultMap("com.newtouch.cloud.service.business.user.mapper.AuthorityMapper.BaseResultMap")
    Authority selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Authority record);

    @Update({
        "update authority",
        "set name = #{name,jdbcType=VARCHAR},",
          "description = #{description,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=CHAR}"
    })
    int updateByPrimaryKey(Authority record);
}