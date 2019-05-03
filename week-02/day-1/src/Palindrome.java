public class Palindrome {

  public static void main(String[] args) {
    System.out.println(createPalindrome("greenfox"));
  }

  public static String createPalindrome(String text) {
    String txet = "";
    for (int i = text.length() - 1; i >= 0; i--) {
      txet += text.charAt(i);
    }
    return text += txet;
  }
}
