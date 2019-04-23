public class Mentor extends Person {

  String level;

  void getGoal(){
    System.out.println("Educate brilliant junior software developers.");
  }

  void introduce(){
    System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " " + level + " mentor.");
  }

  Mentor(String name, int age, String gender, String  level){
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.level = level;
  }

  Mentor(){
    this.name = "Jane Doe";
    this.age = 30;
    this.gender = "Female";
    this.level = "Intermediate";
  }




}
