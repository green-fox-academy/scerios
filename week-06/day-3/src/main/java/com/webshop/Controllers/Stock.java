package com.webshop.Controllers;

import com.webshop.Item;
import java.util.ArrayList;

public class Stock {
  static ArrayList<Item> listOfItems = new ArrayList<>();

  public ArrayList<Item> getListOfItems() {
    return listOfItems;
  }

  public void addItems(Item item) {
    listOfItems.add(item);
  }
}
