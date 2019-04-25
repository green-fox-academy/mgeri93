public class Bird extends Animal implements Flyable {


  public Bird(String name) {
    this.name =name;
  }

  @Override
  public String breed() {
    return "laying eggs";
  }

  @Override
  public String move() {
    return "moves";
  }

  @Override
  public String eat() {
    return  "eats";
  }


  @Override
  public void land() {

  }

  @Override
  public void fly() {

  }

  @Override
  public void takeOff() {

  }
}
