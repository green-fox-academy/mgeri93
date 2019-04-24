public class Gnirts implements CharSequence {

  String string;

  public Gnirts(String string){
    this.string = string;

  }

  @Override
  public int length() {
    return 0;
  }

  @Override
  public char charAt(int index) {
    String gnirts = "";
    for ( int i = this.string.length()-1; i >= 0; i--){
      gnirts += this.string.charAt(i);
    }
    return gnirts.charAt(index);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return subSequence(end,start);
  }
}
