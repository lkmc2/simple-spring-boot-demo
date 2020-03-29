package com.lin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 示范Controller
 * @author lkmc2
 * @date 2020/3/29 10:45
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

}
