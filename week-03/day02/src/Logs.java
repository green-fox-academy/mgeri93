import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Logs {
  public static void main(String[] args) {
    // Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP adresses.
// Write a function that returns the GET / POST request ratio.
    getAddress("log.txt");
    getPostRatio("log.txt");
  }

  public static void getAddress(String fileName) {
    try {
      Path path = Paths.get(fileName);
      List<String> data = Files.readAllLines(path);
      List<String> addresses = new ArrayList<>();
      for (String s : data) {
        addresses.add(s.substring(27, 38));
      }
      Set<String> uniqueIPs = new HashSet<String>(addresses);
      for (String ip : uniqueIPs) {
        System.out.println(ip);
      }
    } catch (IOException e) {
      System.out.println("Unable to retrieve unique IP addresses.");
    }


  }

  public static void getPostRatio(String fileName) {
    try {
      Path path = Paths.get(fileName);
      List<String> data = Files.readAllLines(path);
      double get = 0;
      double post = 0;
      for (String s : data) {
        if (s.contains("GET")) {
          get++;
        } else {
          post++;
        }
      }
      System.out.println(get/post);
    } catch (IOException e) {
      System.out.println("Unable to retrieve GET / POST ratio.");
    }


  }

}
