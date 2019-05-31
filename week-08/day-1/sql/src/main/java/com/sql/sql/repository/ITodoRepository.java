package com.sql.sql.repository;


import com.sql.sql.Model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface ITodoRepository extends CrudRepository<Todo, Long> {
}
