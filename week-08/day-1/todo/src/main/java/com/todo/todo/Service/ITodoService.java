package com.todo.todo.Service;

import com.todo.todo.Model.Todo;
import java.util.List;


public interface ITodoService {

  List<Todo> findAll();
  void save(Todo todo);
  Todo findTodoById(long id);
  Todo findByTitle(String title);

}