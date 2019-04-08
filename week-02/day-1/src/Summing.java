public class Summing {
  // Create the usual class wrapper and main method on your own.

// Write a function called `sum` that returns the sum of numbers from zero to the given parameter

  static int sum = 0;
  public static void main (String[] args){
  System.out.print(addElements(10));
}
  public static int addElements (int a) {
  for (int i = 0; i <= a; i++){
    sum += i;
  }
  return sum;
}


}
