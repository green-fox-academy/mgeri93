public class DividByZero {
  public static void  main(String[] args){
    // Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0
    divideTen(0);
  }

  public static void divideTen (int n){
    try{
      int result = 10 /n;
      System.out.println(result);
    }
    catch (ArithmeticException e){
      System.out.println("fail");
    }
  }
}
