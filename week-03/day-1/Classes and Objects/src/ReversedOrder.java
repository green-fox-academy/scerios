import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReversedOrder {
  public static void main(String[] args) {
    reverse("reserved-order.txt");
  }
  public static void reverse(String source) {
    Path list = Paths.get(source);

    try {
      List<String> order = Files.readAllLines(list);
      for (int i = order.size() - 1; i >= 0; i--) {
        System.out.println(order.get(i));
      }
      System.out.println();

    } catch (IOException e) {
      System.out.println("You are retarded.");
    }
  }
}
