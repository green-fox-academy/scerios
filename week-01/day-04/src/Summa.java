import java.util.Scanner;

public class Summa {

    public static int sum(int n){

        int sum = 0;

        sum = n * (1 + n) / 2;
        System.out.println("The sum of all the numbers until your number from zero is: " + sum);
        return n;
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        int n = scan.nextInt();

        sum(n);

    }

}
