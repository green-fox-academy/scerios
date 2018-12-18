package spring.sql.connections.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import spring.sql.connections.repository.ToDo;
import spring.sql.connections.service.ToDoServices;

import java.util.stream.Collectors;

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
      model.addAttribute("todos", services.filterIfIsNotDone());
    } else {
      model.addAttribute("todos", services.getListOfToDos());
    }
    return "todo";
  }

  @GetMapping("/active")
  public String activeTodos(@RequestParam(name = "isActive", required = false) Model model) {
    model.addAttribute("todos", services.filterIfIsNotDone()
        .stream()
        .filter(todo -> !todo.isDone())
        .collect(Collectors.toList()));
    return "todo";
  }

  @GetMapping("add")
  public String getAddWindow(Model model, @ModelAttribute(value = "todos") ToDo todos) {
    model.addAttribute("todos", todos);
    return "/add";
  }

  @PostMapping("add")
  public String addToDo(@ModelAttribute(value = "todos") ToDo todos) {
    services.addToDo(todos);
    return "redirect:/";
  }

  @GetMapping("/{id}/delete")
  public String deleteTodo(@PathVariable long id) {
    services.deleteTodo(id);
    return "redirect:/";
  }
}
