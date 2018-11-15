package Strings;

public class String1 {
  public static void main(String[] args) {
    System.out.println(changeLetter("xo matex"));

  }
  public static String changeLetter(String word) {
    if (word.length() < 1) {
      return word;
    } else {
      String change = word.startsWith("x") ? "y" : word.substring(0, 1);
      return change + changeLetter(word.substring(1));
    }
  }
}
