package thymeleaf.bank.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RequestHandler {

  @RequestMapping("/show")
  public String showDetails(Model model) {
    model.addAttribute("account", AccountController.listOfAccounts);
    return "show";
  }
}
