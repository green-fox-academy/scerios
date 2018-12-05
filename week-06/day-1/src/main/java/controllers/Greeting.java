package controllers;

public class Greeting {
  long id;
  String content;

  Greeting(long id, String content) {
    this.id = id;
    this.content = content;
  }

  long getID() {
    return id;
  }

  String getContent() {
    return content;
  }
}
