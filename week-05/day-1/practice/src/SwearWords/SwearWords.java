package SwearWords;

import com.sun.xml.internal.fastinfoset.util.StringArray;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SwearWords {

  //Write a method which can read and parse a file containing not so family friendly text.
  // The method must remove all the given words from the file and return the amount of the removed words.
  // ['fuck', 'bloody', 'cock', 'shit', 'fucker', 'fuckstick', 'asshole', 'dick', 'piss', 'cunt']
  // Output: 17,
  //"fuck", "bloody", "cock", "shit", "fucker", "fuckstick", "asshole", "dick", "piss", "cunt",

  public int countSwearWords(String filename) {

    int sum = 0;
    String[] words = new String[0];
    Map<String, Integer> swearWords = new HashMap<>();
    //int n = 0;
    swearWords.put("fuck", 0);
    swearWords.put("bloody", 0);
    swearWords.put("cock", 0);
    swearWords.put("shit", 0);
    swearWords.put("fucker", 0);
    swearWords.put("fuckstick", 0);
    swearWords.put("asshole", 0);
    swearWords.put("dick", 0);
    swearWords.put("piss", 0);
    swearWords.put("cunt", 0);

    try {
      Path filePath = Paths.get(filename);
      List<String> content = Files.readAllLines(filePath);
      content.remove(".");
      content.remove(",");
      for (String line : content) {
        words = line.split(" ");
      }
      for (String word : words) {
        for (String key : swearWords.keySet()) {

            if (word.equals(key)) {
              int value = swearWords.get(key);
              //swearWords.put(key, n);
              value++;
              swearWords.put(key, value);


          }
        }
      }
      for (int number : swearWords.values()) {
        sum += number;
      }
    } catch (IOException e) {
      System.out.println("Cannot read file.");
    }
    return sum;
  }
}