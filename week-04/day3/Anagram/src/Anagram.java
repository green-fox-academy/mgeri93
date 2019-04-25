import java.util.Arrays;

public class Anagram {

  boolean areAnagrams(String string1, String string2) {
    int length1 = string1.length();
    int length2 = string2.length();

    if (length1 != length2) {
      return false;
    }

    char[] chars1 = string1.toCharArray();
    char[] chars2 = string2.toCharArray();

    Arrays.sort(chars1);
    Arrays.sort(chars2);

    for (int i = 0; i < chars1.length; i++) {
      if (chars1[i] != chars2[i]) {
        return false;
      }
    }
    return true;
  }
}
