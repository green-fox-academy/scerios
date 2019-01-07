package com.example.rest.model;

public class ErrorMessage {
  private String message;

  public ErrorMessage() {
    message = "Please provide an input!";
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
