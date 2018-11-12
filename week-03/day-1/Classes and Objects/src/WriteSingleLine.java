import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class WriteSingleLine {
  public static void main(String[] args) {
    Path source = Paths.get("my-file.txt");
    try {
      List<String> lines = Arrays.asList("Takács Róbert");
      Files.write(source, lines, Charset.forName("UTF-8"));
    } catch (IOException e) {
      System.out.println("Unable to write file: my-file.txt");
    }
  }
}