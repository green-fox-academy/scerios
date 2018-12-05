package com.greenfoxacademy.springstart.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWebController {

  @RequestMapping("/web/greetings")
  public String greetings(Model model) {
    model.addAttribute("name", " World");
    return "greetings";
  }
}
