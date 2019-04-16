public class Palindrome {
  public static void main(String[] args){
    System.out.println(palindromer("greenfox"));
  }
  public static String palindromer(String n){
    int x = n.length();
    if (n.length() <=1){
      return n;
    } else {
      return (palindromer(n) + n.substring(0,n.length() -1));
    }
  }
}
