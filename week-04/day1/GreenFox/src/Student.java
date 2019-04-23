public class Student extends Person {

  String previousOrganization;
  int skippedDays;

  void getGoal() {
    System.out.println("Be a junior software developer.");
  }

  void introduce() {
    System.out.println("Hi, I'm " + name + ", a " + age + "year old " + gender + " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
  }

  int skipDays(int numberOfDays) {
    skippedDays += numberOfDays;
    return skippedDays;
  }

  Student( String name, int age, String gender, String previousOrganization){
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.previousOrganization = previousOrganization;
    this.skippedDays = 0;
  }

  Student(){
    this.name = "Jane Doe";
    this.age = 30;
    this.gender = "Female";
    this.previousOrganization = "School of life";
    this.skippedDays = 0;
  }


}
