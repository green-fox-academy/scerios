package com.webshop;

import com.webshop.Controllers.Stock;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebshopApplication {

  public static void main(String[] args) {
    Stock stock = new Stock();
    Item nikeShoe = new Item("Nike Shoe", "Perfect for running.", 250.0, 5);
    Item eggBall = new Item("NFL approved football", "The name says for itself", 70.5, 32);
    Item trainingShort = new Item("Under Armour short", "No more sweat!", 120.9, 14);
    Item helmet = new Item("NFL helmet (Limited Edition)", "You can choose from all 32 team logos.", 399.0, 3);
    stock.addItems(nikeShoe);
    stock.addItems(eggBall);
    stock.addItems(trainingShort);
    stock.addItems(helmet);
    SpringApplication.run(WebshopApplication.class, args);
  }
}
