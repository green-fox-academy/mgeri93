package Bookshelf;

public class HardCoverBook extends Book {

  int cover = 100;

  public HardCoverBook(){

  }

  public HardCoverBook (String title, String author, int releaseYear, int pageNumber){
    this.title = title;
    this.author = author;
    this.releaseYear = releaseYear;
    this.pageNumber = pageNumber;
  }

  @Override
  public int getWeight() {
   this.weight = (this.pageNumber * 10) + this.cover;
    return this.weight;
  }
}
