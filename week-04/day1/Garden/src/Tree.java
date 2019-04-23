import java.util.ArrayList;
import java.util.List;

public class Tree extends Plant {

  boolean isThirsty() {
    if (this.plantWater < 10) {
      return true;
    } else return false;
  }

  Tree(String color) {
    this.color = color;
    this.plantWater = 0;
  }
  List<Tree> trees = new ArrayList<>();

  void addTree(Tree tree){
    trees.add(tree);
    plants.add(tree);
  }

  void getTrees() {
    for (int j = 0; j < trees.size(); j++) {
      System.out.println(trees.get(j));
    }
  }

}
