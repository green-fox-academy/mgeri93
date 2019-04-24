package main.java.music;

public class ElectricGuitar extends StringedInstrument {

  public ElectricGuitar(){
    this.numberOfStrings = 6;
  }

  public ElectricGuitar(int numberOfStrings) {
    this.numberOfStrings = numberOfStrings;
  }

  @Override
  public void play() {
    System.out.println("Electric Guitar, a " + this.numberOfStrings + "-stringed instrument that goes Twang");
  }
}


