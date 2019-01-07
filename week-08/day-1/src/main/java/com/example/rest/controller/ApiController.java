package com.example.rest.controller;

import com.example.rest.model.ErrorMessage;
import com.example.rest.model.MyMath;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

  @GetMapping("/doubling")
  public Object doubling(@RequestParam(defaultValue = "0") Integer input) {
    if (input == null || input.toString().equals("")) {
      return new ErrorMessage();
    }
    return new MyMath(input);
  }
}
