import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Maps2 {
  public static void main(String[] args) {

    HashMap map = new HashMap();
    map.put("978-1-60309-452-8", "A Letter to Jo");
    map.put("978-1-60309-459-7", "Lupus");
    map.put("978-1-60309-444-3", "Red Panda and Moon Bear");
    map.put("978-1-60309-461-0", "The Lab");

    List keys = new ArrayList();
    keys.addAll(map.keySet());
    List values = new ArrayList();
    values.addAll(map.values());

    for (int i = 0; i < map.size(); i++) {
      System.out.println(values.get(i) + "(ISBN: " + keys.get(i) + ")");
    }
    map.remove("978-1-60309-444-3");
    map.values().remove("The Lab");
    map.put("978-1-60309-450-4", "They Called Us Enemy");
    map.put("978-1-60309-453-5", "Why Did We Trust Him?");

    if (map.containsKey("478-0-61159-424-8")){
      System.out.println("There is an associated value with key 478-0-61159-424-8");
    } else {
      System.out.println("There is NO associated value with key 478-0-61159-424-8");
    }
    System.out.println(map.get("978-1-60309-453-5"));
  }
}

