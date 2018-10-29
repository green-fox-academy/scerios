import java.util.Scanner;

public class PrintBigger {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number: ");

        float first = input.nextFloat();

        System.out.println("Please enter another number: ");

        float second = input.nextFloat();

        if (first > second) {

            System.out.println("The bigger number is: " + first);

        } else {

            System.out.println("The bigger number is: " + second);
        }
    }
}
