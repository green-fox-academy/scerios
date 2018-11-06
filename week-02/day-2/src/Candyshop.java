import java.util.ArrayList;

public class Candyshop {
    public static Object sweets(ArrayList arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).equals(2)) {
                arrayList.set(i, "Croissant");
            }
            if (arrayList.get(i).equals(false)) {
                arrayList.set(i, "Ice Cream");
            }
        }
        return arrayList;
    }

    public static void main(String... args) {
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add("Cupcake");
        arrayList.add(2);
        arrayList.add("Brownie");
        arrayList.add(false);

        System.out.println(sweets(arrayList));
    }
}
