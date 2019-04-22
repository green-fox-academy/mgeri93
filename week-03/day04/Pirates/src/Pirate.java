public class Pirate {
  int rum = 0;
  boolean isAsleep = false;
  boolean isDead = false;
  int parrot;
  boolean Captain = false;


  public Pirate() {

  }

  void drinkSomeRum() {
    if (!this.isDead) {
      this.rum++;
    } else {
      System.out.println("'Arghh, I'ma Pirate. How d'ya d'ink its goin?'");
    }

  }

  void howsItGoingMate() {
    if (!this.isDead) {
      if (this.rum < 5) {
        System.out.println("'Pour me anudder!'");
      } else {
        System.out.println("'Arghh, I'ma Pirate. How d'ya d'ink its goin?'");
        this.isAsleep = true;
      }
    } else System.out.println("he's dead");
  }

  void sleep() {
    System.out.println("The pirate fall asleep");
    this.isAsleep = true;
  }

  void die() {
    this.isDead = true;
  }

  void brawl(Pirate anotherPirate) {
    if (!this.isDead && !anotherPirate.isDead) {
      if ((int) (Math.random() * 3) == 1) {
        this.isDead = true;
      } else if ((int) (Math.random() * 3) == 2) {
        anotherPirate.isDead = true;
      } else {
        this.isAsleep = true;
        anotherPirate.isAsleep = true;
      }
    } else System.out.println("he's dead");
  }

  String getState() {
    if (this.isDead) {
      return "dead";
    }
    if (this.isAsleep) {
      return "passed out";
    }
    return "active";
  }


}
