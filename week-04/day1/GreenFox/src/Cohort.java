import java.util.List;

public class Cohort {
  String name;
  List<Student> students;
  List<Mentor> mentors;

  List addStudent(Student student){
    students.add(student);
    return students;
  }

  List addMentor(Mentor mentor){
    mentors.add(mentor);
    return mentors;
  }

  void info(){
    System.out.println("The " + name + " cohort has " + students.size() + " students and " + mentors.size() + " mentors.");
  }

  Cohort(String name){
    this.name = name;
    this.mentors.isEmpty();
    this.students.isEmpty();
  }

}
