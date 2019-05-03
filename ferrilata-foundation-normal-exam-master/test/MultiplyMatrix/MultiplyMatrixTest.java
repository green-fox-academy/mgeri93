package MultiplyMatrix;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultiplyMatrixTest {

  @Test
  public void main() {
  }

  @Test
  public void testOnEvenNumbersOnly() {
    MultiplyMatrix multiplyMatrix = new MultiplyMatrix();
    int[][] expected = {{4, 4, 4, 4}, {2, 2, 2, 2}, {4, 4, 4, 4}, {2, 2, 2, 2}};
    int[][] matrix = {{2, 2, 2, 2,}, {2, 2, 2, 2}, {2, 2, 2, 2,}, {2, 2, 2, 2}};
    assertArrayEquals(expected, MultiplyMatrix.multiply(matrix));
  }

  public void testOnOddNumbersOnly() {
    MultiplyMatrix multiplyMatrix = new MultiplyMatrix();
    int[][] expected = {{1, 1, 1, 1,}, {2, 2, 2, 2}, {1, 1, 1, 1,}, {2, 2, 2, 2}};
    int[][] matrix = {{1, 1, 1, 1,}, {1, 1, 1, 1}, {1, 1, 1, 1,}, {1, 1, 1, 1}};
    assertArrayEquals(expected, MultiplyMatrix.multiply(matrix));
  }

}