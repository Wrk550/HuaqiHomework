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
    return helloWorld.func();
  }

}
