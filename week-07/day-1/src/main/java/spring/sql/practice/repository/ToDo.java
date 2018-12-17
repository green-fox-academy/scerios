package spring.sql.practice.repository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ToDo {

  @Id
  @GeneratedValue
  private long ID;
  private String title;
  private boolean isUrgent;
  private boolean isDone;

  public ToDo(String title) {
    this.title = title;
    this.isUrgent = false;
    this.isDone = false;
  }

  public long getID() {
    return ID;
  }

  public String getTitle() {
    return title;
  }

  public boolean isUrgent() {
    return isUrgent;
  }

  public boolean isDone() {
    return isDone;
  }
}
