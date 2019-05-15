import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise8 {

  public static void main(String[] args) {
    /* Write a Stream Expression to concatenate a Character list to a string!
     */
    List<Character> characters = Arrays.asList('h', 'e', 'l', 'l', 'o');
    System.out.println(concatenate(characters));
  }

  public static String concatenate(List<Character> chars) {
    String word = chars.stream()
        .map(c -> c.toString())
        .collect(Collectors.joining());
    return word;
  }
}
