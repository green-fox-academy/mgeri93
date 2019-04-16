public class SumDigit {
  public static void main(String[] args){
    //Given a non-negative int n, return the sum of its digits recursively (no loops).
    // Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
    System.out.println(digitSummer(500));
  }
  public static  int digitSummer(int n){
    if ( n == 0){
      return 0;
    } else { int i =(n % 10);
      return i + digitSummer(n/10) ;
    }
  }
}
