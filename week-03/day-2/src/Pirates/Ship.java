package Pirates;

import java.util.ArrayList;

public class Ship {
  String name;
  ArrayList<Pirate> crew;
  int captain;
  int capacity;

  public Ship(ArrayList<Pirate> crew, String name) {
    this.capacity = 5;
    this.name = name;
    this.crew = crew;
  }

  public String fillShip(Pirate pirate) {
    int rng = (int)(Math.random() * 5);
    for (int i = rng; i < capacity; i ++) {
      crew.add(pirate);
    }

    return "The ship now has a captain and a crew.";
  }
}
