import java.util.ArrayList;
import java.util.Arrays;

public class Colors {

    public static void print(String[][] matrix) {
        for(int i = 0; i < matrix.length; i++){
            System.out.println(Arrays.toString(matrix[i]));

        }
    }

    public static void main(String[] args) {

        String[][] matrix = {
                {"lime", "forest green", "olive", "pale green", "spring green"},
                {"orange red", "red", "tomato"},
                {"orchid", "violet", "pink", "hot pink"}
        };
        print(matrix);
    }
}
