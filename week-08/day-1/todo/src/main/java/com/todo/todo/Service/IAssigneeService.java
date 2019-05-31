package com.todo.todo.Service;

import com.todo.todo.Model.Assignee;
import java.util.List;

public interface IAssigneeService {

  List<Assignee> findAll();
  void save(Assignee assignee);
  Assignee findAssigneeById(long id);
  Assignee findByName(String title);

}
