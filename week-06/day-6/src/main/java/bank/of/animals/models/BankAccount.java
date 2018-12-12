package bank.of.animals.models;

public class BankAccount {
  private String name;
  private String animaltype;
  private double balance;

  public BankAccount(String name, double balance, String animaltype) {
    this.name = name;
    this.balance = balance;
    this.animaltype = animaltype;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAnimaltype() {
    return animaltype;
  }

  public void setAnimaltype(String animaltype) {
    this.animaltype = animaltype;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }
}
