import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppendA {

    public static void main(String[] args) {

        List<Character> list = new ArrayList<>();
        String[] animals = {"koal", "pand", "zebr"};
        ArrayList<Character> list1;
        list.add(0, 'a');
        System.out.println(Arrays.toString(animals));

    }
}
