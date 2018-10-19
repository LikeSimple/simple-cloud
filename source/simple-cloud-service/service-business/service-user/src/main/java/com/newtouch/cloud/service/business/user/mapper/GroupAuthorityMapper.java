package com.newtouch.cloud.service.business.user.mapper;

import com.newtouch.cloud.service.business.user.model.GroupAuthority;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface GroupAuthorityMapper {
    @Delete({
            "delete from group_authority",
            "where group_id = #{groupId,jdbcType=CHAR}",
            "and authority_id = #{authorityId,jdbcType=CHAR}"
    })
    int deleteByPrimaryKey(@Param("groupId") String groupId, @Param("authorityId") String authorityId);

    @Insert({
            "insert into group_authority (group_id, authority_id)",
            "values (#{groupId,jdbcType=CHAR}, #{authorityId,jdbcType=CHAR})"
    })
    int insert(GroupAuthority record);

    int insertSelective(GroupAuthority record);
}