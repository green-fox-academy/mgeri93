package com.example.demo.Controller;


import com.example.demo.Model.AppendA;
import com.example.demo.Model.DoUntil;
import com.example.demo.Model.Doubling;
import com.example.demo.Model.Error;
import com.example.demo.Model.Greeter;
import com.example.demo.Model.Handler;
import com.example.demo.Model.Until;
import com.example.demo.Model.WhatNums;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class RestController {

  @RequestMapping("/doubling")
  public Object doubling(@RequestParam(value = "input", required = false) Integer input){
    if (input != null){
      return new Doubling(input);
    } else {
      return new Error("Please provide an input!");
      }
    }
  @RequestMapping("/greeter")
  public Object greeter(@RequestParam (value= "name", required = false) String name,@RequestParam(value = "title", required = false) String title) {
    if (name == null && title == null) {
      return new Error("Please provide a name and a title!");
    } else if
      (name == null){
      return new Error("Please provide a name!");
    } else if (title == null){
      return new Error("Please provide a title!");
    } else return new Greeter(name,title);
  }

  @RequestMapping("/appenda/{appendable}")
  public  Object appendA(@PathVariable(value = "appendable") String appendable){
    return new AppendA(appendable);
  }

  @PostMapping("/dountil/{action}")
  public Object doUntil(@PathVariable(value = "action") String action, @RequestBody Until until){
    if (until == null){
      return new Error("Please provide a number!");
    } else {
      return new DoUntil(until, action);
    }
  }

  @PostMapping("/arrays")
  public Object arrayHandler(@RequestBody WhatNums whatNums){
    if (whatNums == null ){
      return  new Error ("Please provide what to do with the numbers!");
    } else {
      return  new Handler(whatNums);
    }
  }


}
