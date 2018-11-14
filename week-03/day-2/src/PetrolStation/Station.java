package PetrolStation;

public class Station {
  int gasAmount;

  public Station(int gasAmount) {
    this.gasAmount = gasAmount;
  }

  public int refill(Car car) {
    this.gasAmount -= car.capacity;
    car.gasAmount += car.capacity;
    return this.gasAmount;
  }

  public int fuelLevel() {
    return this.gasAmount;
  }
}
