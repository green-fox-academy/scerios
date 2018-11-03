import java.util.Scanner;

public class DrawTriangle {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer for the size of the triangle:");
        int n = scan.nextInt();
        String t = "*";

        for (int i = 0; i < n; i++) {

            System.out.println(t);
            t = t + "*";
        }
    }
}
