package com.zhang.service.impl;

import com.zhang.common.ServerResponse;
import com.zhang.pojo.User;

public interface IUserService {
    ServerResponse<User> checkUsername(String username, String password);
}
