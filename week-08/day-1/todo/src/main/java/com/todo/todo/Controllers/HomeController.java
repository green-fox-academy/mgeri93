package com.todo.todo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

  @GetMapping("/index")
  public String renderIndex() {
    return "index";
  }

/*  @GetMapping("/assignees")
  public String assignees() {
    return "assignees";
  }

  @GetMapping("/")
  public String renderTodo() {
    return "todolist";
  }*/

}
