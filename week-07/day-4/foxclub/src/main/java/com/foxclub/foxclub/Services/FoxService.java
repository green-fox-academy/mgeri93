package com.foxclub.foxclub.Services;

import com.foxclub.foxclub.Model.Fox;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class FoxService {

  List<Fox> foxes;

  public FoxService() {
    foxes =  new ArrayList<>();
  }

  public void add(String name){
    foxes.add(new Fox(name));
  }

  public Fox findFoxByName(String name) {
    for(Fox fox : foxes) {
      if(fox.getName().equals(name)) {
        return fox;
      }
    }

    return null;
  }

}
