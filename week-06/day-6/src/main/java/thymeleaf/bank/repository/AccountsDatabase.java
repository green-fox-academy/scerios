package thymeleaf.bank.repository;

import java.util.ArrayList;

public class AccountsDatabase {
  ArrayList<BankAccount> listOfAccounts;
  private static AccountsDatabase instance;

  private AccountsDatabase() {
    this.listOfAccounts = new ArrayList<>();
    this.listOfAccounts.add(new BankAccount("Simba", 2000, "lion"));
  }

  public static AccountsDatabase getInstance() {
    if (AccountsDatabase.instance == null) {
      AccountsDatabase.instance = new AccountsDatabase();
    }
    return AccountsDatabase.instance;
  }

  public ArrayList<BankAccount> getListOfAccounts() {
    return this.listOfAccounts;
  }

  public void addAccount(BankAccount account) {
    this.listOfAccounts.add(account);
  }
}
