package main.java.music;

public class BassGuitar extends StringedInstrument {
  public BassGuitar() {
    super.name = "Duum-duum-duum";
    super.numberOfStrings = 4;
  }

  public BassGuitar(int numberOfStrings) {
    super.name = "Duum-duum-duum";
    super.numberOfStrings = numberOfStrings;
  }

  String sound() {
    return this.name;
  }
}
