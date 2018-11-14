package Pirates;

public class Pirate {
  String name;
  int toxicLevel;
  int toxicated = 5;
  boolean alive;

  public Pirate(String name) {
    this.name = name;
    this.toxicLevel = 0;
    this.alive = true;
  }

  public int drinkSomeRum() {
    if (alive == false) {
      System.out.println("He's dead.");
    } else {
      this.toxicLevel++;
    }
    return this.toxicLevel;
  }

  public int drinkABottle() {
    if (alive == false) {
      System.out.println("He's dead.");
    } else {
      this.toxicLevel += 5;
    }
    return this.toxicLevel;
  }

  public boolean die() {
    this.alive = false;
    return this.alive;
  }

  public String howsItGoingMate() {
    if (toxicLevel < toxicated) {
      return "Pour me anudder!";
    } else {
      return "Arghh, I'ma Pirate. How d'ya d'ink its goin? - ** passes out **";
    }
  }

  public void brawl(Pirate challenger, Pirate challenged) {
    int rng = (int)((Math.random() * 3));
    if (challenger.alive == true && challenged.alive == true) {
      if (rng == 1) {
        challenger.alive = false;
        System.out.println("The winner is: " + challenged.name + "! - " + challenger.name + " is dead.");
      } else if (rng == 2) {
        challenged.alive = false;
        System.out.println("The winner is: " + challenger.name + "! - " + challenged.name + " is dead.");
      } else {
        System.out.println("Both land lubber have passed out.");
      }
    }
  }
}
