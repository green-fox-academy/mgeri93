import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Garden {

  List<Flower> flowers = new ArrayList<>();
  List<Tree> trees = new ArrayList<>();
  List<Plant> plants = new ArrayList<>();
  String name;


  void water(int amount) {
    int fi = 0;
    int ti = 0;
    while ((!flowers.get(fi).isThirsty() && !trees.get(ti).isThirsty()) || amount <= 0) {
      for (int i = 0; i < plants.size(); i++) {
        if (flowers.get(i).isThirsty()) {
          flowers.get(i).plantWater += 0.75;
          amount--;
        }
        if (trees.get(i).isThirsty()) {
          trees.get(i).plantWater += 0.4;
          amount--;
        } else {
          i++;
        }
      }
      fi++;
      ti++;
    }
  }

  void info() {
    System.out
        .println("The garden has " + flowers.size() + " flowers and " + trees.size() + " trees.");
  }

  List addFlower(Flower flower) {
    flowers.add(flower);
    return flowers;
  }

  List addTree(Tree tree) {
    trees.add(tree);
    return trees;
  }

  Garden(String name) {
    this.name = name;
    this.flowers = new ArrayList<Flower>();
    this.trees = new ArrayList<Tree>();
    this.plants = new ArrayList<Plant>();
  }

  void status() {

  }



}
