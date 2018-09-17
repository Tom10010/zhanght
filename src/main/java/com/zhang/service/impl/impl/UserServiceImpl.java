package com.zhang.service.impl.impl;

import com.zhang.common.ServerResponse;
import com.zhang.mapper.UserMapper;
import com.zhang.pojo.User;
import com.zhang.service.impl.IUserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements IUserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public ServerResponse<User> checkUsername(String username, String password) {
        int resultCount = userMapper.checkUsername(username, password);
        if(resultCount == 0){
            return ServerResponse.createByErrorMessage("用户名或者密码错误");
        }
        User user = userMapper.selectByUsername(username);
        return ServerResponse.createBySuccess("登录成功", user);
    }

    public static void main(String[] args) {
        int a = 4;
        System.out.println("value is: " + ((a>4) ? 99.9 : 9));
    }

}
