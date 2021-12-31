package com.az.complex.core.auth.controller;

import com.az.complex.core.auth.entity.User;
import com.az.complex.core.auth.service.UserService;
import com.az.complex.core.common.response.Result;
import com.az.complex.core.common.response.ResultCode;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class UserController {

    final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "hello")
    public String hello() {
        log.error("error");
        log.debug("debug");
        log.info("info");
        log.warn("warn");
        return "hello";
    }

    @PostMapping(value = "login")
    public Result login(@RequestBody User user) {
        User userData = userService.getOne(new QueryWrapper<User>().eq("username", user.getUsername()).eq("password", user.getPassword()));
        if (userData == null) {
            return new Result(ResultCode.NO_DATA_FOUND);
        }
        return new Result(ResultCode.SUCCESS, userData);
    }

}
