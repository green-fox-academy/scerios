import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class WriteMultipleLines {
  public static void main(String[] args) {
    writeMultiLines("to-do-list.txt", "learn, practice, rage, repeat", 5);

  }

  public static void writeMultiLines(String source, String text, int lines) {
    Path myPath = Paths.get(source);

    try {
      for (int i = 0; i < lines; i++) {
        List<String> addLines = Arrays.asList(text);
        Files.write(myPath, addLines, StandardOpenOption.APPEND);

      }

    } catch (IOException e) {
      return;

    }
  }
}
