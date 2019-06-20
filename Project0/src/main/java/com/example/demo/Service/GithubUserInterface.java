package com.example.demo.Service;


import com.example.demo.Model.GithubUser;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GithubUserInterface {

  @GET("/users/{username}")
  Call<GithubUser> showGithubUser(@Path("username") String userName);
}
