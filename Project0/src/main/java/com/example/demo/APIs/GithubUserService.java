package com.example.demo.APIs;


import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Path;
import java.io.IOException;

@Service
public class GithubUserService {

  private GithubUserInterface githubUserInterface;
  private GithubUserRepo githubUserRepo;

  public GithubUserService(GithubUserRepo githubUserRepo) {
    this.githubUserRepo = githubUserRepo;
    Retrofit retrofit = new Retrofit.Builder()
        .baseUrl("https://api.github.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build();

    this.githubUserInterface = retrofit.create(GithubUserInterface.class);
  }

  public void save(GithubUser githubUser){
    githubUserRepo.save(githubUser);
  }

  public List<GithubUser> findAll(){
    List<GithubUser> githubUsers = new ArrayList<>();
    githubUserRepo.findAll().forEach(githubUser -> githubUsers.add(githubUser));
    return githubUsers;
  }

  public GithubUser getGithubUser() throws IOException {
    Call<GithubUser> callSync = githubUserInterface.showGithubUser("mgeri93");

    Response<GithubUser> response = callSync.execute();
    return response.body();
  }


}