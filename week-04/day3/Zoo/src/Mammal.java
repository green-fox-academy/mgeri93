public class Mammal extends Animal {

  public Mammal(String name) {
    this.name =name;
  }

  @Override
  public String breed() {
   return "pushing miniature versions out";
  }

  @Override
  public String move() {
    return "moves";
  }

  @Override
  public String eat() {
    return  "eats";
  }
}
