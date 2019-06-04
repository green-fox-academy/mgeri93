package com.example.demo.Model;

public class Doubling {

  public Doubling(Integer received) {
    this.received = received;
    this.result = received*2;
  }



  public Doubling() {
    this.error = new Error("Please provide an input!");
  }

  public Integer getReceived() {
    return received;
  }

  public void setReceived(Integer received) {
    this.received = received;
  }

  public Integer getResult() {
    return received*2;
  }

  public void setResult(Integer result) {
    this.result = result;
  }


  private Integer received;
  private Integer result;
  private Error error;


}
