import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Doubled {
  public static void main(String[] args) {
    simplicate("duplicated.txt");
  }
  public static void simplicate(String source) {
    Path tooMuch = Paths.get(source);

    try {
      List<String> simple = Files.readAllLines(tooMuch);
      for (int i = 0; i < simple.size(); i += 2) {
        System.out.print(simple.get(i));
      }
      System.out.println();
    } catch (IOException e) {
      System.out.println("You are retarded.");
    }
  }
}
