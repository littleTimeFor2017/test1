package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: TestController
 * @description: jenkins测试接口
 * @Author: Wilson
 * @createTime 2020/8/5 14:16
 */
@RestController
public class TestController {

    @RequestMapping("/test")
    public String test() {
        return "1234";
    }
}
