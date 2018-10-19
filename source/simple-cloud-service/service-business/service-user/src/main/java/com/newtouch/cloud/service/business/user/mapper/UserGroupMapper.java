package com.newtouch.cloud.service.business.user.mapper;

import com.newtouch.cloud.service.business.user.model.UserGroup;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserGroupMapper {
    @Delete({
            "delete from user_group",
            "where user_id = #{userId,jdbcType=CHAR}",
            "and group_id = #{groupId,jdbcType=CHAR}"
    })
    int deleteByPrimaryKey(@Param("userId") String userId, @Param("groupId") String groupId);

    @Insert({
            "insert into user_group (user_id, group_id)",
            "values (#{userId,jdbcType=CHAR}, #{groupId,jdbcType=CHAR})"
    })
    int insert(UserGroup record);

    int insertSelective(UserGroup record);
}