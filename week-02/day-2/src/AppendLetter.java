import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppendLetter {
    public static List appendA(List far) {
        List<String> mix = new ArrayList<>();

        for (int i = 0; i < far.size(); i++) {
            mix.add(far.get(i) + "a");

        }
        return mix;
    }

    public static void main(String[] args) {
        List<String> far = Arrays.asList("bo", "anacond", "koal", "pand", "zebr");

        System.out.println(appendA(far));
    }
}
