package com.example.rest.controller;

import com.example.rest.model.*;
import org.springframework.web.bind.annotation.*;

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

  @PostMapping("dountil/{action}")
  public Result doUntil(@PathVariable String action, @RequestBody DoUntil doUntil) {
    Result result = doUntil.getResult(action);
    return result;
  }

}
