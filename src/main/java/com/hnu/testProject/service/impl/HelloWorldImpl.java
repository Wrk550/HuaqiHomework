package com.hnu.testProject.service.impl;

import com.hnu.testProject.service.HelloWorld;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldImpl implements HelloWorld {

  @Value("${user.out}")
  private String str;

  @Override
  public String func() {
    return str;
  }
}
