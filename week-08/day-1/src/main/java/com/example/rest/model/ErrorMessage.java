package com.example.rest.model;

public class ErrorMessage {
  private static String mathMessage = "Please provide an input!";
  private static String nameMessage = "Please provide a name!";
  private static String titleMessage = "Please provide a title!";

  public ErrorMessage() {
  }

  public String getMathMessage() {
    return mathMessage;
  }

  public void setMathMessage(String message) {
    this.mathMessage = message;
  }

  public static String getNameMessage() {
    return nameMessage;
  }

  public static void setNameMessage(String nameMessage) {
    ErrorMessage.nameMessage = nameMessage;
  }

  public static String getTitleMessage() {
    return titleMessage;
  }

  public static void setTitleMessage(String titleMessage) {
    ErrorMessage.titleMessage = titleMessage;
  }
}
