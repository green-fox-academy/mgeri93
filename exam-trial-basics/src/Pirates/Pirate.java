package Pirates;

public class Pirate {

  String name;
  int amountOfGold;
  int HP;
  boolean isCaptain;
  boolean hasWoodenLeg;

  public Pirate() {
    this.HP = 10;
    this.isCaptain = false;
    this.hasWoodenLeg = false;
  }

  public Pirate(boolean isCaptain) {
    this.HP = 10;
    this.isCaptain = true;
    this.hasWoodenLeg = false;
  }

  public Pirate(String name, int amountOfGold) {
    this.name = name;
    this.amountOfGold = amountOfGold;
    this.HP = 10;
    this.isCaptain = false;
    this.hasWoodenLeg = false;
  }

  public void setAmountOfGold(int amountOfGold) {
    this.amountOfGold = amountOfGold;
  }

  public void setHP(int HP) {
    this.HP = HP;
  }

  public void setCaptain(boolean captain) {
    isCaptain = captain;
  }

  public void setHasWoodenLeg(boolean hasWoodenLeg) {
    this.hasWoodenLeg = hasWoodenLeg;
  }


  public String getName() {
    return name;
  }

  public int getAmountOfGold() {
    return amountOfGold;
  }

  public int getHP() {
    return HP;
  }

  public boolean isCaptain() {
    return isCaptain;
  }

  public boolean isHasWoodenLeg() {
    return hasWoodenLeg;
  }

  public void work() {
    if (isCaptain) {
      this.amountOfGold += 10;
      this.HP -= 5;
    } else {
      this.amountOfGold += 1;
      this.HP -= 1;
    }

  }

  public void party() {
    if (isCaptain) {
      this.HP += 10;
    } else {
      this.HP += 1;
    }
  }

  public String toString() {
    if (hasWoodenLeg) {
      return "Hello, I'm " + this.name + ". I have a wooden leg and " + this.amountOfGold
          + " golds.";
    } else {
      return "Hello, I'm " + this.name + ". I still have my real legs and " + this.amountOfGold
          + " golds.";
    }
  }


}
