package com.greenfoxacademy.springstart.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {
  Greeting welcome = new Greeting(1, "Yarr!");

  @RequestMapping(value="/greetings")
  @ResponseBody
  public Greeting greeting() {
    return welcome;
  }
}
