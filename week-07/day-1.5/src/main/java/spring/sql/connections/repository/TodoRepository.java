package spring.sql.connections.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import spring.sql.connections.model.Todo;

import java.util.ArrayList;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
  ArrayList<Todo> findByDoneFalse();
  ArrayList<Todo> findAllByTitleContains(String search);
}
