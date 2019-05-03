package Restaurant;

import java.util.List;

public class Restaurant {

  String name;
  int foundedIn;
  List<Employee> restaurant;

  public void guestsArrived() {
    for (Employee employee : restaurant) {
      employee.work();
    }
  }

  public void hire(Employee employee) {
    restaurant.add(employee);
  }

  public String getName() {
    return name;
  }

  public int getFoundedIn() {
    return foundedIn;
  }

  public List<Restaurant.Employee> getRestaurant() {
    return restaurant;
  }

}
