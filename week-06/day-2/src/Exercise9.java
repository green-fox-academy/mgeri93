import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise9 {
  public static void main(String[] args) {
  /*  Write a Stream Expression to find the frequency of characters in a given string!*/

    String text = "hello there";

    Map<String, Long> letterCount = Arrays.stream(text.replaceAll(" ", "").split(""))
        .collect(Collectors.groupingBy(c-> c, Collectors.counting()));

    System.out.println(letterCount);

  }
}
