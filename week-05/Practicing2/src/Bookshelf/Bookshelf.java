package Bookshelf;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bookshelf {

  public List<Book> bookShelf;

  public void addHardCoverBook() {
    bookShelf.add(new HardCoverBook());
  }

  public void addPaperBackBook() {
    bookShelf.add(new PaperBackBook());
  }

  public void addBook(Book book) {
    bookShelf.add(book);
  }



}
