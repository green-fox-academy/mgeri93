package com.todo.todo.Service;

import com.todo.todo.Model.Todo;
import com.todo.todo.Repository.TodoRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class TodoServiceImp implements ITodoService {

  private TodoRepository todoRepository;

  public TodoServiceImp (TodoRepository todoRepository){
    this.todoRepository = todoRepository;
  }

  @Override
  public List<Todo> findAll() {
    List<Todo> todos = new ArrayList<>();
    todoRepository.findAll().forEach(todo -> todos.add(todo));
    return todos;
  }

  @Override
  public void save(Todo todo) {
    todoRepository.save(todo);
  }

  @Override
  public Todo findTodoById(long id) {
    return todoRepository.findById(id).orElse(null);
  }

  @Override
  public Todo findByTitle(String title){
    return todoRepository.findByTitle(title);
  }

  @Override
  public void search(String title, Model model) {
    {
      if (title != null) {
        model.addAttribute("todos", todoRepository.findByTitleContaining(title));
      }
    }
  }

}
