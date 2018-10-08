package com.newtouch.cloud.service.business.user.mapper;

import com.newtouch.cloud.service.business.user.model.UserProfile;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface UserProfileMapper {
    @Delete({
        "delete from user_profile",
        "where user_id = #{userId,jdbcType=CHAR}"
    })
    int deleteByPrimaryKey(String userId);

    @Insert({
        "insert into user_profile (user_id, real_name, ",
        "avatar, sex, age, ",
        "mobile, email, create_time, ",
        "update_time)",
        "values (#{userId,jdbcType=CHAR}, #{realName,jdbcType=VARCHAR}, ",
        "#{avatar,jdbcType=VARCHAR}, #{sex,jdbcType=CHAR}, #{age,jdbcType=INTEGER}, ",
        "#{mobile,jdbcType=VARCHAR}, #{email,jdbcType=VARCHAR}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP})"
    })
    int insert(UserProfile record);

    int insertSelective(UserProfile record);

    @Select({
        "select",
        "user_id, real_name, avatar, sex, age, mobile, email, create_time, update_time",
        "from user_profile",
        "where user_id = #{userId,jdbcType=CHAR}"
    })
    @ResultMap("com.newtouch.cloud.service.business.user.mapper.UserProfileMapper.BaseResultMap")
    UserProfile selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(UserProfile record);

    @Update({
        "update user_profile",
        "set real_name = #{realName,jdbcType=VARCHAR},",
          "avatar = #{avatar,jdbcType=VARCHAR},",
          "sex = #{sex,jdbcType=CHAR},",
          "age = #{age,jdbcType=INTEGER},",
          "mobile = #{mobile,jdbcType=VARCHAR},",
          "email = #{email,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where user_id = #{userId,jdbcType=CHAR}"
    })
    int updateByPrimaryKey(UserProfile record);
}