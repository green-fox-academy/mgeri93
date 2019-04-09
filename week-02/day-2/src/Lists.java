import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class Lists {
  public static void main(String[] args){

    ArrayList<String> names = new ArrayList<>();
    System.out.println(names.size());

    names.add("William");
    if (names.isEmpty()){
      System.out.println("The list is empty");
    } else {
      System.out.println("The list is not empty");
    }

    names.add("John");
    names.add("Amanda");
    System.out.println(names.size());
    System.out.println(names.get(2));

    for ( String i : names){
      System.out.println(i);
    }
    //for(int i = names.size() - 1; i >= 0; i--)

    int j = 1;
    for ( String i : names){
      System.out.println(j + ". " + i );
      j++;
    }
    names.remove(1);

    Collections.reverse(names);
    for ( String i : names) {
      System.out.println(i);
    }
    names.removeAll(names);
    System.out.println(names);
  }
  }
