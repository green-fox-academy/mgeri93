package com.todoswithh2.todos;

import com.todoswithh2.todos.Model.Todo;
import com.todoswithh2.todos.repository.ITodoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodosApplication implements CommandLineRunner {

  private ITodoRepository todoRepository;

  public TodosApplication(ITodoRepository todoRepository){
    this.todoRepository = todoRepository;
  }



  public static void main(String[] args) {
    SpringApplication.run(TodosApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    todoRepository.save(new Todo("I have to learn Object Relational Mapping"));
  }
}
