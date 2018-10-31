public class Reverse {

    public static void reverse(int[] aj) {

       int raj;

       int start = 0;
       int end = aj.length - 1;

       while (start < end) {
           raj = aj[start];
           aj[start] = aj[end];
           aj[end] = raj;

           start++;
           end--;
       }

       for(int i = 0; i < aj.length; i++) {

           System.out.print(aj[i] + " ");
       }

    }

    public static void main(String[] args) {

        int[] aj = {3, 4, 5, 6};
        reverse(aj);
    }
}
