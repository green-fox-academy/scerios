package com.example.rest.model;

import org.springframework.http.converter.HttpMessageNotReadableException;

public class DoUntil {
  private int until;

  public DoUntil() {}

  public DoUntil(int input) {
    this.until = input;
  }

  public int getUntil() {
    return until;
  }

  public void setUntil(int input) {
    this.until = input;
  }

  public int sum() {
    int result = 0;
    for (int i = 1; i < this.getUntil(); i++) {
      result += i;
    }
    return result;
  }

  public int factor() {
    int result = 0;
    for (int i = 1; i < this.getUntil(); i++) {
      result *= i;
    }
    return result;
  }

  public Result getResult(String action) {
    if (action.equals("sum")) {
      return new Result(this.sum());
    } else if (action.equals("factor")) {
      return new Result(this.factor());
    } else throw new HttpMessageNotReadableException("Please provide a number!");
  }
}
