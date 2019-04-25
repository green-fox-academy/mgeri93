import static org.junit.Assert.*;

import org.junit.Test;

public class AppleTest {

  @Test
  public void getApple() {
    Apple redApple = new Apple("redapple");
    assertEquals("redapple", redApple.getApple());
  }
}