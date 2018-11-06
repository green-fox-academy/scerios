import java.util.ArrayList;

public class Candyshop {
    public static Object sweets(ArrayList arrayList) {
        arrayList.set(1, "Croissant");
        arrayList.set(3, "Ice Cream");
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
