package SharpieSet;

import java.util.ArrayList;

public class SharpieSet {
  ArrayList<SharpieValues> listOfSharpies;

  public SharpieSet(ArrayList<SharpieValues> listOfSharpies) {
    this.listOfSharpies = listOfSharpies;
  }

  public int countUseable() {
    int useable = 0;
    for (int i = 0; i < listOfSharpies.size(); i++) {
      if (listOfSharpies.get(i).inkAmount > 0) {
        useable++;
      }
    }
    return useable;
  }

  public void removeThrash() {
    for (int i = listOfSharpies.size() - 1; i >= 0; i--) {
      if (listOfSharpies.get(i).inkAmount == 0) {
        listOfSharpies.remove(i);
      }
    }
    System.out.println("Empty Sharpies have been removed from the set.");
  }
}
