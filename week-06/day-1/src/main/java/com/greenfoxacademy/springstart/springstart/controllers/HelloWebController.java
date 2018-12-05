package com.greenfoxacademy.springstart.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {
  AtomicLong count = new AtomicLong(1);

  @RequestMapping("/web/greetings")
  public String greetings(@RequestParam("name")String name, Model model) {
    model.addAttribute("id", count.getAndIncrement());
    model.addAttribute("name", name);
    return "greetings";
  }
}
