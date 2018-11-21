package Fly;

public class Movement {
  public static void main(String[] args) {
    Helicopter apache = new Helicopter("grey", 3500, true);

    apache.takeOff();
    apache.fly();
    apache.land();
  }
}
