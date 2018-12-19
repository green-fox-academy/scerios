package spring.sql.connections.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.sql.connections.service.AssigneeServices;

@Controller
@RequestMapping("/assignees")
public class AssigneeController {
  private static AssigneeServices services;

  @Autowired
  public AssigneeController(AssigneeServices services) {
    AssigneeController.services = services;
  }

  @GetMapping("/")
  public String getListOfAssignees(Model model) {
    model.addAttribute("assignee", services.getListOfAssignees());
    return "assignees";
  }
}
