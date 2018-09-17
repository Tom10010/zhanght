package com.zhang.mapper;

import com.zhang.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    int checkUsername(@Param("username") String username, @Param("password") String password);

    User selectByUsername(String username);
}