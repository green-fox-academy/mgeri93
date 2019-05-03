package AnimalProtection;

public abstract class Animal {

  String ownerName;
  boolean isHealthy;
  int healCost;
  String name;

  public void heal() {
    this.isHealthy = true;
  }

  public boolean isAdoptable() {
    if (this.isHealthy) {
      return true;
    } else {
      return false;
    }
  }

  public String toString() {
    if (isHealthy) {
      return "Hello, I'm " + this.name + ". I have a wooden leg and " + this.amountOfGold
          + " golds.";
    } else {
      return this.name + is not healthy (<heal cost>€), and not adoptable
    }
  }


}
