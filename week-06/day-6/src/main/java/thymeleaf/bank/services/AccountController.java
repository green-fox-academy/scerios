package thymeleaf.bank.controllers;

import thymeleaf.bank.repository.BankAccount;

import java.util.ArrayList;

public class AccountController {
  ArrayList <BankAccount> listOfAccounts = new ArrayList<>();

  public AccountController() {
    listOfAccounts.add(new BankAccount("Simba", 2000, "lion"));
  }
}
