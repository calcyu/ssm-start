package com.seecen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/2/26.
 */
@Controller
public class HelloContoller {

    @RequestMapping("hello")
    public String hello() {
        return "hello";
    }
}
