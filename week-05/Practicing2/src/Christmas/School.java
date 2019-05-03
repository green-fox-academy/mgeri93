package Christmas;

import java.util.List;

public class School {

  List<Kid> school;

  public void enroll(Kid kid){
    school.add(kid);
  }

  public void haveChristmas(Santa santa){
    santa.assignGifts(school);
  }

}
