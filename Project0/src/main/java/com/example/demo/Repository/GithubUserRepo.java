package com.example.demo.Repository;

import com.example.demo.Model.GithubUser;
import org.springframework.data.repository.CrudRepository;

public interface GithubUserRepo extends CrudRepository<GithubUser, Long> {

}
