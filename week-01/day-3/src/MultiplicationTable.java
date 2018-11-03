import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int n = scan.nextInt();
        int i = 1;

        for (i = 1; i <= 10; i++) {

            int t = n * i;
            System.out.println(i + " * " + n + " = " + t);
        }
    }
}
