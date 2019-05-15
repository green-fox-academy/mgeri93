import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import javax.xml.stream.events.Characters;

public class Exercises {

  public static void main(String[] args) {
    //List<Integer> myList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    // solving it with good old for loop
   /* for (int i = 0; i < myList.size(); i++) {
      if (myList.get(i) > 3) {
        System.out.println(myList.get(i));
      }
    }

    // solving it with magic
    myList.stream().filter(x -> x > 3).forEach(System.out::println); */



    /* Write a Stream Expression to get the even numbers from the following list:*/

    List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

    List<Integer> evenNumbers = Arrays.asList();
    numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList())
        .forEach(System.out::println);


    /*Write a Stream Expression to get the squared value of the positive numbers from the following list:*/

    List<Integer> numbers2 = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

    List<Integer> positiveSquares = numbers2.stream().filter(x -> x > 0).map(x -> x * x)
        .collect(Collectors.toList());
    System.out.println(positiveSquares);


    /* Write a Stream Expression to find which number squared value is more then 20 from the following list:*/

    List<Integer> numbers3 = Arrays.asList(3, 9, 2, 8, 6, 5);

    numbers3.stream().filter(n -> n * n > 20).forEach(System.out::println);

    /* Write a Stream Expression to get the average value of the odd numbers from the following list:*/

    List<Integer> numbers4 = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

    numbers4.stream()
        .filter(n -> n % 2 != 0)
        .mapToInt(n -> n)
        .average()
        .ifPresent(n -> System.out.println(n));

    /* Write a Stream Expression to get the sum of the odd numbers in the following list:*/

    List<Integer> numbers5 = Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2);

    int sumOdds = numbers5.stream()
        .filter(n -> n % 2 != 0)
        .mapToInt(n -> n)
        .sum();

    System.out.println(sumOdds);


    /*  Write a Stream Expression to find the uppercase characters in a string!*/

    String text = "hEEllOOO";
    text.chars()
        .filter(c -> Character.isUpperCase(c))
        .mapToObj(c -> Character.toString((char) c))
        .forEach(System.out::print);


    /* Write a Stream Expression to find the strings which starts with a given letter(as parameter), in the following list:*/

    List<String> cities = Arrays
        .asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM",
            "ABU DHABI", "PARIS");

    System.out.println(startingCharacter("A",cities));


  }

  public static List<String> startingCharacter(String input, List<String> cities) {
    return cities.stream()
        .filter(w -> w.startsWith(input))
        .collect(Collectors.toList());
  }
}

