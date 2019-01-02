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
  private TodoServices todoServices;

  @Autowired
  public TodoController(TodoServices todoServices) {
    this.todoServices = todoServices;
  }

  @GetMapping({"/", "/list"})
  public String getList(Model model, @RequestParam(required = false) boolean isActive) {
    if (isActive) {
      model.addAttribute("todo", todoServices.filterIfIsNotDone());
    } else {
      model.addAttribute("todo", todoServices.getListOfTodos());
    }
    return "todo";
  }

  @GetMapping("/active")
  public String activeTodos(Model model) {
    model.addAttribute("todo", todoServices.filterIfIsNotDone()
        .stream()
        .filter(todo -> !todo.isDone())
        .collect(Collectors.toList()));
    return "todo";
  }

  @GetMapping("search")
  public String search(Model model, @RequestParam("search") String search) {
    model.addAttribute("todo", todoServices.search(search));
    return "todo";
  }

  @GetMapping("add")
  public String getAddWindow(Model model) {
    model.addAttribute("todo", new Todo());
    return "/add";
  }

  @PostMapping("add")
  public String addTodo(@ModelAttribute Todo todo) {
    todoServices.addTodo(todo);
    return "redirect:/";
  }

  @GetMapping("/{id}/delete")
  public String deleteTodo(@PathVariable long id) {
    todoServices.deleteTodo(id);
    return "redirect:/";
  }

  @GetMapping("/{id}/edit")
  public String getEditWindow(Model model, @PathVariable long id) {
    model.addAttribute("todo", todoServices.getTodoByID(id));
    return "edit";
  }

  @PostMapping("/{id}/edit")
  public String editToDo(@ModelAttribute Todo todo) {
    todoServices.addTodo(todo);
    return "redirect:/";
  }
}
