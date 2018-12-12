package bank.of.animals.controllers;

import bank.of.animals.models.BankAccount;
import java.util.ArrayList;

public class AccountController {
  static ArrayList <BankAccount> listOfAccounts = new ArrayList<>();

  public AccountController() {
    listOfAccounts.add(new BankAccount("Simba", 2000, "lion"));
  }
}
