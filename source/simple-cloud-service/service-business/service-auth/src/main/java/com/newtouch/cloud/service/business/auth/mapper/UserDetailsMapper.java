package com.newtouch.cloud.service.business.auth.mapper;

import com.newtouch.cloud.service.business.auth.model.UserDetails;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface UserDetailsMapper {
    @Delete({
        "delete from user_details",
        "where id = #{id,jdbcType=CHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into user_details (id, username, ",
        "password, locked, enabled, ",
        "account_expire, credential_expire)",
        "values (#{id,jdbcType=CHAR}, #{username,jdbcType=VARCHAR}, ",
        "#{password,jdbcType=CHAR}, #{locked,jdbcType=BIT}, #{enabled,jdbcType=BIT}, ",
        "#{accountExpire,jdbcType=TIMESTAMP}, #{credentialExpire,jdbcType=TIMESTAMP})"
    })
    int insert(UserDetails record);

    int insertSelective(UserDetails record);

    @Select({
        "select",
        "id, username, password, locked, enabled, account_expire, credential_expire",
        "from user_details",
        "where id = #{id,jdbcType=CHAR}"
    })
    @ResultMap("com.newtouch.cloud.service.business.auth.mapper.UserDetailsMapper.BaseResultMap")
    UserDetails selectByPrimaryKey(String id);

    @Select({
            "select",
            "id, username, password, locked, enabled, account_expire, credential_expire",
            "from user_details",
            "where username = #{username,jdbcType=VARCHAR}"
    })
    @ResultMap("com.newtouch.cloud.service.business.auth.mapper.UserDetailsMapper.BaseResultMap")
    UserDetails selectByUsername(String username);


    int updateByPrimaryKeySelective(UserDetails record);

    @Update({
        "update user_details",
        "set username = #{username,jdbcType=VARCHAR},",
          "password = #{password,jdbcType=CHAR},",
          "locked = #{locked,jdbcType=BIT},",
          "enabled = #{enabled,jdbcType=BIT},",
          "account_expire = #{accountExpire,jdbcType=TIMESTAMP},",
          "credential_expire = #{credentialExpire,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=CHAR}"
    })
    int updateByPrimaryKey(UserDetails record);
}