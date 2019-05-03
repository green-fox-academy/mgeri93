import java.util.ArrayList;
import java.util.List;

public class UniqueNumbers {

  public static void main(String[] args) {
    List uniques = new ArrayList();
    int[][] matrix = {{4, 3, -1},{10, 2, 5},{-2, 3, 4}};
    System.out.println(getUnique(matrix));

  }

  public static List getUnique(int[][] matrix) {
    List uniques = new ArrayList();


    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix.length; j++) {
        int current = matrix[i][j];
        if (!uniques.contains(current)) {
          uniques.add(current);
        }
      }
    }
    return  uniques;
  }

}
