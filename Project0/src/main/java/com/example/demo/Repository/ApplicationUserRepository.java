package com.example.demo.Repository;

import com.example.demo.Model.ApplicationUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationUserRepository extends JpaRepository<ApplicationUser, Long> {

  ApplicationUser findByUsername(String name);

}
