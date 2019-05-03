package MostCommonCharacters;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostCommonCharacters {

  public Map mostCommons(String filename) {

    Map<Character, Integer> dictionary = new HashMap();-
    Map<Character, Integer> twoMostCommon = new HashMap<>();
    List values = new ArrayList();

    try {
      Path filePath = Paths.get(filename);
      List<String> content = Files.readAllLines(filePath);
        String contentString = content.toString();
      char[] chars = contentString.toCharArray();
      Arrays.sort(chars);
      chars = Arrays.copyOfRange(chars, 11, 41);

      int n = 1;
      for (int i = 0; i < chars.length; i++) {
        if (!dictionary.containsKey(chars[i])) {
          dictionary.put(chars[i], 1);
        }
        if (i < chars.length - 1) {
          if (chars[i] == chars[i + 1]) {
            n++;
            dictionary.put(chars[i], n);
          } else {
            n = 1;
          }
        }
      }
    } catch (IOException e) {
      System.out.println("Cannot read file.");
    }

    for (int value : dictionary.values()) {
      values.add(value);
    }
    Collections.sort(values);
    for (char character : dictionary.keySet()) {
      if (dictionary.get(character).equals(values.get(values.size() - 1))) {
        twoMostCommon.put(character, (int) values.get(values.size() - 1));
      }
      if (dictionary.get(character).equals(values.get(values.size() - 2))) {
        twoMostCommon.put(character, (int) values.get(values.size() - 2));
      }
    }
    return twoMostCommon;
  }
}
