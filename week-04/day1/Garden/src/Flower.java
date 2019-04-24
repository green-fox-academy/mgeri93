import java.util.ArrayList;
import java.util.List;

public class Flower extends Plant {

  boolean isThirsty() {
    if (this.plantWater < 5) {
      return true;
    } else return false;
  }

  double absorb = 0.25;

  Flower(String color) {
    this.color = color;
    this.plantWater = 0;
  }

  List<Flower> flowers = new ArrayList<>();

  void addFlower(Flower flower) {
    flowers.add(flower);
    plants.add(flower);
  }

 /* String getFlowers() {
    for (int j = 0; j < flowers.size(); j++) {
      flowers.get(j);
    }
  }*/
}
