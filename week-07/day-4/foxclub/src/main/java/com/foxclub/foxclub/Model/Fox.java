package com.foxclub.foxclub.Model;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class Fox {

  private String name;
  private List tricks = new ArrayList<>();
  private String food;
  private String drink;
  private String [] diet = new String[2];

  public Fox(String name, List tricks, String food, String drink) {
    this.name = name;
    this.tricks = tricks;
    this.food = food;
    this.drink = drink;
  }

  public Fox(String name) {
    this.name = name;
  }

  public Fox() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List getTricks() {
    return tricks;
  }

  public void setTricks(List<String> tricks) {
    this.tricks = tricks;
  }

  public String getFood() {
    return food;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public String getDrink() {
    return drink;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }

  public String[] getDiet() {
    return diet;
  }

  public void setDiet(String[] diet) {
    this.diet = diet;
  }

}

