package com.dependencypractice.dependencypractice.Controller;

import com.dependencypractice.dependencypractice.Service.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

  UtilityService utilityService;

  public HomeController() {
  }

  @Autowired
  public HomeController(UtilityService utilityService){
    this.utilityService = utilityService;
  }

  @GetMapping("/useful")
  public String useful(){
    return "useful";
  }


  @GetMapping("/useful/colored")
  public String colored(Model model){
    model.addAttribute("color",utilityService.randomColor());
    return "useful";
  }

  @GetMapping("/useful/email")
  public String email(@RequestParam("email") String email, Model model){
    model.addAttribute("address", email);
    if(utilityService.validateEmail(email)) {
      model.addAttribute("validate", "is a valid email address");
      model.addAttribute("validatecolor", "Color: green");
    } else {
      model.addAttribute("validate", "is not a valid email address");
      model.addAttribute("validatecolor", "Color: red;");
    }
      return "email";
  }

  @GetMapping("/useful/encode")
  public String encode(@RequestParam("text") String text, @RequestParam("number") int number, Model model){
    model.addAttribute("encoded",utilityService.caesar(text,number));
    return "useful";
  }

  @GetMapping("/useful/decode")
  public String decode(@RequestParam("text") String text, @RequestParam("number") int number, Model model) {
    model.addAttribute("decoded", utilityService.caesar(text, -number));
    return "useful";
  }

}
