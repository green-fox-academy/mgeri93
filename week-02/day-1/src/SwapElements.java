public class SwapElements {
  public static void main(String[] args){
    // - Create an array variable named `abc`
//   with the following content: `["first", "second", "third"]`
// - Swap the first and the third element of `abc`
    String[] abc = {"first", "second", "third"};
    String c = "";
    c = abc[0];
    abc[0] = abc[2];
    abc[2] = c;

    for ( String text : abc)
    System.out.println(text);
  }
}
