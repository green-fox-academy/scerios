package Sharpie;

public class Sharpie {

  public static void main(String[] args) {
    SharpieValues firstSharpie = new SharpieValues(25, "red");
    SharpieValues secondSharpie = new SharpieValues(40, "green");

    firstSharpie.currentStats();
    firstSharpie.use();
    firstSharpie.currentStats();
    secondSharpie.currentStats();
  }
}
