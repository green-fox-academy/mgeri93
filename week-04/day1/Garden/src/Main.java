import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args){
    //two flowers (yellow and blue) and two trees (purple and orange)
    List<Flower> flowers = new ArrayList<>();
    List<Tree> trees = new ArrayList<>();
    List<Plant> plants = new ArrayList<>();




    Flower yellow = new Flower("yellow");
    yellow.addFlower(yellow);
    Flower blue = new Flower("blue");
    blue.addFlower(blue);
    Tree purple = new Tree("purple");
    purple.addTree(purple);
    Tree orange = new Tree("orange");
    orange.addTree(orange);





    System.out.println("The garden has " + flowers.size() + " flowers and " + trees.size() + " trees." );










  }
}
