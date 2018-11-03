import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {

        int num = 6;
        boolean win = false;

        while (win == false) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Try to figure out the integer:");
            int n = scan.nextInt();

            if (n == num) {
                win = true;
                System.out.println("You found the number: " + num);

            } else if (n < num) {
                System.out.println("The stored number is higher!");

            } else if (n > num){
                System.out.println("The stored number is lower!");

            }
        }
    }
}
