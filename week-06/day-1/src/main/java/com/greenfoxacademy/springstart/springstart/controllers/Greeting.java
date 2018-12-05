package com.greenfoxacademy.springstart.springstart.controllers;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {
  private long id;
  private String content;
  static AtomicLong counter = new AtomicLong(1);

  Greeting(long id, String content) {
    this.id = id;
    this.content = content;
  }

  public long getID() {
    return id;
  }

  public void setID(long id) {
    this.id = id;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }
}
