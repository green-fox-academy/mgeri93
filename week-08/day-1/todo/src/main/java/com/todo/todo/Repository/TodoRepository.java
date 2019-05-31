package com.todo.todo.Repository;

import com.todo.todo.Model.Todo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TodoRepository extends CrudRepository<Todo, Long> {
  Iterable<Todo> findAllByDone(Boolean done);
  Todo findByTitle(String title);
}
