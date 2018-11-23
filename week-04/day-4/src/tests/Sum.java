package tests;

import java.util.ArrayList;

public class Sum {
  public int sumOfElements(ArrayList<Integer> listOfElements) {
    int sumOfAll = 0;
    for (int i = 0; i < listOfElements.size(); i++) {
      sumOfAll += listOfElements.get(i);
    }
    return sumOfAll;
  }
}
