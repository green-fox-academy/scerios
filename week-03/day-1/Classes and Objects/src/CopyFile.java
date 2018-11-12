import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CopyFile {
  public static void main(String[] args) {
    System.out.println(copy("to-do-list.txt", "my-to-do-list.txt"));

  }
  public static boolean copy(String fromThis, String toThis) {
    Path copyThis = Paths.get(fromThis);
    Path pasteThis = Paths.get(toThis);

    try {
      List<String> text = Files.readAllLines(copyThis);
      Files.write(pasteThis, text);
      return true;

    } catch (IOException e) {
      return false;

    }
  }
}
