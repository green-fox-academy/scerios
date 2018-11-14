package PetrolStation;

public class Car {
  int gasAmount;
  int capacity;

  public Car() {
    this.gasAmount = 0;
    this.capacity = 100;
  }

  public int fuelLevel() {
    return this.gasAmount;
  }
}
