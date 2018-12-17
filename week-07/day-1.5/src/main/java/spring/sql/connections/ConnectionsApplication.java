package spring.sql.connections;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import spring.sql.connections.controller.ToDoController;
import spring.sql.connections.repository.ToDo;

@SpringBootApplication
public class ConnectionsApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(ConnectionsApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    ToDoController.services.addToDo(new ToDo("Eat"));
    ToDoController.services.addToDo(new ToDo("Sleep"));
    ToDoController.services.addToDo(new ToDo("Die"));
    ToDoController.services.addToDo(new ToDo("Repeat"));
  }
}

