package Pirates;

import java.util.ArrayList;

public class Brawl {
  public static void main(String[] args) {
    Pirate jack = new Pirate("Jack Sparrow");
    Pirate francis = new Pirate("Francis Drake");
    Pirate charles = new Pirate("Charles Gibbs");

    Parrot polly = new Parrot("Polly");

    ArrayList<Pirate> crew = new ArrayList<>();
    Ship blackPearl = new Ship(crew, "Black Pearl");
    blackPearl.fillShip(charles);


    System.out.println(polly.qoute());

    System.out.println(jack.howsItGoingMate());
    System.out.println(jack.howsItGoingMate());
    francis.drinkSomeRum();
    jack.brawl(jack, francis);
    blackPearl.displayList(crew);
  }
}
