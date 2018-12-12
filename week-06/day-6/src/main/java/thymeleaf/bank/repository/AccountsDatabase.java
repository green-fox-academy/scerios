package thymeleaf.bank.repository;

import java.util.ArrayList;

public class AccountsDatabase {
  ArrayList<BankAccount> listOfAccounts;
  private static AccountsDatabase instance;

  private AccountsDatabase() {
    this.listOfAccounts = new ArrayList<>();
    this.listOfAccounts.add(new BankAccount("Simba", 2000, "lion", "Good One"));
    this.listOfAccounts.add(new BankAccount("Timon", 150, "meerkat", "Bad Guy"));
    this.listOfAccounts.add(new BankAccount("Pumbaa", 100, "warthog", "Bad Guy"));
    this.listOfAccounts.add(new BankAccount("Zazu", 650, "hornbill", "Good One"));
    this.listOfAccounts.add(new BankAccount("Rafiki", 10, "mandrill", "Good One"));
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
