import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class SumTest {

  Sum sumObj;

  @Before
  public void setup() {
    sumObj = new Sum();
  }

  @Test
  public void sumMore() {
    List<Integer> integers = new ArrayList<>();
    integers.add(1);
    integers.add(2);
    integers.add(100);
    int expect = 103;
    int actual = sumObj.getSum(integers);
    assertEquals(expect, actual);
  }

  @Test
  public void sumOne(){
    List<Integer> integers = new ArrayList<>();
    integers.add(100);
    int expect = 100;
    int actual = sumObj.getSum(integers);
    assertEquals(expect, actual);
  }

  @Test
  public void sumEmpty(){
    List<Integer> integers = new ArrayList<>();
    int expect = 0;
    int actual = sumObj.getSum(integers);
    assertEquals(expect, actual);
  }

  @Test
  public void sumNull(){
    List<Integer> integers = new ArrayList<>();
    int expect = null;
    int actual = null;
    assertEquals(expect, actual);
}