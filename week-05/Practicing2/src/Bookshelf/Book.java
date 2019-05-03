package Bookshelf;

import java.sql.Struct;

public class Book {

  String title;
  String author;
  int releaseYear;
  int pageNumber;
  int weight;

  public Book (String title, String author, int releaseYear ){
    this.title = title;
    this.author = author;
    this.releaseYear = releaseYear;
  }

  public Book() {

  }

  public String toString() {
    return author + ", " + title + ", " + releaseYear;
  }


  public void setTitle(String title) {
    this.title = title;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public void setReleaseYear(int releaseYear) {
    this.releaseYear = releaseYear;
  }

  public void setPageNumber(int pageNumber) {
    this.pageNumber = pageNumber;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }


  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public int getReleaseYear() {
    return releaseYear;
  }

  public int getPageNumber() {
    return pageNumber;
  }

  public int getWeight() {
    return weight;
  }

}
