import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppendA {

    public static void addA(String[] animals) {

        for(int i = 0; i < animals.length; i++){
            System.out.print(animals[i] + "a ");
        }
    }

    public static void main(String[] args) {

        String[] animals = {"koal", "pand", "zebr"};
        addA(animals);

    }
}
