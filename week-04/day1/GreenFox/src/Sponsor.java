public class Sponsor extends Person {

  String company;
  int hiredStudents;

  void introduce(){
    System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " who represents "
            + company + " and hired " + hiredStudents + " students so far.");
  }

  int hire(){
    hiredStudents++;
    return  hiredStudents;
  }

  void getGoal(){
    System.out.println("Hire brilliant junior software developers.");
  }

  Sponsor(String name, int age, String gender, String company){
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.company = company;
    this.hiredStudents = 0;
  }

  Sponsor(){
    this.name = "Jane Doe";
    this.age = 30;
    this.gender = "Female";
    this.company = "Google";
    this.hiredStudents = 0;
  }

}
