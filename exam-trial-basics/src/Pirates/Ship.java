package Pirates;

import java.util.ArrayList;
import java.util.List;

public class Ship {

  List<Pirate> pirates;
  Pirate captain = new Pirate(true);
  int crew = 1;

  public void addPirate() {
    pirates.add(new Pirate());
    crew++;
  }

  public List getPoorPirates() {
    List poorPirates = new ArrayList();
    for (Pirate pirate : this.pirates) {
      if (pirate.hasWoodenLeg && pirate.amountOfGold < 15) {
        poorPirates.add(pirate.name);
      }
    }
    return poorPirates;
  }

  public int getGolds() {
    int sum = 0;
    for (Pirate pirate : this.pirates) {
      sum += pirate.amountOfGold;
    }
    return sum;
  }

  public void lastDayOnTheShip() {
    for (Pirate pirate : this.pirates) {
      pirate.party();
    }
  }

  public void prepareForBattle() {
    for (int i = 0; i < 5; i++) {
      for (Pirate pirate : this.pirates) {
        pirate.work();
      }
    }
    lastDayOnTheShip();
  }

}