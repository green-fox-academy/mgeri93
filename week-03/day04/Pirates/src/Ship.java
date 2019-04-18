import java.util.List;

public class Ship {
    List<Pirate> pirates;
    


void addPirate(){
  Pirate pirate = new Pirate();
  pirates.add(pirate);
}

  void fillShip(){
    for(int i = 0; i < 1 + (int)(Math.random() * 200); i++){
      addPirate();
    }
  }

}
