package thymeleaf.bank.controllers;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import thymeleaf.bank.repository.AccountsDatabase;
import thymeleaf.bank.repository.BankAccount;
import thymeleaf.bank.services.AccountController;

@Controller
public class RequestHandler {
  AccountController controller = new AccountController();

  @RequestMapping("/show")
  public String showDetails(Model model) {
    model.addAttribute("account", AccountsDatabase.getInstance().getListOfAccounts());
    return "show";
  }

  @PostMapping(value = "/add-account", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
  public String addNewAccount(@RequestBody MultiValueMap<String, String> account) {
    BankAccount bankAccount = new BankAccount(
        account.toSingleValueMap().get("name"),
        Float.parseFloat(account.toSingleValueMap().get("balance")),
        account.toSingleValueMap().get("animalType")
    );
    controller.addAccount(bankAccount);
    return "redirect:/show";
  }
}
