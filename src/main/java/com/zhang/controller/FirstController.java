package com.zhang.controller;


import com.zhang.common.ServerResponse;
import com.zhang.pojo.User;
import com.zhang.service.impl.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/aaa")
@Slf4j
public class FirstController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/bbb")
    public String first(){
        return "login";
    }

    @RequestMapping("/ccc")
    @ResponseBody
    public ServerResponse<User> second(String username, String password) {
        log.info("this is second method: {}, {}", username, password);
        log.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        return userService.checkUsername(username, password);
    }


}
