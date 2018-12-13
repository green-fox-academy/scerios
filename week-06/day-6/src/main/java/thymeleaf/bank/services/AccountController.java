package thymeleaf.bank.services;

import thymeleaf.bank.repository.AccountsDatabase;
import thymeleaf.bank.repository.BankAccount;

import java.util.ArrayList;

public class AccountController {

  public void addAccount(BankAccount newAccount) {
    for (BankAccount existingAccount : AccountsDatabase.getInstance().getListOfAccounts()) {
      if (existingAccount.getName().equals(newAccount.getName())) {
        existingAccount.balance += newAccount.balance;
        return;
      }
    }
    AccountsDatabase.getInstance().addAccount(newAccount);
  }

  public ArrayList<BankAccount> getBankAccounts() {
    return AccountsDatabase.getInstance().getListOfAccounts();
  }

  public BankAccount getBankAccount(String name) {
    for (BankAccount existingAccount : AccountsDatabase.getInstance().getListOfAccounts()) {
      if (existingAccount.getName().equals(name)) {
        return existingAccount;
      }
    }
    return null;
  }
}
