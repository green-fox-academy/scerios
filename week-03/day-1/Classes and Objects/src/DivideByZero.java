import java.util.Scanner;

public class DivideByZero {

  public static void main(String[] args) {
    getNum();

  }
  public static void getNum() {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number to divide 10 with it:");
    int x = scan.nextInt();
    int div = 10;
    try {
      int result = div / x;
      System.out.println(result);
    } catch (ArithmeticException e) {
      System.out.println("Fail");
    } finally {
      scan.close();
    }
  }
}
