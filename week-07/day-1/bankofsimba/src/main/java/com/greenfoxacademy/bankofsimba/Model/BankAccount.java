package com.greenfoxacademy.bankofsimba.Model;

public class BankAccount {

  String name;
  double balance;
  String animalType;
  String currency = "fabatka";
  boolean isKing = false;
  boolean isGood = true;

  public boolean isGood() {
    return isGood;
  }

  public void setGood(boolean good) {
    isGood = good;
  }

  public boolean isKing() {
    return isKing;
  }

  public void setKing(boolean king) {
    isKing = king;
  }

  public String showKing(){
    if (this.isKing()){
      return "KING";
    } else {
      return "Not King";
    }
  }

  public String showSide(){
    if(this.isGood){
      return "Good guy";
    } else {
      return "Bad guy";
    }
  }




  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public BankAccount(String name, int balance, String animalType) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
  }

  public BankAccount() {
  }

  public String getName() {
    return name;
  }

  public double getBalance() {
    return balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public void setName(String name) {

    this.name = name;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }
}
