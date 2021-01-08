package com.example.member.mapper;

import com.example.domin.DO.UserEntityDO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

/**
 * @author Administrator
 * @title: UserMapper
 * @projectName MyProject
 * @description: TODO
 * @date 2020/2/2518:51
 */
public interface UserMapper {
    @Insert("INSERT INTO example_user VALUES (null,#{mobile}, #{email}, #{password}, #{username}, null, null, #{createTime}, #{updateTime},'1', null, null, null);")
    int register(UserEntityDO userDo);

    @Select("SELECT * FROM example_user WHERE mobile=#{mobile};")
    UserEntityDO existMobile(String mobile);

    @Select("SELECT * FROM example_user  WHERE mobile=#{mobile} and password=#{password};")
    UserEntityDO login(String mobile, String password);

    @Select("SELECT * FROM example_user WHERE user_id=#{userId}")
    UserEntityDO findByUserId(Long userId);

    @Select("SELECT userId FROM example_user WHERE mobile=#{mobile}")
    Long getUserIdByMobile(String mobile);
}