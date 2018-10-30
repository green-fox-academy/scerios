public class AppendingAFunction {

    public static String appendAFunc(String typo) {

        String miss = "a";
        System.out.println(typo + miss);
        return typo;
    }

    public static void main(String[] args) {

        String typo = "Chinchill";
        appendAFunc(typo);
    }
}
