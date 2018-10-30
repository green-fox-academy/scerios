import java.util.Scanner;

public class Factorial {

    public static int factorio(int n) {

        int result = 1;

        for (int factor = 2; factor <= n; factor++){
            result *= factor;
        }
        System.out.println("The factorial number of you integer is: " + result);
        return result;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        int n = scan.nextInt();

        factorio(n);
    }
}