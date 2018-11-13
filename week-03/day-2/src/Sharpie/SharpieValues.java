package Sharpie;

public class SharpieValues {
  String color;
  float width;
  float inkAmount = 100;

  public SharpieValues(float width, String color) {
    this.width = width;
    this.color = color;
  }

  public void currentStats() {
    System.out.println("This sharpie is " + color + " colored, and has a width of: " + width);
    System.out.println("Also the current level of ink is: " + inkAmount);
    System.out.println();
  }

  public void use() {
    this.inkAmount -= 10;
  }
}
