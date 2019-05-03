package Bookshelf;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookMain {
  Map authorPages = new HashMap();



  public static void main(String[] args) {

    List<Object> bookShelf = new ArrayList<>();

    Book hcBook1 = new HardCoverBook("cím1", "Aladár", 2000, 100);
    Book hcBook2 = new HardCoverBook("cím2", "Béla", 2001, 200);
    Book pbBook3 = new PaperBackBook("cím3", "Aladár", 2002, 209);
    Book pbBook4 = new PaperBackBook("cím4", "Béla", 2003, 107);

    bookShelf.add(hcBook1);
    bookShelf.add(hcBook2);
    bookShelf.add(pbBook3);
    bookShelf.add(pbBook4);

    System.out.println(pbBook3.getWeight());
    System.out.println(pbBook3.toString());

  }
}
