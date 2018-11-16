package Fibonacci;

public class Fibonacci {
  public static void main(String[] args) {
    System.out.println(fibonacci(5));
  }

  private static long fibonacci(int i) {
    if (i == 0) {
      return 0;
    } else if (i <= 2) {
      return 1;
    }

    long fib = fibonacci(i - 1) + fibonacci(i - 2);
    return fib;
  }
}
