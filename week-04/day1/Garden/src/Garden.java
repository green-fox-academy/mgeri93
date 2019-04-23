import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Garden {
  List<Flower> flowers = new ArrayList<>();
  List<Tree> trees = new ArrayList<>();
  List<Plant> plants = new ArrayList<>();
  String name;



  double water(int amount) {
    int fi = 0;
    int ti = 0;
    while ((!flowers.get(fi).isThirsty() && !trees.get(ti).isThirsty()) || amount <= 0) {
      for (Plant plant: plants ) {
        int i = 0;
        if (flowers.get(i).isThirsty()) {
          flowers.get(i).plantWater += 0.75;
          amount--;
        } if (trees.get(i).isThirsty()){
          trees.get(i).plantWater += 0.4;
          amount--;
        } else i++;
      } fi++;
        ti++;
    } return amount;
  }

  void info(){
    System.out.println("The garden has " + flowers.size() + " flowers and " + trees.size() + " trees." );
  }

  Garden (String name){
    this.name = name;
    this.flowers = new ArrayList<>();
    this.trees = new ArrayList<>();
    this.plants = new ArrayList<>();
  }



}
