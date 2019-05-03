package MostRainyDays;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class MostRainyDays {

  public static void main(String[] args) {

    System.out.println(mostRainyCity("cities.csv"));
  }

  public static String mostRainyCity(String filename) {
    Path filePath = Paths.get(filename);
    String result = "";
    List<String> cities = new ArrayList();
    List<String> cityNames = new ArrayList<>();
    HashMap<String, Integer> cityCounter = new HashMap<>();

    try {
      List<String> content = Files.readAllLines(filePath);
      for (String line : content) {
        cities.add(line.substring(11));
      }

      for (String line : cities) {
        if (line.contains("RAINY")) {
          cityNames.add(line.substring(0, line.indexOf(",")));
        }
      }

      for (String city : cityNames) {
        if (!cityCounter.containsKey(city)) {
          cityCounter.put(city, 0);
        }
        cityCounter.put(city, cityCounter.get(city) + 1);
      }

      int max = Collections.max(cityCounter.values());
      for (String city : cityCounter.keySet()) {
        if (cityCounter.get(city).equals(max)) {
          result = result + city + " ";
        }
      }

    } catch (IOException e) {
      System.out.println("Cannot read file.");
    }
    return result;
  }
}
