package com.sql.sql;

import com.sql.sql.Model.Todo;
import com.sql.sql.repository.ITodoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SqlApplication implements CommandLineRunner {

  private ITodoRepository todoRepository;

  public SqlApplication(ITodoRepository todoRepository){
    this.todoRepository = todoRepository;
  }



  public static void main(String[] args) {
    SpringApplication.run(SqlApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    todoRepository.save(new Todo("I have to learn Object Relational Mapping"));
  }
}