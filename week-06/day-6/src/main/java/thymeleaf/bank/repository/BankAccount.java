package thymeleaf.bank.repository;

public class BankAccount {
  private String name;
  private String animalType;
  public float balance;
  private String formattedBalance;
  private String balanceWithCurrency;
  private boolean isKing = false;

  public BankAccount(String name, float balance, String animalType) {
    if (animalType == "lion") {
      isKing = true;
    }
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.formattedBalance = String.format("%.02f", balance);
    this.balanceWithCurrency = formattedBalance + " Zebra";
  }

  public String getName() {
    return name;
  }

  public String getAnimalType() {
    return animalType;
  }

  public String getBalanceWithCurrency() {
    return balanceWithCurrency;
  }

  public boolean isKing() {
    return isKing;
  }
}
