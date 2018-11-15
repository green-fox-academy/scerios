package Strings;

public class String2 {
  public static void main(String[] args) {
    System.out.println(removeLetter("xrexcuxxrsion xixs stxxuxpixd"));

  }
  public static String removeLetter(String word) {
    if (word.length() < 1) {
      return word;
    } else {
      String remove = word.startsWith("x") ? "" : word.substring(0, 1);
      return remove + removeLetter(word.substring(1));
    }
  }
}
