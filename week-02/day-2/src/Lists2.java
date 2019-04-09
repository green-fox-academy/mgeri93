import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class Lists2 {
  public static void  main(String[] args){
    List listA = new ArrayList<>();
    listA.add("Apple");
    listA.add("Avocado");
    listA.add("Blueberries");
    listA.add("Durian");
    listA.add("Lychee");

    List listB = new ArrayList<>();
    listB.addAll(listA);

    if (listA.contains("Durian")) {
      System.out.println("List A contains Durian.");
    } else {
      System.out.println("List A does not contain Durian.");
    }
    listB.remove("Durian");
    listA.add(4, "Kiwifruit");
    if (listA.size() > listB.size()){
      System.out.println("List A has more elements.");
    } else if (listA.size() < listB.size()){
      System.out.println("List B has more elements.");
    } else {
      System.out.println("The lists have the same amount of elements");
    }
    System.out.println(listA.indexOf("Avocado"));
    System.out.println(listB.indexOf("Durian"));

    List listTemp = new ArrayList<>();
    listTemp.add("Passion Fruit");
    listTemp.add("Pummelo");

    listB.addAll(listTemp);
    System.out.println(listB);
    System.out.println(listA.get(2));
  }
}
