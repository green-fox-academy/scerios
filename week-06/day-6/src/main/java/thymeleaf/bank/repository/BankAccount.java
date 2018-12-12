package thymeleaf.bank.repository;

public class BankAccount {
  private String name;
  private String animalType;
  public double balance;

  public BankAccount(String name, double balance, String animaltype) {
    this.name = name;
    this.balance = balance;
    this.animalType = animaltype;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAnimalType() {
    return animalType;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }
}
