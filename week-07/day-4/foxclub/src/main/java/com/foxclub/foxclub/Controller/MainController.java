package com.foxclub.foxclub.Controller;

import com.foxclub.foxclub.Model.Fox;
import com.foxclub.foxclub.Services.FoxService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  private FoxService foxService;

  public MainController(FoxService foxService) {
    this.foxService = foxService;
  }

  @GetMapping("/")
  public String index(@RequestParam(name = "name", required = false) String name, Model model) {
    if (name == null) {
      return "login";
    } else {
      model.addAttribute("fox", foxService.findFoxByName(name));
      return "index";
    }
  }

  @GetMapping("/nutritionStore")
  public String nutritionStore(@RequestParam(name = "name") String name, Model model) {
    model.addAttribute("name", name);
    return "nutritionStore";
  }

  @PostMapping("/nutritionStore")
  public String feed(String name, String food, String drink,
      Model model) {
    return "redirect:/?name=" + name;
  }


  @PostMapping("/login")
  public String post(String name) {
    foxService.add(name);
    return "redirect:/?name=" + name;
  }


}
