package Farm;

import java.util.ArrayList;

public class Farm {
  ArrayList<Animals> farm;
  String name;
  int slots;

  public Farm(String name, int slots, ArrayList<Animals> farm) {
    this.farm = farm;
    this.name = name;
    this.slots = slots;
  }

  public void addAnimals(Animals animals) {
    farm.add(animals);
  }

  public void breed(Animals animals) {
    if (farm.size() < slots) {
      addAnimals(animals);
      System.out.println("A new pray has arrived.");
    } else {
      System.out.println("The farm is full. You need to make a glorious sacrifice to the God of Death.");
    }
  }
}
