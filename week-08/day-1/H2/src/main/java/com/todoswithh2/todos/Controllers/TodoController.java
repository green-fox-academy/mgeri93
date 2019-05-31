package com.todoswithh2.todos.Controllers;

import com.todoswithh2.todos.repository.ITodoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@RequestMapping("/todo")
public class TodoController {

  private ITodoRepository todoRepository;

  public TodoController(ITodoRepository todoRepository){
    this.todoRepository = todoRepository;
  }


  @GetMapping({"/","/list"})
  public String list(Model model){
    model.addAttribute("todos",todoRepository.findAll());
    return "/todolist";
  }

}
