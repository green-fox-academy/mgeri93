package com.example.demo.Model;

import static java.util.Collections.emptyList;

import org.springframework.security.core.userdetails.User;
import com.example.demo.Repository.ApplicationUserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

  private ApplicationUserRepository applicationUserRepository;

  public UserDetailsServiceImpl(ApplicationUserRepository applicationUserRepository){
    this.applicationUserRepository = applicationUserRepository;
  }

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
    ApplicationUser applicationUser = applicationUserRepository.findByUsername(username);
    if(applicationUser == null){
      throw new UsernameNotFoundException(username);
    }
    return  new User(applicationUser.getUsername(), applicationUser.getPassword(), emptyList());

  }

}
