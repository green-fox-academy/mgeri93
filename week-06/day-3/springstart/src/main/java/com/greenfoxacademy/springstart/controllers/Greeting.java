package com.greenfoxacademy.springstart.controllers;

public class Greeting {

  long id;
  String content;


  public Greeting(long id, String content) {
    this.id = id;
    this.content = content;
  }

  public String getContent() {
    return content;
  }
  public long getId() {
    return id;
  }


}
