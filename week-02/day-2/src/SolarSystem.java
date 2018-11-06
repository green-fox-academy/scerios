import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class SolarSystem {

    public static ArrayList putSaturn(ArrayList planetList) {
        String missing = "Saturn";

        planetList.add(5, missing);
        return planetList;
    }

    public static void main(String... args) {
        ArrayList<String> planetList = new ArrayList<>(Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Uranus", "Neptune"));

        System.out.println(putSaturn(planetList));
    }
}
