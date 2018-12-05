package com.greenfoxacademy.springstart.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWebController {

  @RequestMapping("/web/greetings")
  public String greetings(@RequestParam("name")String name, Model model) {
    int random = (int) (Math.random() * Greeting.hellos.length);
    model.addAttribute("Hello", Greeting.hellos[random]);
    model.addAttribute("id", Greeting.counter.getAndIncrement());
    model.addAttribute("name", name);
    return "greetings";
  }
}
