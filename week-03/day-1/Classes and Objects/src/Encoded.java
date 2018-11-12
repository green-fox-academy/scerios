import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Encoded {

  public static void main(String[] args) {
    decrypt("encoded.txt");
  }

  public static void decrypt(String source) {
    Path codedFile = Paths.get(source);
    char enigma;

    try {
      List<String> decoded = Files.readAllLines(codedFile);
      for (int i = 0; i < decoded.size(); i++) {
        for (int j = 0; j < decoded.get(i).length(); j++) {
          if ((int) decoded.get(i).charAt(j) == 32) {

            enigma = (char) ((int) decoded.get(i).charAt(j));

          } else {

            enigma = (char) ((int) decoded.get(i).charAt(j) - 1);
          }
          System.out.print(enigma);

        }
        System.out.println();

      }
    } catch (IOException e) {
      System.out.println("You are retarded.");
    }
  }
}
