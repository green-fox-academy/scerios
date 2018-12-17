package spring.sql.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/ToDo")
public class ToDoController {

  @GetMapping({"/", "/list"})
  @ResponseBody
  public String list() {
    return "This is my first ToDo.";
  }
}
