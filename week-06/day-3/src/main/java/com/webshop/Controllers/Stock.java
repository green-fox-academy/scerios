package com.webshop.Controllers;

import com.webshop.Item;
import java.util.ArrayList;

public class Stock {
  public static ArrayList<Item> stock = new ArrayList<>();

  public Stock() {
  }

  public ArrayList<Item> getstock() {
    return stock;
  }

  public void addItems(Item item) {
    stock.add(item);
  }
}
