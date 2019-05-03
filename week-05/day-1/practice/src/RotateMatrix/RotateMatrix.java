package RotateMatrix;

import java.util.Arrays;

public class RotateMatrix {

  public static void main(String[] args) {

    int matrix[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
    System.out.println(Arrays.deepToString(rotateMatrix(matrix)));

  }

  public static int[][] rotateMatrix(int matrix[][]) {
    int n = matrix.length;
    int[][] rotated = new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        rotated[i][j] = matrix[n - j - 1][i];
      }
    }
    return rotated;
  }
}
