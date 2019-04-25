public abstract class Animal {



  String name;
  int age;
  String gender;
  boolean nocturnal;
  String coveredBy;
  int numOfLegs;

  public int getNumOfLegs() {
    return numOfLegs;
  }


  public String getName() {
    return name;
  }

  public abstract String breed();
  public abstract String move();
  public abstract String eat();



}
