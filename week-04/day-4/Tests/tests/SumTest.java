package tests;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.Assert.*;

public class SumTest {

  @Test
  public void sumOfElements() {
    Sum test = new Sum();
    ArrayList<Integer> test1 = new ArrayList<>(Arrays.asList(6, 42, 23, 33, 11, 66));
    assertEquals(181, test.sumOfElements(test1));
  }

  @Test (expected = NullPointerException.class)
  public void trickySumOfElements() {
    Sum test = new Sum();
    ArrayList<Integer> test1 = new ArrayList<>(Arrays.asList());
    ArrayList<Integer> test2 = new ArrayList<>(Arrays.asList(1));
    ArrayList<Integer> test3 = new ArrayList<>(Arrays.asList(6, 42, 23));
    ArrayList<Integer> test4 = new ArrayList<>(Arrays.asList(null));

    assertEquals(0, test.sumOfElements(test1));
    assertEquals(1, test.sumOfElements(test2));
    assertEquals(71, test.sumOfElements(test3));
    assertEquals(null, test.sumOfElements(test4));
  }
}
