package SharpieSet;

import java.util.ArrayList;

public class Sharpie {

  public static void main(String[] args) {
    SharpieValues redSharpie = new SharpieValues(25, "red");
    SharpieValues greenSharpie = new SharpieValues(40, "green");
    SharpieValues blueSharpie = new SharpieValues(10, "blue");

    ArrayList<SharpieValues> sharpieList = new ArrayList<SharpieValues>();
    sharpieList.add(redSharpie);
    sharpieList.add(greenSharpie);
    sharpieList.add(blueSharpie);

    SharpieSet list = new SharpieSet(sharpieList);

    System.out.println(list.countUseable());
    System.out.println(redSharpie.currentInkAmount());
    redSharpie.use();
    System.out.println(redSharpie.currentInkAmount());
    System.out.println(list.countUseable());
    list.removeThrash();
  }
}
