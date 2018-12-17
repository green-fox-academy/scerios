package spring.sql.practice.repository;

import javax.persistence.Entity;

@Entity
public class ToDo {
  private long ID;
  private String title;
  private boolean isUrgent;
  private boolean isDone;

  public ToDo(long ID, String title, boolean isUrgent, boolean isDone) {
    this.ID = ID;
    this.title = title;
    this.isUrgent = false;
    this.isDone = false;
  }
}
