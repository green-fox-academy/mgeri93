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
    int[][] expected = {{4, 8, 4, 4}, {2, 4, 2, 2}, {4, 12, 4, 40}, {2, 2, 2, 20}};
    int[][] matrix = {{2, 4, 2, 2,}, {2, 4, 2, 2}, {2, 6, 2, 20}, {2, 2, 2, 20}};
    assertArrayEquals(expected, MultiplyMatrix.multiply(matrix));
  }

  @Test
  public void testOnOddNumbersOnly() {
    MultiplyMatrix multiplyMatrix = new MultiplyMatrix();
    int[][] expected = {{1, 1, 1, 1}, {2, 10, 2, 2}, {1, 3, 1, 1}, {2, 2, 2, 10}};
    int[][] matrix = {{1, 1, 1, 1}, {1, 5, 1, 1}, {1, 3, 1, 1}, {1, 1, 1, 5}};
    assertArrayEquals(expected, MultiplyMatrix.multiply(matrix));
  }
}