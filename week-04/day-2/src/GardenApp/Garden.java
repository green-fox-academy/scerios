package GardenApp;

import java.util.ArrayList;

public class Garden {
  ArrayList<Plant> garden;

  public Garden() {
    garden = new ArrayList<>();
  }

  public void addPlant(Plant plant) {
    garden.add(plant);
  }

  public void check() {
    for (int i = 0; i < garden.size(); i++) {
      if (garden.get(i).needsWater()) {
        garden.get(i).checkStatus();
      }
    }
  }

  public void water (double waterAmount) {
    System.out.println("Watering with " + (int)waterAmount);


  }
}

