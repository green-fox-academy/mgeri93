import java.util.ArrayList;
import java.util.List;

public class Ship {
  List<Pirate> pirates;
  Pirate captain;
  boolean isFilled = false;
  int piratesOnBoard = 0;


  public Ship() {
    this.pirates = new ArrayList<>();
  }

  void addPirate() {
    pirates.add(new Pirate());
    piratesOnBoard++;
    this.isFilled = true;
  }

  void fillShip() {
    this.captain= new Pirate();
    for (int i = 0; i < (int) (Math.random() * 10); i++) {
      addPirate();
      piratesOnBoard++;
      this.isFilled = true;

    }
  }


  boolean battle(Ship otherShip) {
    boolean isWinning = this.battleScore() >= otherShip.battleScore();
    if (isWinning) {
      winBattle();
      otherShip.loseBattle();
    } else {
      loseBattle();
      otherShip.winBattle();
    }
    return isWinning;
  }


  int deadPirates() {
    int deadPirate = 0;
    for (Pirate pirate : this.pirates) {
      if (pirate.isDead) {
        deadPirate++;
      }
    }
    return deadPirate;
  }

  int sleepingPirates() {
    int numOfSleepingPirates = 0;
    for (Pirate pirate : this.pirates) {
      if (pirate.isAsleep) {
        numOfSleepingPirates++;
      }
    }
    return numOfSleepingPirates;
  }

  int battleScore() {
    return this.piratesOnBoard - deadPirates() - this.captain.rum;
  }

  void loseBattle() {
    int losses = (int) (Math.random() * this.piratesOnBoard + 1);
    for (int i = 0; i < losses; i++) {
      this.pirates.get(i).die();
    }
  }

  void winBattle() {
    for (int i = 0; i < (int) (Math.random() * 5 + 1); i++) {
      haveAParty();
    }
  }

  private void haveAParty() {
    this.captain.drinkSomeRum();
    for (Pirate pirate : this.pirates) {
      pirate.drinkSomeRum();
    }
  }

  //@Override

  public String toString() {
    if (!this.isFilled) {
      return "This ship has no crew";
    }
    return "\nInformation:\n"
            + "The ship has a captain and " + piratesOnBoard + " pirates on board.\n"
            + "The captain drank " + this.captain.rum + "rums and is " + this.captain.getState() + ".\n"
            + "There are " + sleepingPirates() + " passed out and " + deadPirates() + " dead pirates in the crew.";
  }


}
