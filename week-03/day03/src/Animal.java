public class Animal {
  int hunger = 50;
  int thirst = 50;

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


}
