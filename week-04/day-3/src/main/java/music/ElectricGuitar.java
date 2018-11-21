package main.java.music;

public class ElectricGuitar extends StringedInstrument {
  public ElectricGuitar() {
    super.name = "Twang";
    super.numberOfStrings = 6;
  }

  public ElectricGuitar(int numberOfStrings) {
    super.name = "Twang";
    super.numberOfStrings = numberOfStrings;
  }
}
