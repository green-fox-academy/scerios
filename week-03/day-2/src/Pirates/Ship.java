package Pirates;

import java.util.ArrayList;

public class Ship {
  String name;
  ArrayList<Pirate> crew;
  String captain;
  int capacity;

  public Ship(ArrayList<Pirate> crew, String name) {
    this.capacity = 25;
    this.name = name;
    this.crew = crew;
  }

  public String fillShip(Pirate pirate) {
    int rng = (int)(Math.random() * 25);
    for (int i = rng; i < capacity; i ++) {
      crew.add(pirate);
    }

    return "The ship now has a captain and a crew.";
  }

  public void displayList(ArrayList<Pirate> crew) {
    for (int i = 0; i < crew.size(); i++) {
      System.out.println(crew.get(i).name);
    }
  }
}
