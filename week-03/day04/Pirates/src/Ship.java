import java.util.ArrayList;
import java.util.List;

public class Ship {
  List<Pirate> pirates;

  public Ship() {
    this.pirates = new ArrayList<>();
  }

  void battle(Ship ship){

  }


  void addPirate() {
    pirates.add(new Pirate());
  }

  void fillShip() {
    for (int i = 0; i < 1 + (int) (Math.random() * 200); i++) {
      addPirate();
    }
  }


}
