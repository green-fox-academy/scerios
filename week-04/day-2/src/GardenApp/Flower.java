package GardenApp;

public class Flower extends Plant {

  Flower(String color) {
    super(color);
    setWaterAbsorption(0.75);
    setMinimalWater(5);
  }
}
