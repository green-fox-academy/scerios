package main.java.music;

public class ElectricGuitar extends StringedInstrument {
  ElectricGuitar() {
    super.name = "Twang";
    super.numberOfStrings = 6;
  }

  ElectricGuitar(int numberOfStrings) {
    super.name = "Twang";
    super.numberOfStrings = numberOfStrings;
  }
}
