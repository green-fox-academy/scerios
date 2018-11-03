import java.util.Scanner;

public class DrawPyramid {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer for the size of the pyramid:");
        int n = scan.nextInt();
        int z = 0;
        String t = "*";

        for (int i = 1; i < n; i++, z = 0) {
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }

            while (z != 2 * i - 1) {
                System.out.print("*");
                z++;
            }

            System.out.println();

        }
    }
}
