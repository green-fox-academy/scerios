package thymeleaf.bank.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import thymeleaf.bank.repository.AccountsDatabase;
import thymeleaf.bank.repository.BankAccount;

@Controller
public class RequestHandler {

  @RequestMapping("/show")
  public String showDetails(Model model) {
    model.addAttribute("account", AccountsDatabase.getInstance().getListOfAccounts());
    return "show";
  }

  @RequestMapping("/swanky")
  public String showSwanky(Model model) {
    model.addAttribute("swanky", BankAccount.swanky);
    return "show";
  }
}
