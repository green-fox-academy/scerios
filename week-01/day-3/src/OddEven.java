import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter an integer: ");

        int number = input.nextInt();

        if ( (number & 1) == 0 ) {

            System.out.println("The number you entered is even.");

        } else {

            System.out.println("The number you entered is odd.");
        }
    }
}
