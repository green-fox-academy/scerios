package thymeleaf.bank.repository;

public class BankAccount {
  private String name;
  private String animalType;
  public float balance;
  private boolean isKing = false;

  public BankAccount(String name, float balance, String animalType) {
    if (animalType.equals("lion")) {
      isKing = true;
    }
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
  }

  public String getName() {
    return name;
  }

  public String getAnimalType() {
    return animalType;
  }

  public boolean isKing() {
    return isKing;
  }

  public float getBalance() {
    return balance;
  }
}
