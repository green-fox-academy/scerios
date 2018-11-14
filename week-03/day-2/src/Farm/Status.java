package Farm;

import java.util.ArrayList;

public class Status {
  public static void main(String[] args) {
    ArrayList<Animals> farm = new ArrayList<>();
    Farm happyFarm = new Farm("Bloodbath", 5, farm);
    Animals pig = new Animals();
    Animals cow = new Animals();
    Animals chicken = new Animals();

    happyFarm.addAnimals(pig);
    pig.eat();
    pig.eat();
    happyFarm.addAnimals(cow);
    cow.eat();
    happyFarm.addAnimals(chicken);
    chicken.play();

    happyFarm.breed(pig);
    happyFarm.breed(pig);
    happyFarm.breed(pig);
  }
}