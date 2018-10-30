public class ChangeElements {

    public static void main(String[] args) {


        int[] s = {1, 2, 3, 8, 5, 6};
        int count = 0;

        for (int i = 0; i < s.length; i++) {
            if (s[i] == 8) {
//                count--;
                s[i] = 4;
            }
        }
        System.out.println(s[3]);
    }
}
