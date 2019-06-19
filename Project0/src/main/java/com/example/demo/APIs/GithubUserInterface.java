package com.example.demo.APIs;


import com.example.demo.APIs.GithubUser;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface GithubUserInterface {

  @GET("/users/{username}")
  Call<GithubUser> showGithubUser(@Path("username") String userName);
}
