package thymeleaf.bank.services;

import thymeleaf.bank.repository.AccountsDatabase;
import thymeleaf.bank.repository.BankAccount;

import java.util.ArrayList;

public class AccountController {

  public void addAccount(BankAccount account) {
    boolean isThereAccount = false;
    for (BankAccount bankAccount : AccountsDatabase.getInstance().getListOfAccounts()) {
      if (bankAccount.getName() == account.getName()) {
        isThereAccount = true;
        bankAccount.balance += account.balance;
      }
    }
    if (!isThereAccount) {
      AccountsDatabase.getInstance().addAccount(account);
    }
  }

  public ArrayList<BankAccount> getBankAccounts() {
    return AccountsDatabase.getInstance().getListOfAccounts();
  }

  public BankAccount getBankAccount(String name) {
    for (BankAccount bankAccount : AccountsDatabase.getInstance().getListOfAccounts()) {
      if (bankAccount.getName() == name) {
        return bankAccount;
      }
    }
    return null;
  }
}
