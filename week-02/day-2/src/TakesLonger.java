public class TakesLonger {

    public static void main(String... args) {

        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
        String addon = "always takes longer than ";

        StringBuilder sb = new StringBuilder(quote);
        sb.insert(21, addon);
        quote = sb.toString();

        System.out.println(quote);
    }
}
