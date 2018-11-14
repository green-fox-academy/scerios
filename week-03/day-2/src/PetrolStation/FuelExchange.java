package PetrolStation;

public class FuelExchange {

  public static void main(String[] args) {
    Car seat = new Car();
    Station omw = new Station(1000);

    System.out.println(omw.fuelLevel());
    System.out.println(seat.fuelLevel());

    omw.refill(seat);

    System.out.println(omw.fuelLevel());
    System.out.println(seat.fuelLevel());
  }
}
