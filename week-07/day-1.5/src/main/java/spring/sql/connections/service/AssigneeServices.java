package spring.sql.connections.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.sql.connections.model.Assignee;
import spring.sql.connections.repository.AssigneeRepository;
import java.util.ArrayList;
import java.util.List;

@Service
public class AssigneeServices {
  private AssigneeRepository repository;

  @Autowired
  public AssigneeServices(AssigneeRepository repository) {
    this.repository = repository;
  }

  public List<Assignee> getListOfAssignees() {
    List<Assignee> assigneeList = new ArrayList<>();
    repository.findAll().forEach(assigneeList::add);
    return assigneeList;
  }

  public void addAssignee(Assignee assignee) {
    this.repository.save(assignee);
  }

  public void deleteAssignee(Long id) {
    this.repository.deleteById(id);
  }
}
