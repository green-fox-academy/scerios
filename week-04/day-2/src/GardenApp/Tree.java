package GardenApp;

public class Tree extends Plant {

  Tree(String color) {
    super(color);
    setWaterAbsorption(0.4);
    setMinimalWater(10);
  }
}
