package Restaurant;

import java.util.HashMap;

public class Chef extends Employee {

  public HashMap<String, Integer> meals = new HashMap();

  public Chef(String name) {
    super(name);
  }

  @Override
  public void work() {
    this.experience++;
  }

  public void cook(String food) {
    if (!meals.containsKey(food)) {
      meals.put(food, 1);
    } else {
      meals.put(food, meals.get(food) + 1);
    }
  }

  public HashMap<String, Integer> getMeals() {
    return meals;
  }

  public void setMeals(HashMap<String, Integer> meals) {
    this.meals = meals;
  }
}
