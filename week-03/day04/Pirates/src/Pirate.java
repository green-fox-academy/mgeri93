public class Pirate {
  int rum = 0;
  boolean isAsleep = false;
  boolean isDead = false;
  int parrot;


  public Pirate() {

  }

  void drinkSomeRum() {
    //this.isDead = true ? System.out.println("he's dead") : this.rum++;  //ask this

  }

  void howsItGoingMate() {
    if (!this.isDead) {
      if (this.rum < 5) {
        System.out.println("'Pour me anudder!'");
      } else {
        System.out.println("'Arghh, I'ma Pirate. How d'ya d'ink its goin?'");
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

  void brawl(Pirate pirate) {
    if (!this.isDead && !pirate.isDead) {
      if ((int) (Math.random() * 3) == 1) {
        this.isDead = true;
      } else if ((int) (Math.random() * 3) == 2) {
        pirate.isDead = true;
      } else {
        this.isDead = true;
        pirate.isDead = true;
      }
    } else System.out.println("he's dead");
  }


}
