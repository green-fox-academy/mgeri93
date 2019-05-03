package Restaurant;

public abstract class Employee {

  String name;
  int experience = 0;

  public Employee(String name) {
    this.name = name;
  }

  public abstract void work();

}
