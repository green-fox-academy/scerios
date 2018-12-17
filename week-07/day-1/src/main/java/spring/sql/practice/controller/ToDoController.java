package spring.sql.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.sql.practice.services.ToDoServices;

@Controller
@RequestMapping("/")
public class ToDoController {
  public static ToDoServices services;

  @Autowired
  public ToDoController(ToDoServices services) {
    ToDoController.services = services;
  }

  @GetMapping({"/", "/list"})
  public String getList(Model model) {
    model.addAttribute("todos", services.getListOfToDos());
    return "todo";
  }
}
