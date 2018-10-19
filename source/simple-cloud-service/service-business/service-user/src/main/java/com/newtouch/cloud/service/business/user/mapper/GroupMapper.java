package com.newtouch.cloud.service.business.user.mapper;

import com.newtouch.cloud.service.business.user.model.Group;
import org.apache.ibatis.annotations.*;

@Mapper
public interface GroupMapper {
    @Delete({
            "delete from group",
            "where id = #{id,jdbcType=CHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
            "insert into group (id, name, description, ",
            "create_time, update_time)",
            "values (#{id,jdbcType=CHAR}, #{name,jdbcType=VARCHAR}, #{description,jdbcType=VARCHAR}, ",
            "#{createTime,jdbcType=TIMESTAMP}, #{updateTime,jdbcType=TIMESTAMP})"
    })
    int insert(Group record);

    int insertSelective(Group record);

    @Select({
            "select",
            "id, name, description, create_time, update_time",
            "from group",
            "where id = #{id,jdbcType=CHAR}"
    })
    @ResultMap("com.newtouch.cloud.service.business.user.mapper.GroupMapper.BaseResultMap")
    Group selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Group record);

    @Update({
            "update group",
            "set name = #{name,jdbcType=VARCHAR},",
            "description = #{description,jdbcType=VARCHAR},",
            "create_time = #{createTime,jdbcType=TIMESTAMP},",
            "update_time = #{updateTime,jdbcType=TIMESTAMP}",
            "where id = #{id,jdbcType=CHAR}"
    })
    int updateByPrimaryKey(Group record);
}