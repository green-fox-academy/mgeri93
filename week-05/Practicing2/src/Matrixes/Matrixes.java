package Matrixes;

import java.util.Arrays;

public class Matrixes {

  public static void main(String[] args) {
    int[][] matrix1 = new int[][]{{2, 1}, {0, 1}};
    int[][] matrix2 = new int[][]{{0, 3}, {-1, 1}};

    System.out.println(Arrays.deepToString(getGreater(matrix1, matrix2)));

  }

  public static int[][] getGreater(int[][] matrix1, int[][] matrix2) {
    int[][] greaters = new int[matrix1.length][matrix2.length];
    for (int i = 0; i < matrix1.length; i++) {
      for (int j = 0; j < matrix2.length; j++) {
        if (matrix1[i][j] > matrix2[i][j]) {
          greaters[i][j] = matrix1[i][j];
        } else {
          greaters[i][j] = matrix2[i][j];
        }
      }
    }
    return greaters;
  }

}
