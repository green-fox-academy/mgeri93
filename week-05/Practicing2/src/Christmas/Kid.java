package Christmas;

public class Kid {

  String name;
  int age;
  boolean isGood;
  boolean isHappy = false;



  public Kid(String name, int age, boolean isGood) {
    this.name = name;
    this.age = age;
    this.isGood = isGood;
  }

  public void getGift(){
    this.isHappy = true;
  }

  public String introduce(){
    if (this.isHappy){
      return "My name is " + this.name + ", I am " + this.age + " years old. I am happy!";
    } else {
      return"My name is " + this.name + ", I am " + this.age + " years old. I am not happy!";
    }
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public boolean isGood() {
    return isGood;
  }

  public boolean isHappy() {
    return isHappy;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setGood(boolean good) {
    isGood = good;
  }

  public void setHappy(boolean happy) {
    isHappy = happy;
  }
}
