package thymeleaf.bank.repository;

public class BankAccount {
  private String name;
  private String animalType;
  public float balance;
  private String formattedBalance;
  private String balanceWithCurrency;
  public static String swanky = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";

  public BankAccount(String name, float balance, String animaltype) {
    this.name = name;
    this.balance = balance;
    this.animalType = animaltype;
    this.formattedBalance = String.format("%.02f", balance);
    this.balanceWithCurrency = formattedBalance + " Zebra";
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

  public void setBalance(float balance) {
    this.balance = balance;
  }

  public String getBalanceWithCurrency() {
    return balanceWithCurrency;
  }

  public void setBalanceWitCurrency(String balanceWitCurrency) {
    this.balanceWithCurrency = balanceWitCurrency;
  }
}
