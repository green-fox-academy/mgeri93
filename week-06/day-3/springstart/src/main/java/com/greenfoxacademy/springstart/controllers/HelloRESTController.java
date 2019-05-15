package com.greenfoxacademy.springstart.controllers;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
/*@RequestMapping("/hello")
@ResponseBody
public String hello(){
    return "Hello World";
    }*/

public class HelloRESTController {

  AtomicLong atomicLong = new AtomicLong(1);

  @RequestMapping("/greeting")
  @ResponseBody
  public Greeting greeting(@RequestParam String name){
    return new Greeting(atomicLong.getAndAdd(1),"Hello, " + name);
  }

}
