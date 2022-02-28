package com.test;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class TestController {
    @GetMapping
    public String test(@RequestParam("name") String name) {
        System.out.println("Called Test1 " + name);
        return "welcome ere";
    }

    @GetMapping("/1")
    public String test2() {
        System.out.println("Called Test2");
        return "welcome ere";
    }
}
