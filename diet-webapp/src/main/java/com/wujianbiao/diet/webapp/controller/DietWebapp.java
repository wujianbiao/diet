package com.wujianbiao.diet.webapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Desc
 * @Author wujianbiao
 * @CreateTime 2022/8/26 11:29 AM
 **/
@RestController
@RequestMapping(value = "/diet")
public class DietWebapp {

    @GetMapping("test")
//    @AccessControl
    public String test() {
        return "Hello World!";
    }
}
