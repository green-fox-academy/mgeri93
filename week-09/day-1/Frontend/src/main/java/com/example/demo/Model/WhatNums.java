package com.example.demo.Model;

public class WhatNums {

  private String what;
  /* sum, multiply, double*/
  private int[] numbers;

  public WhatNums() {
  }

  public WhatNums(String what, int[] numbers) {
    this.what = what;
    this.numbers = numbers;
  }

  public String getWhat() {
    return what;
  }

  public void setWhat(String what) {
    this.what = what;
  }

  public int[] getNumbers() {
    return numbers;
  }

  public void setNumbers(int[] numbers) {
    this.numbers = numbers;
  }
}
