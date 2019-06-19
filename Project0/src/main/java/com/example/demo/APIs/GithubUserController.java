package com.example.demo.APIs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class GithubUserController {

  private GithubUserService githubUserService;

  @Autowired
  public GithubUserController(GithubUserService githubUserService){
    this.githubUserService = githubUserService;
  }

  @GetMapping("/user")
  public ResponseEntity showUser(){
    try {
      githubUserService.save(githubUserService.getGithubUser());
      return ResponseEntity.ok().body(githubUserService.getGithubUser());
    } catch (IOException e) {
      e.printStackTrace();
    }
    return ResponseEntity.badRequest().build();
  }

}
