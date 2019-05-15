import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise10 {

/*  Create a Fox class with 3 properties:name, color and age Fill a list with at least 5 foxes and:

  Write a Stream Expression to find the foxes with green color!
  Write a Stream Expression to find the foxes with green color, and age less then 5 years!
  Write a Stream Expression to find the frequency of foxes by color!*/
  public static void main(String[] args) {

    List<Fox> foxes = new ArrayList<>();
    Fox fox1 = new Fox("foxy", "green", 1);
    Fox fox2 = new Fox("róka", "red", 2);
    Fox fox3 = new Fox("foxx", "green", 6);
    Fox fox4 = new Fox("vuk", "yellow", 1);
    Fox fox5 = new Fox("karak", "red", 4);

    foxes.add(fox1);
    foxes.add(fox2);
    foxes.add(fox3);
    foxes.add(fox4);
    foxes.add(fox5);

    foxes.stream()
        .filter(f -> f.getColor() == "green")
        .forEach(f -> System.out.println(f.getName()));

    foxes.stream()
        .filter(f -> f.getColor() == "green")
        .filter(age -> age.getAge() < 5)
        .forEach(f -> System.out.println(f.getName()));

    Map<String, Long> colorCount = foxes.stream()
        .collect(Collectors.groupingBy(f-> f.getColor(), Collectors.counting()));

    System.out.println(colorCount);




  }

  public static class Fox{

    String name;
    String color;
    int age;

    public Fox(String name, String color, int age) {
      this.name = name;
      this.color = color;
      this.age = age;
    }

    public String getName() {
      return name;
    }

    public String getColor() {
      return color;
    }

    public int getAge() {
      return age;
    }

    public void setName(String name) {
      this.name = name;
    }

    public void setColor(String color) {
      this.color = color;
    }

    public void setAge(int age) {
      this.age = age;
    }
  }



}
