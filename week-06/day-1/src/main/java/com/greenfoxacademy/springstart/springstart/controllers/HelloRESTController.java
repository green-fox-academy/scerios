package com.greenfoxacademy.springstart.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {
  AtomicLong counter = new AtomicLong(1);

  @RequestMapping(value="/greetings")
  @ResponseBody
  public Greeting greeting(@RequestParam("name") String name) {
    return new Greeting(counter.getAndIncrement(), "Yarr " + name);
  }
}
