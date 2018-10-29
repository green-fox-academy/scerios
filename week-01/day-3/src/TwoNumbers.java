public class TwoNumbers {

    public static void main(String[] args) {

        double x = 22;
        double z = 13;
        double fraction = x / z;

        System.out.println(x + z);
        System.out.println(x - z);
        System.out.println(x * z);
        System.out.println(fraction);

        int remainingPart = (int)(fraction * 100);
        int integerPart = remainingPart / 100;
        remainingPart = remainingPart % 100;

        System.out.println(integerPart);
        System.out.println(remainingPart);

    }
}
