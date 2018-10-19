package com.newtouch.cloud.service.business.client.mapper;

import com.newtouch.cloud.service.business.client.model.ClientDetails;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface ClientDetailsMapper {
    @Delete({
        "delete from oauth_client_details",
        "where client_id = #{clientId,jdbcType=CHAR}"
    })
    int deleteByPrimaryKey(String clientId);

    @Insert({
        "insert into oauth_client_details (client_id, resource_ids, ",
        "client_secret, scope, ",
        "authorized_grant_types, web_server_redirect_uri, ",
        "authorities, access_token_validity, ",
        "refresh_token_validity, autoapprove, ",
        "additional_information)",
        "values (#{clientId,jdbcType=CHAR}, #{resourceIds,jdbcType=VARCHAR}, ",
        "#{clientSecret,jdbcType=VARCHAR}, #{scope,jdbcType=VARCHAR}, ",
        "#{authorizedGrantTypes,jdbcType=VARCHAR}, #{webServerRedirectUri,jdbcType=VARCHAR}, ",
        "#{authorities,jdbcType=VARCHAR}, #{accessTokenValidity,jdbcType=INTEGER}, ",
        "#{refreshTokenValidity,jdbcType=INTEGER}, #{autoapprove,jdbcType=VARCHAR}, ",
        "#{additionalInformation,jdbcType=LONGVARCHAR})"
    })
    int insert(ClientDetails record);

    int insertSelective(ClientDetails record);

    @Select({
        "select",
        "client_id, resource_ids, client_secret, scope, authorized_grant_types, web_server_redirect_uri, ",
        "authorities, access_token_validity, refresh_token_validity, autoapprove, additional_information",
        "from oauth_client_details",
        "where client_id = #{clientId,jdbcType=CHAR}"
    })
    @ResultMap("com.newtouch.cloud.service.business.client.mapper.ClientDetailsMapper.ResultMapWithBLOBs")
    ClientDetails selectByPrimaryKey(String clientId);

    int updateByPrimaryKeySelective(ClientDetails record);

    @Update({
        "update oauth_client_details",
        "set resource_ids = #{resourceIds,jdbcType=VARCHAR},",
          "client_secret = #{clientSecret,jdbcType=VARCHAR},",
          "scope = #{scope,jdbcType=VARCHAR},",
          "authorized_grant_types = #{authorizedGrantTypes,jdbcType=VARCHAR},",
          "web_server_redirect_uri = #{webServerRedirectUri,jdbcType=VARCHAR},",
          "authorities = #{authorities,jdbcType=VARCHAR},",
          "access_token_validity = #{accessTokenValidity,jdbcType=INTEGER},",
          "refresh_token_validity = #{refreshTokenValidity,jdbcType=INTEGER},",
          "autoapprove = #{autoapprove,jdbcType=VARCHAR},",
          "additional_information = #{additionalInformation,jdbcType=LONGVARCHAR}",
        "where client_id = #{clientId,jdbcType=CHAR}"
    })
    int updateByPrimaryKeyWithBLOBs(ClientDetails record);

    @Update({
        "update oauth_client_details",
        "set resource_ids = #{resourceIds,jdbcType=VARCHAR},",
          "client_secret = #{clientSecret,jdbcType=VARCHAR},",
          "scope = #{scope,jdbcType=VARCHAR},",
          "authorized_grant_types = #{authorizedGrantTypes,jdbcType=VARCHAR},",
          "web_server_redirect_uri = #{webServerRedirectUri,jdbcType=VARCHAR},",
          "authorities = #{authorities,jdbcType=VARCHAR},",
          "access_token_validity = #{accessTokenValidity,jdbcType=INTEGER},",
          "refresh_token_validity = #{refreshTokenValidity,jdbcType=INTEGER},",
          "autoapprove = #{autoapprove,jdbcType=VARCHAR}",
        "where client_id = #{clientId,jdbcType=CHAR}"
    })
    int updateByPrimaryKey(ClientDetails record);
}