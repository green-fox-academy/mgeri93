import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class UniqueNumbersTest {



  @Test
  public void getUnique() {
    UniqueNumbers uniqueNumbers;
    uniqueNumbers = new UniqueNumbers();
    List<Integer> expected = new ArrayList();
    expected.add(1);
    expected.add(4);
    expected.add(2);
    int[][] matrix ={{1, 1}, {4, 2}};

    assertEquals(expected,UniqueNumbers.getUnique(matrix));
  }
}