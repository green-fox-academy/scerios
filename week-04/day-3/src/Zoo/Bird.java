package Zoo;

import Fly.Flyable;

public class Bird extends Animal implements Flyable {
  public Bird(String name) {
    super.name = name;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public String breed() {
    return "laying eggs.";
  }

  @Override
  public void takeOff() {
    System.out.println("The " + name + " takes off.");
  }

  @Override
  public void fly() {
    System.out.println("The " + name + " flies.");
  }

  @Override
  public void land() {
    System.out.println("The " + name + " lands.");
  }
}
