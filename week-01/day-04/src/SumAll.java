public class SumAll {

    public static void sum(int[] ai) {

        int result = 0;

        for (int i : ai) {
            result += i;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {

        int[] ai = {3, 4, 5, 6, 7};
        sum(ai);

    }
}
