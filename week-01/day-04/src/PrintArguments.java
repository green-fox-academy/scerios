import java.util.Arrays;

public class PrintArguments {

    public static void printParams(String... rn){

        System.out.println(Arrays.toString(rn));
    }

    public static void main(String[] args) {

        printParams("one", "two", "three", "four", "five");

    }
}
