import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import org.junit.Before;
import org.junit.Test;

public class CountLettersTest {

  CountLetters hash;

  @Before
  public void setup() {
    hash = new CountLetters();
  }

  @Test
  public void counter() {
    String input = "alabama";
    Map<Character, Integer> expected = new HashMap<>();
    expected.put('a', 4);
    expected.put('b', 1);
    expected.put('l', 1);
    expected.put('m', 1);
    Map actual = hash.counter(input);

    assertEquals(expected, actual);
    //assertThat(actual, is(expected));


  }
}