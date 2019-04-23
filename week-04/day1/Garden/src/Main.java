import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args){
    //two flowers (yellow and blue) and two trees (purple and orange)
    List<Flower> flowers = new ArrayList<>();
    List<Tree> trees = new ArrayList<>();
    List<Plant> plants = new ArrayList<>();



    Flower yellow = new Flower("yellow");
    flowers.add(yellow);
    plants.add(yellow);
    Flower blue = new Flower("blue");
    flowers.add(blue);
    plants.add(blue);
    Tree purple = new Tree("purple");
    trees.add(purple);
    plants.add(purple);
    Tree orange = new Tree("orange");
    trees.add(orange);
    plants.add(orange);






  }
}
