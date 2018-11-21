package GardenApp;

public class Plant {
  String color;
  double minimalWater;
  double waterlevel;
  double waterAbsorption;

  public Plant(String color) {
    this.color = color;
    this.waterlevel = 0;
  }

  public void setWaterAbsorption(double waterAbsorption) {
    this.waterAbsorption = waterAbsorption;
  }

  public void setMinimalWater(int minimalWater) {
    this.minimalWater = minimalWater;
  }

  public boolean needsWater() {
    if (waterlevel < minimalWater) {
      return true;
    } else {
      return false;
    }
  }

  public void watering(double waterAmount) {
    waterlevel += waterAmount * waterAbsorption;
  }

  public void checkStatus() {
    if (needsWater()) {
      System.out.println("The " + this.color + " " + getClass().getSimpleName() + " needs water.");
    } else {
      System.out.println("The " + this.color + " " + getClass().getSimpleName() + " doesn't need water.");
    }
  }
}
