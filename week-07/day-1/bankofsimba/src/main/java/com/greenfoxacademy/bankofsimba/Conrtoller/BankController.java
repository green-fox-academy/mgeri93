package com.greenfoxacademy.bankofsimba.Conrtoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BankController {

  @GetMapping("/show")
  public String index() {
    return "index";
  }



}
