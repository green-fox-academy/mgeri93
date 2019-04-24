package main.java.music;

public class Violin extends StringedInstrument {

  public Violin(){
    this.numberOfStrings = 4;
  }

  @Override
  public void play() {
    System.out.println("Violin, a " + this.numberOfStrings + "-stringed instrument that goes Screech");
  }
}
