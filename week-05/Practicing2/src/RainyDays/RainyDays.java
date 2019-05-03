package RainyDays;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RainyDays {

  /*
    Write a method which can read and parse a file containing information about weather in various cities.
    The method must return the name of the city which had the most rainy days.
  */
  public static void main(String[] args) {

    System.out.println(
        mostRainyCity("C:\\greenfox\\mgeri93\\week-05\\Practicing2\\src\\RainyDays\\cities.csv"));
  }

  public static String mostRainyCity(String filename) {

    Path filePath = Paths.get(filename);
    List<String> cities = new ArrayList();
    List<String> cityNames = new ArrayList<>();
    String result = "";

    HashMap<String, Integer> cityCounter = null;
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

      cityCounter = new HashMap<>();

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
