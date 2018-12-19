package spring.sql.connections.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import spring.sql.connections.model.Assignee;

@Repository
public interface AssigneeRepository extends CrudRepository<Assignee, Long> {
}
