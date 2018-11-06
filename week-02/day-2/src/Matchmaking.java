import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Matchmaking {

    public static ArrayList makingMatches(ArrayList girls, ArrayList boys) {
        ArrayList<String> mix = new ArrayList<>();
        for (int i = 0; i < girls.size(); i++) {
            mix.add(girls.get(i) + ", " + boys.get(i));
        }
        return mix;
    }

    public static void main(String[] args) {
        ArrayList<String> girls = new ArrayList<>(Arrays.asList("Eve","Ashley","Claire","Kat","Jane"));
        ArrayList<String> boys = new ArrayList<>(Arrays.asList("Joe","Fred","Tom","Todd","Neef","Jeff"));

        System.out.println(makingMatches(girls, boys));
    }
}
