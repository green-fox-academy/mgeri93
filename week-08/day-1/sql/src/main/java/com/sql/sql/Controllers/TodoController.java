package com.sql.sql.Controllers;

import com.sql.sql.repository.ITodoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
