import java.util.Scanner;

public class AnimalsAndLegs {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number: ");

        int chicken = input.nextInt();

        System.out.println("Please enter another number: ");

        int pig = input.nextInt();

        int chickenLegs = chicken * 2;
        int pigLegs = pig * 4;
        int allAnimalLegs = chickenLegs + pigLegs;

        System.out.println("On the farm there are " + allAnimalLegs + " animal legs.");
    }
}
