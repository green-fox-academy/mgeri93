package main.java.music;

public class BassGuitar extends StringedInstrument{

  public BassGuitar(){
    this.numberOfStrings = 4;
  }

  public BassGuitar(int numberOfStrings){
    this.numberOfStrings = numberOfStrings;
  }

  @Override
  public void play() {
    System.out.println("Bass Guitar, a " + this.numberOfStrings + "-stringed instrument that goes Duum-duum-duum");
  }
}
