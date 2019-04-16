public class GreatestCommonDivisor {

  public static void  main(String[] args){
    //Find the greatest common divisor of two numbers using recursion.


    System.out.println(commonDivisor(6,4));

    }
    public static int commonDivisor(int a, int b){
    if ( b == 0){
      return a;
    }else {
      return commonDivisor(b, a %b);
    }
    }



}
