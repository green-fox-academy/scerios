import java.util.Arrays;

public class SwapElements {


    public static void main(String[] args) {

        String[] abc = {"first", "third", "second"};
        String acb = abc[1];
        abc[1] = abc[2];
        abc[2] = acb;

        System.out.println(Arrays.toString(abc));

    }
}
