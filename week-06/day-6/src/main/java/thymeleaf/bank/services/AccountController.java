package thymeleaf.bank.services;

import thymeleaf.bank.repository.AccountsDatabase;
import thymeleaf.bank.repository.BankAccount;

import java.util.ArrayList;

public class AccountController {

  public void addAccount(BankAccount newAccount) {
    boolean isThereAccount = false;
    for (BankAccount existingAccount : AccountsDatabase.getInstance().getListOfAccounts()) {
      if (existingAccount.getName().equals(newAccount.getName())) {
        isThereAccount = true;
        existingAccount.balance += newAccount.balance;
      }
    }
    if (!isThereAccount) {
      AccountsDatabase.getInstance().addAccount(newAccount);
    }
  }

  public ArrayList<BankAccount> getBankAccounts() {
    return AccountsDatabase.getInstance().getListOfAccounts();
  }

  public BankAccount getBankAccount(String name) {
    for (BankAccount existingAccount : AccountsDatabase.getInstance().getListOfAccounts()) {
      if (existingAccount.getName() == name) {
        return existingAccount;
      }
    }
    return null;
  }
}
