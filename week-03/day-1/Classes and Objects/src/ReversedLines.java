import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReversedLines {

  public static void main(String[] args) {
    reverse("reversed-lines.txt");
  }

  public static void reverse(String source) {
    Path list = Paths.get(source);

    try {
      List<String> backward = Files.readAllLines(list);

      for (int i = 0; i < backward.size(); i++) {
        for (int j = backward.get(i).length() - 1; j >= 0; j--) {
          System.out.print(backward.get(i).charAt(j));

        }
        System.out.println();
      }

    } catch (IOException e) {
      System.out.println("You are retarded.");
    }
  }
}
