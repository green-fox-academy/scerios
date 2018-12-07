package com.webshop;

import com.webshop.Controllers.Stock;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebshopApplication {

  public static void main(String[] args) {
    Stock stock = new Stock();
    Item football = new Item("FootBall", "NFL approved", 75, 12);
    Item helmet = new Item("Helmet (Limited Edition)", "With your favourite team's logo", 199.99, 3);
    Item trainingShort = new Item("Training short", "Under Armour", 44.9, 20);
    Item nikeShoes = new Item("Nike shoes", "Built for running", 179.99, 7);
    stock.addItems(football);
    stock.addItems(helmet);
    stock.addItems(trainingShort);
    stock.addItems(nikeShoes);
    SpringApplication.run(WebshopApplication.class, args);
  }
}
