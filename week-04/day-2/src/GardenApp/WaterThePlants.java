package GardenApp;

public class WaterThePlants {
  public static void main(String[] args) {
    Garden garden = new Garden();

    garden.addPlant(new Flower("yellow"));
    garden.addPlant(new Flower("blue"));
    garden.addPlant(new Tree("purple"));
    garden.addPlant(new Tree("orange"));

    garden.check();
    garden.water(40);
    garden.check();
    garden.water(70);
    garden.check();
  }
}
