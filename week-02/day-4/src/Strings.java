public class Strings {

  public static void main(String[] args){
    //Given a string, compute recursively (no loops) a new string
    // where all the lowercase 'x' chars have been changed to 'y' chars.

    System.out.println(changer("xxzzyy"));
  }
  public static String changer(String n){
    int i = n.length();
    char c = n.charAt(i);
    if (i == 0) {
      return n;
    } else if (c =='x'){
      c = 'y';
      i -= 1;
      return n;
    } else {
      i -= 1;
      return n;
    }
  }
}
