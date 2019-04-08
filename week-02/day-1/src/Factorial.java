public class Factorial {
  //  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial
  static int factorial = 1;
  public static void main (String[] args){
    System.out.println(factorio(4));

  }
  public static int factorio(int a){
    for (int i = 1; i <= a; i++){
      factorial *= i;
    }
    return factorial;
  }
}
