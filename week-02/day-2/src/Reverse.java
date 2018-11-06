public class Reverse {

    public static String reverse(String str) {
        String reversed = "";
        int length = str.length();

        for (int i = length - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }
        return reversed;
    }

    public static void main(String[] args) {
        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
        reverse(reversed);

        System.out.println(reverse(reversed));

    }
}
