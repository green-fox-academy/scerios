package Strings;

public class String3 {
  public static void main(String[] args) {
    System.out.println(insertStar("sup mate"));

  }
  public static String insertStar(String star) {
    if(star.length() == 1) {
      return star;
    } else {
      String subString = star.substring(1);
      return star.substring(0,1) + "*" + insertStar(subString);
    }
  }
}
