import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
  public static void main(String[] args) {
    System.out.println(numLines("my-file.txt"));
      }
  public static int numLines(String source)  {
    Path file = Paths.get(source);
    List<String> lines;
    int lineNum;
    try {
      lines = Files.readAllLines(file);
      lineNum = lines.size();
    } catch (IOException e) {
      return 0;
    }
    return lineNum;
  }
  // Write a function that takes a filename as string,
  // then returns the number of lines the file contains.
  // It should return zero if it can't open the file, and
  // should not raise any error.
}
