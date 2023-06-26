package com.hnu.testProject.controller;

import com.hnu.testProject.service.HelloWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
  @Autowired
  HelloWorld helloWorld;

  @GetMapping("/hello")
  public String helloWorld() {
    System.out.println("ThreadName:" + Thread.currentThread().getName());
    System.out.println("开始执行test");
    helloWorld.test();
    System.out.println(Thread.currentThread().getName() + "执行完毕");
    return "result";
  }

}
