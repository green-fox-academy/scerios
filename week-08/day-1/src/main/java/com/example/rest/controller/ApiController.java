package com.example.rest.controller;

import com.example.rest.model.AppendA;
import com.example.rest.model.ErrorMessage;
import com.example.rest.model.MyMath;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

  @GetMapping("/doubling")
  public Object doubling(@RequestParam Integer input) {
    if (input == null) {
      return new ErrorMessage().getMathMessage();
    }
    return new MyMath(input);
  }

  @GetMapping("greeter")
  public String greetingMessage(@RequestParam String name, String title) {
    if (name.equals("")) {
      return ErrorMessage.getNameMessage();
    } else if (title.equals("")) {
      return ErrorMessage.getTitleMessage();
    }
    return "Oh, hi there " + name + ", my dear " + title + "!";
  }

  @GetMapping("appenda/{appendable}")
  public Object appendA(@PathVariable String appendable) {
    return new AppendA(appendable);
  }

  @GetMapping("appenda")
  public String error() {
    return "404";
  }
}
