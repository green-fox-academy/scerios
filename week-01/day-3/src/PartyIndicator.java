import java.util.Scanner;

public class PartyIndicator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter an integer: ");

        int girls = input.nextInt();

        System.out.println("Please enter another number: ");

        int boys = input.nextInt();

        int both = girls + boys;

        if ( (girls == boys) && both >= 20) {

            System.out.println("The Party is excellent!");

        } else if (both >= 20 && (girls > boys) || (girls < boys)) {

            System.out.println("Quite coolparty!");

        } else if (both < 20) {

            System.out.println("Average party...");

        } else if (girls == 0) {

            System.out.println("Sausage party.");

        }
    }
}
