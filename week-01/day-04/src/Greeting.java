public class Greeting {

    public static String greet(String al) {

        System.out.println("Greetings dear, " + al);
        return al;
    }

    public static void main(String[] args) {

        String al = "Greenfox";
        greet(al);
    }
}
