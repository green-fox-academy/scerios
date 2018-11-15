package Power;

public class Power {
  public static void main(String[] args) {
    System.out.println(powerN(3, 5));
  }
  public static int powerN(int squareThis, int n) {
    if (n == 0) {
      return 1;
    }
    int halfN = powerN(squareThis, n / 2);
    if (n % 2 == 1) {
      return squareThis * halfN * halfN;
    } else {
      return halfN * halfN;
    }
  }
}
