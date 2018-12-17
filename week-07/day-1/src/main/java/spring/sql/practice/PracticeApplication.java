package spring.sql.practice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import spring.sql.practice.controller.ToDoController;
import spring.sql.practice.repository.ToDo;

@SpringBootApplication
public class PracticeApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(PracticeApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    ToDoController.services.addToDo(new ToDo("Task 1"));
    ToDoController.services.addToDo(new ToDo("Task 2"));
    ToDoController.services.addToDo(new ToDo("Task 3"));
  }
}

