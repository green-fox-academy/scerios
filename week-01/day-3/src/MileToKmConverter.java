import java.util.Scanner;

public class MileToKmConverter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number: ");

        int kmDistance = input.nextInt();
        double converter = kmDistance * 1.6;

        System.out.println("You entered " + kmDistance + " as a KM distance, and it's exactly " + converter + " in miles.");
    }
}
