package Counter;

import java.util.Scanner;

public class Counter {
  int stat;
  int initial;

  public Counter(int stat) {
    this.stat = stat;
    this.initial = stat;
  }

  public Counter() {
    this.stat = 0;
    this.initial = 0;
  }

  public int addCustomNum() {
    int addStat;
    Scanner scan = new Scanner(System.in);
    System.out.println("How much do you want to add?");
    addStat = scan.nextInt();
    this.stat += addStat;
    scan.close();
    return this.stat;
  }

  public void add(int stat) {
    this.stat += stat;
  }

  public void add() {
    this.stat++;
  }

  public int get() {
    return this.stat;
  }

  public void reset() {
    this.stat = initial;
  }
}
