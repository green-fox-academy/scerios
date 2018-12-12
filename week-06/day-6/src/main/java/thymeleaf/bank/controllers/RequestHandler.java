package thymeleaf.bank.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import thymeleaf.bank.services.AccountController;

@Controller
public class RequestHandler {
  AccountController listOfAccounts = new AccountController();

  @RequestMapping("/show")
  public String showDetails(Model model) {
    model.addAttribute("account", listOfAccounts);
    return "show";
  }
}
