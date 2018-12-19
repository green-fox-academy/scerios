package spring.sql.connections.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.sql.connections.model.Todo;
import spring.sql.connections.repository.TodoRepository;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoServices {
  private TodoRepository repository;

  @Autowired
  public TodoServices(TodoRepository repository) {
    this.repository = repository;
  }

  public List<Todo> getListOfToDos() {
    List<Todo> todoList = new ArrayList<>();
    repository.findAll().forEach(todoList::add);
    return todoList;
  }

  public Todo getToDoByID(long id) {
    return repository.findById(id).get();

  }

  public void addToDo(Todo todo) {
    this.repository.save(todo);
  }

  public void deleteTodo(Long id) {
    repository.deleteById(id);
  }

  public ArrayList<Todo> filterIfIsNotDone() {
    return this.repository.findByDoneFalse();
  }

  public ArrayList<Todo> search(String search) {
    return this.repository.findAllByTitleContains(search);
  }
}
