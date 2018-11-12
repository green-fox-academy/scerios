import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

public class PrintEachLine {
  public static void main(String[] args) {
    Path source = Paths.get("my-file.txt");
    try {
        for (String line : Files.readAllLines(source)) {
        System.out.println(line);
      }
    } catch (IOException e) {
      System.out.println("Unable to read file: my-file.txt");
    }
  }
}