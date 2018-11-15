package Strings;

public class String1 {
  public static void main(String[] args) {
    System.out.println(changeLetter("axbcx", 'x', 'y'));

  }
  public static String changeLetter(String word, char from, char to) {
    if (word.length() < 1) {
      return word;
    } else {
      char n = from == word.charAt(0) ? to : word.charAt(0);
      return changeLetter(word.substring(1), from, to) + n;
    }
  }
}
