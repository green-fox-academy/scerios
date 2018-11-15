package SumDigit;

public class SumDigit {
  public static void main(String[] args) {
    System.out.println(sumDigits(125));
    }
    public static int sumDigits(int digits) {
    if (digits > 0) {
    return sumDigits(digits / 10) + digits % 10;
    }
    return digits;
  }
}
