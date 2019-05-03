package Bookshelf;

public class PaperBackBook extends Book {

  int cover = 20;

  public PaperBackBook(){

  }

  public PaperBackBook (String title, String author, int releaseYear, int pageNumber){
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
