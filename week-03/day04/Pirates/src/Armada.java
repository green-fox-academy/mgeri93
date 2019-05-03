import java.util.ArrayList;
import java.util.List;

public class Armada {
  List<Ship> fleet;

  public Armada() {
    this.fleet = new ArrayList<>();
  }

  List<Ship> assembleFleet() {
    int ships = (int) (Math.random() * 6 + 1);
    for (int i = 0; i < ships; i++) {
      Ship ship = new Ship();
      ship.fillShip();
      fleet.add(ship);
    }
    return fleet;
  }

  boolean war(Armada enemy){
    int allyShips = 0;
    int enemyShips = 0;


  }

}
