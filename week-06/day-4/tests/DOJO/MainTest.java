package DOJO;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static DOJO.Main.whoWins;
import static org.junit.Assert.*;

public class MainTest {

  @Test
  public void whoWinsTest() {
    String[] black = {"2H", "3D", "5S", "9C", "KD"};
    String[] white = {"2C", "3H", "4S", "8C", "AH"};
    assertEquals("white", whoWins(black, white));
  }


  @Test
  public void whoWinsTest2() {
    String[] black = {"2H", "4S", "4C", "2D", "4H"};
    String[] white = {"2S", "8S", "AS", "QS", "3S"};
    assertEquals("black", whoWins(black, white));
  }

  @Test
  public void whoWinsTest3() {
    String[] black = {"2H", "3D", "5S", "9C", "KD"};
    String[] white = {"2C", "3H", "4S", "8C", "KH"};
    assertEquals("black", whoWins(black, white));
  }

  @Test
  public void whoWinsTest4() {
    String[] black = {"2H", "3D", "5S", "9C", "KD"};
    String[] white = {"2D", "3H", "5C", "9S", "KH"};
    assertEquals("tie", whoWins(black, white));
  }

  @Test
  public void ahTest() {
    String[] black = {"2H", "AH", "4S", "9C", "KD"};
    String[] white = {"2D", "AH", "5C", "9S", "KH"};
    assertEquals("white", whoWins(black, white));
  }
}
