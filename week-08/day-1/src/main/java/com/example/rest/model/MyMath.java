package com.example.rest.model;

public class MyMath {
  private int input;
  private int result;

  public MyMath() {}

  public MyMath(int input) {
    this.input = input;
    result = input * 2;
  }

  public int getInput() {
    return input;
  }

  public void setInput(int input) {
    this.input = input;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}
