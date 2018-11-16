import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Logs {

  public static void main(String[] args) {
    unique("log.txt");
    // Read all data from 'log.txt'.
    // Each line represents a log message from a web server
    // Write a function that returns an array with the unique IP adresses.
    // Write a function that returns the GET / POST request ratio.
  }
  public static void unique(String source) {
    Path log = Paths.get(source);
    try {
      List<String> check = Files.readAllLines(log);
      for (int i = 0; i < check.size(); i++) {
        for (int j = check.indexOf(27); j < 31; j++) {
          System.out.print(check.indexOf(j));
        }
        System.out.println();
      }
    } catch (IOException e) {
      System.out.println("You are retarded.");
    }
  }
}
