package spring.sql.connections.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import spring.sql.connections.service.ToDoServices;

@Controller
@RequestMapping("/")
public class ToDoController {
  public static ToDoServices services;

  @Autowired
  public ToDoController(ToDoServices services) {
    ToDoController.services = services;
  }

  @GetMapping({"/", "/list"})
  public String getList(Model model, @RequestParam(required = false) boolean isActive) {
    if (isActive) {
      model.addAttribute("todos", services.filterIfIsDone());
    } else {
      model.addAttribute("todos", services.getListOfToDos());
    }
    return "todo";
  }
}
