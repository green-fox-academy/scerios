package com.webshop.Controllers;

import com.webshop.Item;
import java.util.ArrayList;

public class Stock {
  public static ArrayList<Item> listOfItems = new ArrayList<>();

  public Stock() {
//    listOfItems.add(new Item("FootBall", "NFL approved", 75, 12));
//    listOfItems.add(new Item("Helmet (Limited Edition)", "With your favourite team's logo", 199.99, 3));
//    listOfItems.add(new Item("Training short", "Under Armour", 44.9, 20));
//    listOfItems.add(new Item("Nike shoes", "Built for running", 179.99, 7));
  }

  public ArrayList<Item> getListOfItems() {
    return listOfItems;
  }

  public void addItems(Item item) {
    listOfItems.add(item);
  }
}
