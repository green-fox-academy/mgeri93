public class Matrix {
  public static void main(String[] args){
    // - Create (dynamically) a two dimensional array
    //   with the following matrix. Use a loop!
    //
    //   1 0 0 0
    //   0 1 0 0
    //   0 0 1 0
    //   0 0 0 1
    //
    // - Print this two dimensional array to the output

    int a = 4;
    int b = 4;

    int[][] matrix = new int[a][b];
    for (int i = 0; i < a; i++){
      for (int j = 0; j < b; j++){
        if (i == j){
          matrix[i][j] = 1;
          System.out.print(matrix[i][j]);
        } else {
          matrix[i][j] = 0;
          System.out.print(matrix[i][j]);
        }
      }
      System.out.println();
    }
  }
}