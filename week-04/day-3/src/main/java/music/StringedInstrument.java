package main.java.music;

public abstract class StringedInstrument extends Instrument {
  protected int numberOfStrings;

  public void play() {
    System.out.println(getClass().getSimpleName() + ", a " + this.numberOfStrings + "-stringed instrument that goes " +
        this.sound());
  }

  abstract String sound();
}
