package com.todo.todo.Service;

import com.todo.todo.Model.Assignee;
import com.todo.todo.Repository.AssigneeRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class AssigneeServiceImp implements IAssigneeService {

  private AssigneeRepository assigneeRepository;

  public AssigneeServiceImp (AssigneeRepository assigneeRepository){
    this.assigneeRepository = assigneeRepository;
  }


  @Override
  public List<Assignee> findAll() {
    List<Assignee> assignees = new ArrayList<>();
    assigneeRepository.findAll().forEach(assignee -> assignees.add(assignee));
    return assignees;
  }

  @Override
  public void save(Assignee assignee) {
    assigneeRepository.save(assignee);
  }

  @Override
  public Assignee findAssigneeById(long id) {
    return assigneeRepository.findById(id).orElse(null);
  }

  @Override
  public Assignee findByName(String title) {
    return null;
  }


}
