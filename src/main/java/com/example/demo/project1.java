package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
public class project1 {

    @Controller
    public static class Demo4 {
        @RequestMapping("/")
        @ResponseBody
//        public String demo4() {
//            return "hello world";
//        }
        @GetMapping("/")
        public float Demo(@RequestParam(value = "q") float q) {
            return q;
        }
    }
}
