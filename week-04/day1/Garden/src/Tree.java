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

  List addTree(Tree tree){
    trees.add(tree);
    plants.add(tree);
    return trees;
  }

}
