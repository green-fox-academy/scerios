package spring.sql.connections.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface ToDoRepository extends CrudRepository<ToDo, Long> {
  ArrayList<ToDo> findByDoneTrue();
}
