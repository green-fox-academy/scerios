public class FizzBuzz {

    public static void main(String[] args) {

        int n = 1;
        String three = "Fizz";
        String five = "Buzz";
        String threefive = "Fizzbuzz";

        for (n = 1; n <= 100; n++) {


            if ((n % 3) == 0 && (n % 5) == 0) {

                System.out.println(threefive);

            } else if ((n % 5) == 0) {

                System.out.println(five);

            } else if ((n % 3) == 0) {

                System.out.println(three);
            } else
                System.out.println(n);
        }
    }
}
