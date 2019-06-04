package com.example.demo.Model;

public class Handler {


  private int[] result;

  public int[] sum(int[] numbers) {
    int c = 0;
    int[] summed = new int[1];
    for (int i = 0; i < 4; i++) {
      c = c + numbers[i];
    }
    summed[0] = c;
    return summed;
  }

  public int[] multiply(int[] numbers) {
    int c = 1;
    int[] multiplied = new int[1];
    for (int i = 0; i < 4; i++) {
      c = c * numbers[i];
    }
    multiplied[0] = c;
    return multiplied;
  }

  public int[] doubler(int[] numbers) {
    int[] doubled = new int[4];
    for (int i = 0; i < 4; i++) {
      doubled[i] = numbers[2 * i];
    }
    return doubled;
  }

  public Handler() {
  }

  public Handler(WhatNums whatNums) {
    if (whatNums.getWhat().equals("sum")) {
      this.result = sum(whatNums.getNumbers());
    } else if (whatNums.getWhat().equals("multiply")) {
      this.result = multiply(whatNums.getNumbers());
    } else if (whatNums.getWhat().equals("double")){
      this.result = doubler(whatNums.getNumbers());
    }
  }

}
