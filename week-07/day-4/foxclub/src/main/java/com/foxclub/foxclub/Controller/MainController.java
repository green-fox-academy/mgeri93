package com.foxclub.foxclub.Controller;

import com.foxclub.foxclub.Model.Fox;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/*he input field should be a form and should send the value of name field of the Fox.class (for further explanations see below)
    create 2 /login endpoints (GET and POST)
    GET method should render the login.html
    POST method should receive name value as @RequestParam like this, then it should redirect to the main page / with the value of the @RequestParam
from now on every endpoint should require this @RequestParam (by default it is required)
optional: in case the given parameter value is a new one, the program should redirect to login
    optional: in case there is no given parameter in the path the program should automatically redirect to login
    optional: show error message with red on the login page i.e.: "You have provided a name that has not been used before, add it as a new one!"*/
@Controller
public class MainController {

  List<Fox> foxes = new ArrayList<>();


  @GetMapping("/")
  public String index(@RequestParam (name = "name", required = false) String name, Model model){
    if (name == null) {
      return "redirect:/login";
    } else {
      foxes.add(new Fox(name));
      model.addAttribute("name", name);
      model.addAttribute("numberOfTricks", foxes.get(foxes.size() - 1).getTricks().size());
      model.addAttribute("diet", foxes.get(foxes.size()-1).getDiet()[0]);
      model.addAttribute("food", foxes.get(foxes.size() - 1).getDiet()[0]);
      model.addAttribute("drink", foxes.get(foxes.size() - 1).getDiet()[1]);
      model.addAttribute("tricks", foxes.get(foxes.size() - 1).getTricks());
      return "index";
    }
  }

  @GetMapping("/nutritionStore")
  public String nutritionStore(@RequestParam (name = "name") String name, Model model){
    return "nutritionStore";
  }

  @GetMapping("/login")
  public String login(){
    return "login";
  }

  @PostMapping("/login")
  public String post(@RequestParam("name") String name, Model model ){
    model.addAttribute("name", name);
    return "redirect:/?name=" +name;
  }



}
