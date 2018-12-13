package com.demo.dependencies.services;

import com.demo.dependencies.interfaces.Coloring;

public class RedColor implements Coloring {
  @Override
  public void printColor(String color) {
    System.out.println("------ RED ------");
  }
}
