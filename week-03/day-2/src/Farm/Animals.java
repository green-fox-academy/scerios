package Farm;

public class Animals {
  int hunger;
  int thirst;

  public Animals() {
    this.hunger = 50;
    this.thirst = 50;
  }

  public void eat() {
    this.hunger--;
  }
  public void drink() {
    this.thirst--;
  }
  public void play() {
    this.hunger++;
    this.thirst++;
  }
  public void stat() {
    System.out.println("Hunger: " + hunger);
    System.out.println("Thirst: " + thirst);
  }
}