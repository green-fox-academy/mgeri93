package com.foxclub.foxclub.Controller;

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

  @GetMapping("/index")
  public String index(){
    return "index";
  }

  @GetMapping("/login")
  public String login(){
    return "login";
  }

  @PostMapping("/login")
  public String post(@RequestParam("name") String name, Model model ){
    model.addAttribute("name", name);
    return "index";
  }

}
