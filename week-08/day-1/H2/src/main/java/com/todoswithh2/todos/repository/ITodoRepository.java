package com.todoswithh2.todos.repository;

import com.todoswithh2.todos.Model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface ITodoRepository extends CrudRepository<Todo, Long> {
}
