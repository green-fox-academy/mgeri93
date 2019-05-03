package Restaurant;

import java.util.List;

public class Restaurant {

  String name;
  int foundedIn;
  List<Employee> employees;

  public void guestsArrived() {
    for (Employee employee : employees) {
      employee.work();
    }
  }

  public void hire(Employee employee) {
    employees.add(employee);
  }

  public String getName() {
    return name;
  }

  public int getFoundedIn() {
    return foundedIn;
  }
}
