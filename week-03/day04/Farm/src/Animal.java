public class Animal {
  int hunger = 50;
  int thirst = 50;

  public Animal(){

  }

  public Animal(int hunger, int thirst){

  }

  void eat() {
    hunger--;
  }

  void drink() {
    this.thirst--;

  }

  void play() {
    this.hunger++;
    this.thirst++;

  }

  public int getHunger(){
    return  hunger;
  }


}
