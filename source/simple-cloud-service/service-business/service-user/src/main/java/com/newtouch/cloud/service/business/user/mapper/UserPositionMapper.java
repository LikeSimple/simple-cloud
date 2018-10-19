package com.newtouch.cloud.service.business.user.mapper;

import com.newtouch.cloud.service.business.user.model.UserPosition;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserPositionMapper {
    @Delete({
            "delete from user_position",
            "where user_id = #{userId,jdbcType=CHAR}",
            "and position_id = #{positionId,jdbcType=CHAR}"
    })
    int deleteByPrimaryKey(@Param("userId") String userId, @Param("positionId") String positionId);

    @Insert({
            "insert into user_position (user_id, position_id)",
            "values (#{userId,jdbcType=CHAR}, #{positionId,jdbcType=CHAR})"
    })
    int insert(UserPosition record);

    int insertSelective(UserPosition record);
}