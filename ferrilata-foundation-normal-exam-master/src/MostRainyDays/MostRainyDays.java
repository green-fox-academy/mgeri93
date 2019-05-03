package MostRainyDays;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class MostRainyDays {

  public static String mostRainyCity(String filename) {
    Path filePath = Paths.get(filename);
    String result = "";
    List<String> cities = new ArrayList();
    List<String> cityNames = new ArrayList<>();

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


    } catch (IOException e) {
      System.out.println("Cannot read file.");
    }

  }
}
