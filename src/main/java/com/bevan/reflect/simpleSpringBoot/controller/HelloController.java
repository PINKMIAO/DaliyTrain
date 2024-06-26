package com.bevan.reflect.simpleSpringBoot.controller;

import com.bevan.reflect.simpleSpringBoot.annotation.RequestMapping;
import com.bevan.reflect.simpleSpringBoot.annotation.RestController;

/**
 * @author Baven
 * @date 2024/6/12 23:18
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public void hello() {
        System.out.println("hello world");
    }
}
