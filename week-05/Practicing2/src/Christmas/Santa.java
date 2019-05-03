package Christmas;

import java.util.List;

public class Santa {

  String name;
  int age;
  int numberOfGifts = 100;

  public Santa(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String introduce() {
    if (this.numberOfGifts > 0) {
      return "My name is " + this.name + ", I am " + this.age + " years old. I have "
          + numberOfGifts + " gifts in my bag.";
    } else {
      return "My name is " + this.name + ", I am " + this.age
          + " years old. I do not have any gifts in my bag.";
    }
  }

  public int assignGifts(List<Kid> school) {
    int counter = 0;
    for (Kid kid : school) {
      if (this.numberOfGifts > 0 && kid.isGood) {
        kid.getGift();
        this.numberOfGifts--;
        counter++;
      }
    }
    return counter;
  }

}
