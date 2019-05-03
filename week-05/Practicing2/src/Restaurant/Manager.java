package Restaurant;

public class Manager extends Employee {

  int moodLevel = 400;

  public Manager(String name) {
    super(name);
  }

  @Override
  public void work() {
    this.experience++;
    haveAMeeting();
  }

  public void haveAMeeting() {
    this.moodLevel = this.moodLevel - this.experience;
  }

}
