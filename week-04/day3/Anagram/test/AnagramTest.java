import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AnagramTest {

  Anagram text;


  @Before
  public void setup(){
    text = new Anagram();
  }

  @Test
  public void areAnagrams() {
    String s1 = "stop";
    String s2 = "spot";
    boolean result = text.areAnagrams(s1,s2);
    boolean expect = true;
    assertEquals(expect, result);
  }
  @Test
  public void notAnagrams() {
    String s1 = "shop";
    String s2 = "spot";
    boolean result = text.areAnagrams(s1,s2);
    boolean expect = false;
    assertEquals(expect, result);
  }


}