package com.example.rest.model;

public class AppendA {
  private String appended;

  public AppendA() {}

  public AppendA(String word) {
    this.appended = word.concat("a");
  }

  public String getAppended() {
    return appended;
  }

  public void setAppended(String appended) {
    this.appended = appended.concat("a");
  }
}
