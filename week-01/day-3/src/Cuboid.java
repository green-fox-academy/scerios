public class Cuboid {

    public static void main(String[] args) {

        int a, b, c;
        a = 25;
        b = 50;
        c = 10;

        int volume = a * b * c;
        int surface = 2 * ((a * b) + (a * c) + (b * c));

        System.out.println("Surface Area: " + surface);
        System.out.println("Volume: " + volume);

    }
}
