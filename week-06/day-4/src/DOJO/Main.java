package DOJO;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {

    String[] black = {"2H", "3D", "5S", "9C", "KD"};
    String[] white = {"2C", "3H", "4S", "8C", "AH"};
    System.out.println(getHighCard(black, white));

  }

  public static String whoWins(String[] black, String[] white) {
    String winningHand = "black";
    winningHand=getHighCard(black, white);
    if (isTie(black, white).equals("tie")) {
      winningHand = "tie";
    }
    return winningHand;
  }

  public static String isTie(String[] black, String[] white) {
    String tie = "not tie";
    int counter = 0;
    for (int i = 0; i < white.length; i++) {
      if (white[i].charAt(0) == black[i].charAt(0)) {
        counter++;
      }
    }
    if (counter == 5) {
      tie = "tie";
    }
    return tie;
  }

  public static String getHighCard(String[] black, String[] white) {
    String returnValue ="";
    int[] whiteSorted = new int[5];
    int[] blackSorted = new int[5];
    for (int i = 0; i < 5; i++) {
      whiteSorted[i] = (int) white[i].charAt(0);
      blackSorted[i] = (int) black[i].charAt(0);

      if (white[i].charAt(0) == 'J') {
        whiteSorted[i]= 11;
      } else if (white[i].charAt(0) == 'Q') {
        whiteSorted[i]= 12;
      } else if (white[i].charAt(0) == 'K') {
        whiteSorted[i]= 13;
      } else if (white[i].charAt(0) == 'A') {
        whiteSorted[i]= 14;
      }

      if (black[i].charAt(0) == 'J') {
        blackSorted[i]= 11;
      } else if (black[i].charAt(0) == 'Q') {
        blackSorted[i]= 12;
      } else if (black[i].charAt(0) == 'K') {
        blackSorted[i]= 13;
      } else if (black[i].charAt(0) == 'A') {
        blackSorted[i]= 14;
      }
    }
    Arrays.sort(blackSorted);
    Arrays.sort(whiteSorted);

    for (int i = 0; i < 5 ; i++) {
      if (blackSorted[i] > whiteSorted[i]) {
        returnValue = "black";
      } else if (blackSorted[i] < whiteSorted[i]) {
        returnValue = "white";
      }
    }
  return returnValue;
  }
}
