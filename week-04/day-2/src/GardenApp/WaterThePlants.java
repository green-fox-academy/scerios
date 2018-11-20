package GardenApp;

//The WaterThePlants
//
//    is able to hold unlimited amount of flowers or trees
//    when watering it should only water those what needs water with equally divided amount amongst them
//    eg. watering with 40 and 4 of them need water then each gets watered with 10


public class WaterThePlants {
  public static void main(String[] args) {
    Garden garden = new Garden();

    garden.addPlant(new Flower("yellow"));
    garden.addPlant(new Flower("blue"));
    garden.addPlant(new Tree("purple"));
    garden.addPlant(new Tree("orange"));


    garden.check();
  }
}
