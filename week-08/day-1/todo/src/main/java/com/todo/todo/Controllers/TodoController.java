package com.todo.todo.Controllers;

import com.todo.todo.Repository.TodoRepository;
import com.todo.todo.Model.Todo;
import com.todo.todo.Service.ITodoService;
import com.todo.todo.Service.TodoServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/todo")
public class TodoController {
  private TodoRepository todoRepository;
  private ITodoService todoService;

  @Autowired
  public TodoController(TodoRepository todoRepository, ITodoService todoService) {
    this.todoRepository = todoRepository;
    this.todoService = todoService;
  }

  @GetMapping({"/", "/list"})
  public String list(Model model, @RequestParam(required = false) String isActive) {
    if (isActive != null) {
      if (isActive.equals("true")) {
        model.addAttribute("todos", todoRepository.findAllByDone(false));
      }
    } else {
      model.addAttribute("todos", todoRepository.findAll());
    }
    return "todolist";
  }


  @GetMapping("/add")
  public String showAdd(@ModelAttribute("todo") Todo todo){
    return "add";
  }

  @PostMapping("/add")
  public String add(@ModelAttribute("todo") Todo todo) {
    todoRepository.save(todo);
    return "redirect:/todo/list";
  }

  @GetMapping("/{id}/delete")
  public String delete(@PathVariable Long id) {
    todoRepository.deleteById(id);
    return "redirect:/todo/list";
  }

  @GetMapping("/{id}/edit")
  public String showEdit(Model model, @PathVariable Long id) {
    model.addAttribute("todo", todoRepository.findById(id).get());
    return "edit";
  }

  @PostMapping("/{id}/edit")
  public String edit(@ModelAttribute("todo") Todo todo) {
    todoRepository.save(todo);
    return "redirect:/todo/list";
  }

  @GetMapping("/{id}/describe")
  public String describe(Model model, @PathVariable("id") Long id) {
    model.addAttribute("todo", todoRepository.findById(id).get());
    return "description";
  }

  @GetMapping("/search")
  public String search(@RequestParam(name = "title") String title, Model model) {
    if (title == null) {
      return "todolist";
    } else {
      model.addAttribute("todo", todoService.findByTitle(title));
      return "description";
    }
  }

}