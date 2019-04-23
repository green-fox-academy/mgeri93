import java.util.ArrayList;
import java.util.List;

public class Flower extends Plant {

  boolean isThirsty() {
    if (this.plantWater < 5) {
      return true;
    } else return false;
  }

  Flower(String color) {
    this.color = color;
    this.plantWater = 0;
  }

  List<Flower> flowers = new ArrayList<>();

  List addFlower(Flower flower){
    flowers.add(flower);
    plants.add(flower);
    return flowers;
  }

}
