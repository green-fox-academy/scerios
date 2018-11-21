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
      garden.get(i).checkStatus();
    }
    System.out.println();
  }

  public void water(double waterAmount) {
    double plantsToWater = garden.size();
    double evenlyWatered = waterAmount / plantsToWater;
    System.out.println("Watering with " + (int)waterAmount);
    for (int i = 0; i < garden.size(); i++) {
      garden.get(i).watering(evenlyWatered);
      plantsToWater--;
      waterAmount -= evenlyWatered;
    }
  }
}

