package Counter;

public class SetCounter {

  public static void main(String[] args) {
    Counter myCounter = new Counter(30);

    System.out.println(myCounter.get());
    myCounter.addCustomNum();
    myCounter.add();
    System.out.println(myCounter.get());
    myCounter.reset();
    System.out.println(myCounter.get());
  }
}
