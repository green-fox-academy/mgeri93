package SymmetricMatrix;

public class SymmetricMatrix {

  public static void main(String[] args) {

    int matrix[][] = {{1, 0, 1}, {0, 2, 2}, {1, 2, 5}};
    System.out.println(isSymmetric(matrix));
  }

  public static boolean isSymmetric(int matrix[][]) {
    int n = matrix.length;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (matrix[i][j] != matrix[j][i]) {
          return false;
        }
      }
    }
    return true;
  }
}

