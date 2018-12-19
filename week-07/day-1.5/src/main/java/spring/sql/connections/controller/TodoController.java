package spring.sql.connections.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import spring.sql.connections.model.Todo;
import spring.sql.connections.service.TodoServices;

import java.util.stream.Collectors;

@Controller
@RequestMapping("/")
public class TodoController {
  private static TodoServices services;

  @Autowired
  public TodoController(TodoServices services) {
    TodoController.services = services;
  }

  @GetMapping({"/", "/list"})
  public String getList(Model model, @RequestParam(required = false) boolean isActive) {
    if (isActive) {
      model.addAttribute("todo", services.filterIfIsNotDone());
    } else {
      model.addAttribute("todo", services.getListOfToDos());
    }
    return "todo";
  }

  @GetMapping("/active")
  public String activeTodos(@RequestParam(name = "isActive", required = false) boolean isActive, Model model) {
    model.addAttribute("todo", services.filterIfIsNotDone()
        .stream()
        .filter(todo -> !todo.isDone())
        .collect(Collectors.toList()));
    return "todo";
  }

  @GetMapping("search")
  public String search( Model model, @RequestParam ("search") String search) {
    model.addAttribute("todo", services.search(search));
    return "todo";
  }

  @GetMapping("add")
  public String getAddWindow(Model model, @ModelAttribute(value = "todo") Todo todo) {
    model.addAttribute("todo", todo);
    return "/add";
  }

  @PostMapping("add")
  public String addToDo(@ModelAttribute("todo") Todo todo) {
    services.addToDo(todo);
    return "redirect:/";
  }

  @GetMapping("/{id}/delete")
  public String deleteTodo(@PathVariable long id) {
    services.deleteTodo(id);
    return "redirect:/";
  }

  @GetMapping("/{id}/edit")
  public String getEditWindow(Model model, @PathVariable long id) {
    model.addAttribute("todo", services.getToDoByID(id));
    return "edit";
  }

  @PostMapping("/{id}/edit")
  public String editToDo(@ModelAttribute("todo") Todo todo) {
    services.addToDo(todo);
    return "redirect:/";
  }
}