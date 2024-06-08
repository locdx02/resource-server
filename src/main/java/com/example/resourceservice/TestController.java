package com.example.resourceservice;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @PostMapping("/test")
    public void test(){
        System.out.println("test");
    }

  @PostMapping("/test1")
    public void test1(){

      System.out.println(SecurityContextHolder.getContext().getAuthentication().getAuthorities());
        System.out.println("test1");
    }

}
