package tests;

import org.junit.Test;
import static org.junit.Assert.*;

public class AnagramTest {
  Anagram test = new Anagram();

  @Test(expected = AssertionError.class)
  public void isAnagram() {
    assertTrue(test.isAnagram("rocket", "rocket"));
    assertTrue(test.isAnagram("rocket", "c k r t o e"));
    assertFalse(test.isAnagram("rocket", "space"));
    assertFalse(test.isAnagram("rocket", "611"));
  }
}
