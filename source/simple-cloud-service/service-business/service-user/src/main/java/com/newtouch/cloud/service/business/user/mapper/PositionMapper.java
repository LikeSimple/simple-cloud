package com.newtouch.cloud.service.business.user.mapper;

import com.newtouch.cloud.service.business.user.model.Position;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface PositionMapper {
    @Delete({
        "delete from position",
        "where id = #{id,jdbcType=CHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into position (id, department_id, ",
        "name, node_level, create_time, ",
        "update_time)",
        "values (#{id,jdbcType=CHAR}, #{departmentId,jdbcType=CHAR}, ",
        "#{name,jdbcType=VARCHAR}, #{nodeLevel,jdbcType=CHAR}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP})"
    })
    int insert(Position record);

    int insertSelective(Position record);

    @Select({
        "select",
        "id, department_id, name, node_level, create_time, update_time",
        "from position",
        "where id = #{id,jdbcType=CHAR}"
    })
    @ResultMap("com.newtouch.cloud.service.business.user.mapper.PositionMapper.BaseResultMap")
    Position selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Position record);

    @Update({
        "update position",
        "set department_id = #{departmentId,jdbcType=CHAR},",
          "name = #{name,jdbcType=VARCHAR},",
          "node_level = #{nodeLevel,jdbcType=CHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=CHAR}"
    })
    int updateByPrimaryKey(Position record);
}