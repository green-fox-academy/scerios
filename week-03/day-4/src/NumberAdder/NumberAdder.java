package NumberAdder;

public class NumberAdder {
  public static void main(String[] args) {
    System.out.println(numAdder(5));

  }
  public static int numAdder(int limit) {
    if (limit > 0) {
      return numAdder(limit -1) + limit;
    }
    return limit;
  }
}
