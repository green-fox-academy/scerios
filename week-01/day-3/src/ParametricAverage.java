import java.util.Scanner;

public class ParametricAverage {
  public static void asmany() {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a random integer: ");
    int input = scan.nextInt();
    int sum = 0;

    for (int i = 1; i <= input; i++) {
      if (i == input - 1) {
        System.out.println("Now enter the final number: ");
        int in = scan.nextInt();
        sum += in;
        scan.close();
        break;
      } else {
        System.out.println("Now enter random integers " + (input - i) + " more times: " );
        int in = scan.nextInt();
        sum += in;
      }
    }
    int average =  sum / input;
    System.out.println("The sum of all the numbers you have entered is: " + sum + ".");
    System.out.println("The average of all the numbers you have entered is: " + average + ".");
  }

  public static void main(String[] args) {
    asmany();
  }
}
