package com.example.demo.APIs;

import com.sun.javafx.beans.IDProperty;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class GithubUser {

  @Id
  private long id;

  private String login;
  private String url;

  public GithubUser() {
  }

  public GithubUser(String login, long id, String url, String company, String blog,
      String email) {
    this.login = login;
    this.id = id;
    this.url = url;
  }

  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }



  @Override
  public String toString() {
    return "User{" + "login=" + login + ", id=" + id + ", url=" + url +'}';
  }

}