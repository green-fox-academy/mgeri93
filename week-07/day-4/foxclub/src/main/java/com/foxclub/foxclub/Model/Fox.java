package com.foxclub.foxclub.Model;

public class Fox {

  private String name;
  private int tricks;

  public Fox(String name, int tricks) {
    this.name = name;
    this.tricks = tricks;
  }

  public Fox() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getTricks() {
    return tricks;
  }

  public void setTricks(int tricks) {
    this.tricks = tricks;
  }
}
