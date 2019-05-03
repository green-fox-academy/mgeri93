package Restaurant;

public class Waiter extends Employee {

  int tips = 0;

  public Waiter(String name) {
    super(name);
  }


  @Override
  public void work() {
    this.tips++;
    this.experience++;
  }
}
