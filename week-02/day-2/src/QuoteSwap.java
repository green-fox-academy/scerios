import java.util.*;

public class QuoteSwap{
    public static void main(String... args){
        ArrayList<String> list = new ArrayList<>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

        System.out.println(quoteSwap(list));

    }
    public static ArrayList quoteSwap(ArrayList list) {
        Collections.swap(list, 2, 5);

        for (int i = 0; i < list.size() - 1; i++) {
            list.set(i, list.get(i) + " ");
        }
        return list;
    }
}