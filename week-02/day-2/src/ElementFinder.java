import java.util.ArrayList;
import java.util.Arrays;

public class ElementFinder {
    public static String containsSeven(ArrayList arrayList) {
        if (arrayList.contains(7)) {
            return "Hoorray";
        } else {
            return "Noooooo";
        }
    }

    public static void check(ArrayList arrayList) {
        int[] checkList = new int[arrayList.size()];
        for (int i = 0; i < checkList.length; i++) {
            if (checkList[i] == 7) {
                System.out.println("Hoorray");
                break;
            } else if (i == checkList.length - 1){
                System.out.println("Noooooo");
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        check(arrayList);
        System.out.println(containsSeven(arrayList));
    }
}
