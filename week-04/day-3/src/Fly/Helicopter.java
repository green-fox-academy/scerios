package Fly;

public class Helicopter extends Vehicle implements Flyable {
  Helicopter(String color, int weightInKG, boolean isAbleToFly) {
    super.color = color;
    super.weightInKG = weightInKG;
    super.isAbleToFly = isAbleToFly;
  }
  @Override
  public void takeOff() {
    if (isAbleToFly) {
      System.out.println("The " + color + " helicopter takes off.");
    } else {
      System.out.println("The " + color + " helicopter cannot fly.");
    }
  }

  @Override
  public void fly() {
    if (isAbleToFly) {
      System.out.println("The " + color + " helicopter flies.");
    } else {
      System.out.println("The " + color + " helicopter cannot fly.");
    }
  }

  @Override
  public void land() {
    if (isAbleToFly) {
      System.out.println("The " + color + " helicopter lands.");
    } else {
      System.out.println("The " + color + " helicopter cannot fly.");
    }
  }
}
