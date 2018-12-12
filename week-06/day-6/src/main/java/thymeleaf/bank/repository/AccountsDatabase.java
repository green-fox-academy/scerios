package thymeleaf.bank.repository;

import java.util.ArrayList;

public class AccountsDatabase {
  ArrayList<BankAccount> listOfAccounts;
  private static AccountsDatabase instance;

  private AccountsDatabase() {
    this.listOfAccounts = new ArrayList<>();
    this.listOfAccounts.add(new BankAccount("Simba", 2000, "lion"));
    this.listOfAccounts.add(new BankAccount("Timon", 150, "meerkat"));
    this.listOfAccounts.add(new BankAccount("Pumbaa", 100, "warthog"));
    this.listOfAccounts.add(new BankAccount("Zazu", 650, "hornbill"));
    this.listOfAccounts.add(new BankAccount("Rafiki", 10, "mandrill"));
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
