package main.java.music;

public class Violin extends StringedInstrument {
  public Violin() {
    super.name = "Screech";
    super.numberOfStrings = 4;
  }

  String sound() {
    return this.name;
  }
}
