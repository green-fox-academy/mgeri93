package com.greenfoxacademy.bankofsimba.Conrtoller;

import com.greenfoxacademy.bankofsimba.Model.BankAccount;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BankController {

  List<BankAccount> accounts = new ArrayList<>();

  BankAccount Simba = new BankAccount("Simba", 2000, "lion");
  BankAccount Timon = new BankAccount("Timon", 500, "meerkat");
  BankAccount Pumba = new BankAccount("Pumba", 1500, "warthog");
  BankAccount Mufasa = new BankAccount("Mufasa", 15000, "lion");
  BankAccount Zordon = new BankAccount("Zordon", 10000, "lion");


  @GetMapping("/")
  public String index() {
    return "index";
  }

  @ModelAttribute
  public void setup(Model model) {
    accounts.add(Simba);
    Simba.setKing(true);
    accounts.add(Timon);
    accounts.add(Pumba);
    accounts.add(Mufasa);
    Mufasa.setKing(true);
    accounts.add(Zordon);
    Zordon.setGood(false);
    model.addAttribute(accounts);
  }

  @GetMapping("/enjoy")
  public String enjoy(){
    return "enjoy";
  }

  @GetMapping("/table")
  public String table(){
    return "table";
  }

  @GetMapping("/add")
  public String add(Model model, BankAccount account) {
    model.addAttribute("account",account);
    return "form";
  }

  @PostMapping("/form")
  public String handlingForm(BankAccount account) {
    if(account.isKing()){
      account.setBalance(account.getBalance()+100);
    } else{
      account.setBalance(account.getBalance()+10);
    }
    return "table";
  }

}
