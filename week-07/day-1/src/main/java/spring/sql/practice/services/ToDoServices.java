package spring.sql.practice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.sql.practice.repository.ToDo;
import spring.sql.practice.repository.ToDoRepository;
import java.util.ArrayList;
import java.util.List;

@Service
public class ToDoServices {
  private ToDoRepository repository;

  @Autowired
  public ToDoServices(ToDoRepository repository) {
    this.repository = repository;
  }

  public List<ToDo> getListOfToDos() {
    List<ToDo> toDoList = new ArrayList<>();
    repository.findAll().forEach(toDoList::add);
    return toDoList;
  }

  public void addToDo(ToDo toDo) {
    this.repository.save(toDo);
  }
}
