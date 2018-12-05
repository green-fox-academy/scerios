package com.greenfoxacademy.springstart.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {

  @RequestMapping(value="/greetings")
  @ResponseBody
  public Greeting greeting(@RequestParam("name") String name) {
    return new Greeting(1, "Yarr " + name);
  }
}
