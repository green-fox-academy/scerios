package com.demo.dependencies.services;

import com.demo.dependencies.interfaces.Coloring;
import org.springframework.stereotype.Service;

@Service
public class GreenColor implements Coloring {
  @Override
  public void printColor(String color) {
    System.out.println("------ GREEN ------");
  }
}
