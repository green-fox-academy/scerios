import java.util.Scanner;

public class CountFromTo {

    public static void main(String[] args) {

        Scanner first = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int n = first.nextInt();

        Scanner second = new Scanner(System.in);
        System.out.println("Enter another one:");
        int t = second.nextInt();

        if (n > t) {

            System.out.println("The second number should be bigger!");

        } else {

            for (n = n; n < t; n++) {

                System.out.println(n);
            }
        }
    }
}
