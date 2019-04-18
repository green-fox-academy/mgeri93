import java.util.ArrayList;
import java.util.List;

public class Teacher {

  public Teacher() {
  }

  public static void teach() {
    Student.learn();
  }

  public static void answer() {
    System.out.println("The teacher answers.");
  }
}
