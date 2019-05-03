package MultiplyMatrix;

public class MultiplyMatrix {

public static void  main(String[] args){


}

/*  Write a method that takes a matrix as a parameter.

  The function should:

  multiply each even number by 2 in each even indexed row
  multiply each odd number by 2 in each odd indexed row*/


  public static int[][] multiply(int[][] matrix) {
    int[][] multiplied = new int[matrix.length][matrix.length];
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix.length; j++) {
        if ((i % 2 == 0 && matrix[i][j] % 2 == 0) || (i % 2 != 0 && matrix[i][j] % 2 != 0)) {
          multiplied[i][j] = 2 * matrix[i][j];
        } else {
          multiplied[i][j] = matrix[i][j];
        }
      }
    }
    return multiplied;
  }

}
