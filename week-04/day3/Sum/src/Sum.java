import java.util.ArrayList;
import java.util.List;

public class Sum {

  public Integer getSum(List<Integer> integers) {
    Integer sum = 0;
    for (Integer i : integers) {
      sum = sum + i;
    }
    return sum;
  }

}
