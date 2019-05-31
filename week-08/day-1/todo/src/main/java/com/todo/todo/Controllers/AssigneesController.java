package com.todo.todo.Controllers;

import com.todo.todo.Model.Assignee;
import com.todo.todo.Model.Todo;
import com.todo.todo.Repository.AssigneeRepository;
import com.todo.todo.Service.AssigneeServiceImp;
import com.todo.todo.Service.IAssigneeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/assignees")
public class AssigneesController {

  private AssigneeRepository assigneeRepository;
  private IAssigneeService assigneeService;

  @Autowired
  public AssigneesController(AssigneeRepository assigneeRepository, IAssigneeService assigneeService){
    this.assigneeRepository = assigneeRepository;
    this.assigneeService = assigneeService;
  }

  @GetMapping("/")
  public String findAssignees(Model model, @ModelAttribute("assignee") Assignee assignee) {
    model.addAttribute("assignees", assigneeService.findAll());
    return "assignees";
  }
  @PostMapping("/")
  public String add(@ModelAttribute("assignee") Assignee assignee) {
    assigneeRepository.save(assignee);
    return "redirect:/assignees/";
  }

  @GetMapping("/{id}/delete")
  public String delete(@PathVariable Long id) {
    assigneeRepository.deleteById(id);
    return "redirect:/assignees/";
  }

  @GetMapping("/{id}/modify")
  public String showModify(Model model, @PathVariable Long id) {
    model.addAttribute("assignee", assigneeRepository.findById(id).get());
    return "modify";
  }

  @PostMapping("/{id}/modify")
  public String modify(@ModelAttribute("assignee") Assignee assignee) {
    assigneeRepository.save(assignee);
    return "redirect:/assignees/";
  }

}
