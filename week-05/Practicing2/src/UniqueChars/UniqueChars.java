package UniqueChars;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniqueChars {

  public static void main(String[] args) {
    // Create a function called `uniqueCharacters` that takes a string as parameter
    // and returns a list with the unique letters of the given string
    // Create basic unit tests for it with at least 3 different test cases
    System.out.println(uniqueCharacters("anagram"));
    // Should print out:
    // ["n", "g", "r", "m"]

  }

  public static List uniqueCharacters(String input) {
    List uniques = new ArrayList();

    Map letterCounter = new HashMap();
    char[] letters = input.toCharArray();
    for (char letter : letters) {
      if (!letterCounter.containsKey(letter)) {
        letterCounter.put(letter, 0);
      } else {
        letterCounter.put(letter, 1);
      }
    }

    for (Object key : letterCounter.keySet()) {
      if (letterCounter.get(key).equals(0)) {
        uniques.add(key);
      }
    }
    return uniques;
  }
}
    /*for (int i = 0; i < input.length(); i++) {
      char current = input.charAt(i);
      if (!uniques.contains(current)) {
        uniques.add(current);
      }
    }*/
