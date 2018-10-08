package com.newtouch.cloud.service.business.user.mapper;

import com.newtouch.cloud.service.business.user.model.Department;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface DepartmentMapper {
    @Delete({
        "delete from department",
        "where id = #{id,jdbcType=CHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into department (id, corporation_id, ",
        "name, node_level, create_time, ",
        "update_time)",
        "values (#{id,jdbcType=CHAR}, #{corporationId,jdbcType=CHAR}, ",
        "#{name,jdbcType=VARCHAR}, #{nodeLevel,jdbcType=CHAR}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP})"
    })
    int insert(Department record);

    int insertSelective(Department record);

    @Select({
        "select",
        "id, corporation_id, name, node_level, create_time, update_time",
        "from department",
        "where id = #{id,jdbcType=CHAR}"
    })
    @ResultMap("com.newtouch.cloud.service.business.user.mapper.DepartmentMapper.BaseResultMap")
    Department selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Department record);

    @Update({
        "update department",
        "set corporation_id = #{corporationId,jdbcType=CHAR},",
          "name = #{name,jdbcType=VARCHAR},",
          "node_level = #{nodeLevel,jdbcType=CHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=CHAR}"
    })
    int updateByPrimaryKey(Department record);
}