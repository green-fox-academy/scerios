package tests;

import java.util.Arrays;

public class Anagram {
  public boolean isAnagram(String compareThis, String withThis) {
    compareThis = compareThis.replaceAll("\\s", "");
    withThis = compareThis.replaceAll("\\s", "");

    if (compareThis.length() != withThis.length()) {
      return false;
    } else {
      return Arrays.equals(compareThis.toLowerCase().toCharArray(), withThis.toLowerCase().toCharArray());
    }
  }
}
