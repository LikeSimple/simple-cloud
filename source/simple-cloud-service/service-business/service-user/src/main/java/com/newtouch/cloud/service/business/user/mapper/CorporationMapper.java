package com.newtouch.cloud.service.business.user.mapper;

import com.newtouch.cloud.service.business.user.model.Corporation;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface CorporationMapper {
    @Delete({
        "delete from corporation",
        "where id = #{id,jdbcType=CHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into corporation (id, name, type, ",
        "node_level, create_time, ",
        "update_time)",
        "values (#{id,jdbcType=CHAR}, #{name,jdbcType=VARCHAR}, #{type,jdbcType=VARCHAR}, ",
        "#{nodeLevel,jdbcType=CHAR}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP})"
    })
    int insert(Corporation record);

    int insertSelective(Corporation record);

    @Select({
        "select",
        "id, name, type, node_level, create_time, update_time",
        "from corporation",
        "where id = #{id,jdbcType=CHAR}"
    })
    @ResultMap("com.newtouch.cloud.service.business.user.mapper.CorporationMapper.BaseResultMap")
    Corporation selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Corporation record);

    @Update({
        "update corporation",
        "set name = #{name,jdbcType=VARCHAR},",
          "type = #{type,jdbcType=VARCHAR},",
          "node_level = #{nodeLevel,jdbcType=CHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=CHAR}"
    })
    int updateByPrimaryKey(Corporation record);
}