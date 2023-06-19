package com.hnu.testProject.service.impl;

import com.hnu.testProject.service.HelloWorld;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldImpl implements HelloWorld {

  @Override
  public String func() {
    return "Hello World!";
  }
}
