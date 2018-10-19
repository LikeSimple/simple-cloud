package com.newtouch.cloud.service.business.user.mapper;

import com.newtouch.cloud.service.business.user.model.User;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserMapper {
    @Delete({
            "delete from user",
            "where id = #{id,jdbcType=CHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
            "insert into user (id, username, ",
            "password, locked, enabled, ",
            "account_expire, credential_expire, ",
            "create_time, update_time)",
            "values (#{id,jdbcType=CHAR}, #{username,jdbcType=VARCHAR}, ",
            "#{password,jdbcType=CHAR}, #{locked,jdbcType=BIT}, #{enabled,jdbcType=BIT}, ",
            "#{accountExpire,jdbcType=TIMESTAMP}, #{credentialExpire,jdbcType=TIMESTAMP}, ",
            "#{createTime,jdbcType=TIMESTAMP}, #{updateTime,jdbcType=TIMESTAMP})"
    })
    int insert(User record);

    int insertSelective(User record);

    @Select({
            "select",
            "id, username, password, locked, enabled, account_expire, credential_expire, ",
            "create_time, update_time",
            "from user",
            "where id = #{id,jdbcType=CHAR}"
    })
    @ResultMap("com.newtouch.cloud.service.business.user.mapper.UserMapper.BaseResultMap")
    User selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(User record);

    @Update({
            "update user",
            "set username = #{username,jdbcType=VARCHAR},",
            "password = #{password,jdbcType=CHAR},",
            "locked = #{locked,jdbcType=BIT},",
            "enabled = #{enabled,jdbcType=BIT},",
            "account_expire = #{accountExpire,jdbcType=TIMESTAMP},",
            "credential_expire = #{credentialExpire,jdbcType=TIMESTAMP},",
            "create_time = #{createTime,jdbcType=TIMESTAMP},",
            "update_time = #{updateTime,jdbcType=TIMESTAMP}",
            "where id = #{id,jdbcType=CHAR}"
    })
    int updateByPrimaryKey(User record);
}