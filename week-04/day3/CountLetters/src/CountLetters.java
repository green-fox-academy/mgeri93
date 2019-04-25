import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountLetters {

  Map<Character, Integer> dictionary = new HashMap();


  public Map counter(String text) {
    char[] chars = text.toCharArray();
    Arrays.sort(chars);

    int n = 1;
    for (int i = 0; i < chars.length; i++) {
      if (!dictionary.containsKey(chars[i])) {
        dictionary.put(chars[i], 1);
      }
      if (i < chars.length - 1) {
        if (chars[i] == chars[i + 1]) {
          n++;
          dictionary.put(chars[i], n);
        }
      }
    }
    return dictionary;
  }


}
