package thymeleaf.bank.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import thymeleaf.bank.repository.AccountsDatabase;

@Controller
public class RequestHandler {

  @RequestMapping("/show")
  public String showDetails(Model model) {
    model.addAttribute("account", AccountsDatabase.getInstance().getListOfAccounts());
    return "show";
  }
}
