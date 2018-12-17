package spring.sql.connections.repository;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ToDo {

  @Id
  private long ID;
  private String title;
  private boolean isUrgent;
  private boolean done;

  public ToDo() {

  }

  public ToDo(String title) {
    this.title = title;
    this.isUrgent = false;
    this.done = false;
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

  public void setTitle(String title) {
    this.title = title;
  }

  public void setUrgent(boolean urgent) {
    isUrgent = urgent;
  }

  public void setDone(boolean done) {
    this.done = done;
  }

  public boolean done() {
    return done;
  }
}
