package com.todo.todo.Model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Assignee {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private String email;
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "assignee")
  private List<Todo> todos;

  public Assignee(String name, String email) {
    this.name = name;
    this.email = email;
  }

  public Assignee() {
  }
}
