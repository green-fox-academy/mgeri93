import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<Flower> flowers = new ArrayList<>();
    List<Tree> trees = new ArrayList<>();
    List<Plant> plants = new ArrayList<>();

    Garden garden = new Garden("garden");

    Flower yellow = new Flower("yellow");
    //yellow.addFlower(yellow);
    plants.add(yellow);
    garden.addFlower(yellow);
    Flower blue = new Flower("blue");
    //blue.addFlower(blue);
    plants.add(blue);
    garden.addFlower(blue);
    Tree purple = new Tree("purple");
    //purple.addTree(purple);
    plants.add(purple);
    garden.addTree(purple);
    Tree orange = new Tree("orange");
    // orange.addTree(orange);
    plants.add(orange);
    garden.addTree(orange);

    garden.info();

    garden.water(40);


  }
}
