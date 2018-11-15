package greenfox.practice;

public class Counter {
  public static void main(String[] args) {
    counter(5);
  }

  public static int counter(int limit) {
    if (limit >= 0) {
      System.out.println(limit);
      counter(limit - 1);
      System.out.println(limit);
    }
    return limit;
  }
}
