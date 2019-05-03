package Restaurant;

public abstract class Employee {

  String name;
  int experience = 0;

  public Employee(String name) {
    this.name = name;
  }

  public abstract void work();

  public String getName() {
    return name;
  }

  public int getExperience() {
    return experience;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setExperience(int experience) {
    this.experience = experience;
  }
}
