package com.az.complex.core.auth.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class UserController {

    @GetMapping(value = "hello")
    public String hello() {
        log.error("error");
        log.debug("debug");
        log.info("info");
        log.warn("warn");
        return "hello";
    }

}
