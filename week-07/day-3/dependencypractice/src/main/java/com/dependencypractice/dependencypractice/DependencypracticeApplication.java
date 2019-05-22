package com.dependencypractice.dependencypractice;

import com.dependencypractice.dependencypractice.Service.BlueColor;
import com.dependencypractice.dependencypractice.Service.MyColor;
import com.dependencypractice.dependencypractice.Service.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependencypracticeApplication implements CommandLineRunner {

  private Printer printer;
  private MyColor myColor;

  @Autowired
  DependencypracticeApplication(@Qualifier("GreenColor") MyColor myColor, Printer printer){
    this.myColor = myColor;
    this.printer = printer;
  }

  public static void main(String[] args) {
    SpringApplication.run(DependencypracticeApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    printer.log("hello");
    myColor.printColor();
  }


}
