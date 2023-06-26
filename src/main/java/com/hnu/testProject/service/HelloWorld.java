package com.hnu.testProject.service;

import org.springframework.scheduling.annotation.Async;

public interface HelloWorld {
  public String func();

  @Async
  void test();
}
