import java.util.Scanner;

public class AverageOfInput {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter five integer numbers, each in a different line: ");

        float one = input.nextInt();

        System.out.println("Next number: ");

        float two = input.nextInt();

        System.out.println("Another one: ");

        float three = input.nextInt();

        System.out.println("Another one: ");

        float four = input.nextInt();

        System.out.println("Last one: ");

        float five = input.nextInt();

        float sum = one + two + three + four + five;
        float average = sum / 5;

        System.out.println("Sum of your numbers: " + sum + ", Average of your numbers: " + average);
    }
}
